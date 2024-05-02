package co.com.certification.testing.util;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class SystemData {

    private static Map<String, Object> map = new HashMap<>();

    public static Map<String, Object> getData() {
        return map;
    }

    public static void setData(Map<String, Object> testData) {
        map = testData;
    }

    private SystemData(){
    }

}