package org.example;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.net.UrlChecker;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BrowserSetup extends BasePage{

    @Before
    public void openBrowser()
    {
        System.setProperty("webdriver.chrome.driver","src\\Resource\\BrowserDriver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL,"https://demo.nopcommerce.com/");
        System.out.println("User Successfully on Homepage");
    }

    @After
    public void closeBrowser()
    {
        //driver.close();
    }

}
