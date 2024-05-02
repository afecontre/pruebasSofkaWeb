package co.com.certification.testing.util;

import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.util.store.FileDataStoreFactory;
import com.google.api.services.gmail.Gmail;
import com.google.api.services.gmail.GmailScopes;
import com.google.api.services.gmail.model.ListMessagesResponse;
import com.google.api.services.gmail.model.Message;
import com.google.api.services.gmail.model.MessagePart;
import com.google.api.client.extensions.jetty.auth.oauth2.LocalServerReceiver;
import com.google.api.client.extensions.java6.auth.oauth2.AuthorizationCodeInstalledApp;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.GeneralSecurityException;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GmailApiUtil {

    private static final String APPLICATION_NAME = "automatizacion";
    private static final JsonFactory JSON_FACTORY = JacksonFactory.getDefaultInstance();
    private static final List<String> SCOPES = Collections.singletonList(GmailScopes.GMAIL_READONLY);
    private static final String TOKENS_DIRECTORY_PATH = "tokens";

    public static Credential authorize() throws IOException, GeneralSecurityException {
        InputStream in = GmailApiUtil.class.getResourceAsStream("/credentials.json");
        GoogleClientSecrets clientSecrets = GoogleClientSecrets.load(JSON_FACTORY, new InputStreamReader(in));

        GoogleAuthorizationCodeFlow flow = new GoogleAuthorizationCodeFlow.Builder(
                GoogleNetHttpTransport.newTrustedTransport(), JSON_FACTORY, clientSecrets, SCOPES)
                .setDataStoreFactory(new FileDataStoreFactory(new java.io.File(TOKENS_DIRECTORY_PATH)))
                .setAccessType("offline")
                .build();

        LocalServerReceiver receiver = new LocalServerReceiver.Builder().setPort(8181).build();
        return new AuthorizationCodeInstalledApp(flow, receiver).authorize("user");
    }

    public static Gmail getGmailService() throws IOException, GeneralSecurityException {
        Credential credential = authorize();
        return new Gmail.Builder(GoogleNetHttpTransport.newTrustedTransport(), JSON_FACTORY, credential)
                .setApplicationName(APPLICATION_NAME)
                .build();
    }

    public static String getLatestResetPasswordLink(String userId) throws IOException, GeneralSecurityException {
        Gmail service = getGmailService();
        ListMessagesResponse response = service.users().messages().list(userId)
                .setQ("is:unread subject:UAT Reset Password Request from:support@uat-landgorilla.com")
                .setMaxResults(1L)
                .execute();

        if (response.getMessages().isEmpty()) {
            System.out.println("No hay mensajes no leídos con los criterios dados.");
            return null;
        }

        String messageId = response.getMessages().get(0).getId();
        Message message = service.users().messages().get(userId, messageId).setFormat("full").execute();

        // Inicia la búsqueda del cuerpo del mensaje
        String emailData = getPlainTextFromMessagePart(message.getPayload());
        if (emailData == null || emailData.isEmpty()) {
            System.out.println("El correo no tiene cuerpo de texto o no se pudo decodificar.");
            return null;
        }

        Pattern pattern = Pattern
                .compile("https://system\\.uat-landgorilla\\.com//reset-password2\\.html\\?\\S+?(?=</a><br)");
        Matcher matcher = pattern.matcher(emailData);

        if (matcher.find()) {
            return matcher.group();
        } else {
            System.out.println("No se encontró el enlace de restablecimiento de contraseña en el correo.");
            return null;
        }
    }

    private static String getPlainTextFromMessagePart(MessagePart part) {
        if (part.getMimeType().equals("text/plain") && part.getBody().getData() != null) {
            return new String(Base64.getUrlDecoder().decode(part.getBody().getData()));
        } else if (part.getMimeType().equals("text/html") && part.getBody().getData() != null) {
            return new String(Base64.getUrlDecoder().decode(part.getBody().getData()));
        } else if (part.getParts() != null) {
            for (MessagePart subPart : part.getParts()) {
                String result = getPlainTextFromMessagePart(subPart);
                if (result != null && !result.isEmpty()) {
                    return result;
                }
            }
        }
        return null; // Si no se encuentra texto plano o HTML, retorna nulo
    }
}
