package co.com.certification.testing.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class RenameDownloadedFile {

    public static void rename(String downloadPath, String newFileName) {
        File dir = new File(downloadPath);
        File[] files = dir.listFiles((dir1, name) -> name.endsWith(".tmp"));
        if (files != null && files.length > 0) {
            File downloadedFile = files[0];
            try {
                Files.move(downloadedFile.toPath(), Paths.get(downloadPath + "/" + newFileName), StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
