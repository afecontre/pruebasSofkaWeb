package co.com.certification.testing.util;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class Users {
    public Map<String, User> users;

    public static class User {
        public String username;
        public String password;
    }
    public static Users fromJsonFile(String filePath) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(new File(filePath), Users.class);
    }
}
