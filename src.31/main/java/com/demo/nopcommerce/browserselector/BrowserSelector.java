package com.demo.nopcommerce.browserselector;/*
 * Created By Trupti Patel on 1/5/2019.
 */

import com.demo.nopcommerce.basepage.BasePage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserSelector extends BasePage {

    public void selectBrowser(String browser) {
        if (browser.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "/src/test/java/resources/driver/chromedriver");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+ "/src/test/java/resources/driver/geckodriver");
            driver = new FirefoxDriver();
        } //else if (browser.equalsIgnoreCase("ie")) {
           // System.setProperty("webdriver.ie.driver", "resources\\drivers\\IEDriverServer.exe");
           // driver = new InternetExplorerDriver();
        //}
        else {
            System.out.println("Wrong Browser Selected");
        }
    }
}