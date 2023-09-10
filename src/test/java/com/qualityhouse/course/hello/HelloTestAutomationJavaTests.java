/*
  Author: Predrag Skokovic, Quality House
  Date: 22.09.2021.
*/

package com.qualityhouse.course.hello;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HelloTestAutomationJavaTests {

    @Test
    public void hello_ecomm_site() {

        // Optional, modify browser to the one that suites your environment

        WebDriver driver = WebDriverManager.chromedriver().create();

        driver.get("https://acme.qualityhouse.com/build1/index.php?page=login");

        String pageTitle = driver.getTitle();

        driver.close();

        Assert.assertEquals(pageTitle, "ACME ECOMM | Login", "This is not Login page!");

        System.out.println("\nThe test environment is ready for test automation course!");
    }

}
