package org.vamsi.seleniumframework.utils;

import org.vamsi.seleniumframework.constants.FrameworkConstants;
import org.vamsi.seleniumframework.enums.ConfigProperties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public final class ConfigLoader

{

    private ConfigLoader() {
    }

    private final static Properties properties = new Properties();
    private static Map<String, String> CONFIG_MAP = new HashMap<>();


    static {
        Map<String, String> tempMap = new HashMap<>();
        try (FileInputStream file = new FileInputStream(FrameworkConstants.getConfigResourcePath())){
            properties.load(file);
            for (Map.Entry<Object, Object> entry : properties.entrySet()) {
                tempMap.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()).trim());
            }
        } catch (IOException e) {
            throw new RuntimeException("Failed to load config.properties", e);
        }
        CONFIG_MAP = Collections.unmodifiableMap(tempMap);
    }

    public static String getValueFromConfigMap(ConfigProperties key) throws Exception
    {
       if(Objects.isNull(key) || Objects.isNull(CONFIG_MAP.get(key)))
       {
           throw new Exception("The property named : " + key + " is not found. Please check the config.properties file");
       }

       return CONFIG_MAP.get(key.name().toLowerCase());
    }


}
