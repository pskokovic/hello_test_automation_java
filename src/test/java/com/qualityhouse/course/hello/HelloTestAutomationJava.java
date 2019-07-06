/*
  Author: Quality House
  Date: 19.09.2017.
*/

package com.qualityhouse.course.hello;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloTestAutomationJava {

    @Test
    public void hello_ecomm_site() {

        // Optional, if not specified, WebDriver will search your path for chromedriver.
        // System.seProperty("webdriver.chrome.driver", "path to chrome driver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://acme.qualityhouse.com/build1/index.php?page=login");

        String pageTitle = driver.getTitle();

        driver.close();

        Assert.assertEquals("Page is not Home!", "ACME ECOMM | Login", pageTitle);

        System.out.println("\nEnvironment is ready for test automation course!");
    }

}
