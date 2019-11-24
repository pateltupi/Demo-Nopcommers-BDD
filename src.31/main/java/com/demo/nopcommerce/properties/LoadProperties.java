package com.demo.nopcommerce.properties;/*
 * Created By Trupti Patel on 1/5/2019.
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadProperties {
    static Properties prop;

    static FileInputStream input;

    public String getProperty(String key) {
        prop = new Properties();

        try {
            input = new FileInputStream("/Users/surajbharmal/IdeaProjects/sample-demo-nopcommerce-bdd-project/src/test/java/resources/propertise/config.properties");
            prop.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }
}
