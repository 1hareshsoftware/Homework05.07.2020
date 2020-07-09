package org.example;

import org.example.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {

    public static class utils extends BasePage {

        //to click on elements
        public static void ClickOnElement(By by) {
            driver.findElement(by).click();
        }

        // to enter text
        public static void enterText(By by, String text) {
            driver.findElement(by).sendKeys(text);
        }

        //to get text from element
        public static String getTextFromElement(By by) {
            return driver.findElement(by).getText();
        }

        //to select from droplist by visible text
        public static void SelectByVisibleText(By by, String name) {
            new Select(driver.findElement(by)).selectByVisibleText(name);

        }

        // to creat timestamp to use in email
        public static String timeStamp() {
            DateFormat format = new SimpleDateFormat("DDMMYYMMSS");
            return format.format(new Date());
        }

        //to creat window onscrolldown page
        //  public static void ClickOnElement(By by) {
        // driver.get(String.valueOf(by)).scrollFunction();click();


    }
}
//}
