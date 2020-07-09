package org.example;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import static org.example.Utils.utils.ClickOnElement;

public class TestSuite extends BrowserSetup {
    HomePage homepage = new HomePage();
    Register registerpage = new Register();
    Computer computer = new Computer();
    Electronics electronics = new Electronics();

    @Test
    public void OpenHomepage() throws InterruptedException {

        homepage.clickOnRegister();
        // homepage.getTextofRegister();
        String registersuccesfully = driver.findElement(By.className("page-title")).getText();
        Assert.assertEquals(registersuccesfully, "Register");
        System.out.println("user able to register successfully");
        registerpage.personalDetails();
    }

    @Test

    public void logOut() throws InterruptedException {
        homepage.clickOnRegister();
        registerpage.personalDetails();
        // registerpage.logOut();
        String welcomeMessage = driver.findElement(By.cssSelector("div[class='topic-block-title' ] h2")).getText();
        Assert.assertEquals(welcomeMessage, "Welcome to our store");
        System.out.println("user able to logout successfully");
    }

    @Test
    public void searchfield() {

        homepage.searchField();
    }

    @Test
    public void SelectEuroCurrency() {
        homepage.SelectEuroCurrency();
    }

    @Test
    public void giftcard() {
        homepage.giftcard();
    }


    @Test
    public void Computer() {
        computer.Computer();
        String desktop = driver.findElement(By.cssSelector("div[class='page-title'] h1")).getText();
        Assert.assertEquals(desktop, "Desktops");
        System.out.println("User successfully on desktops page");

    }

    @Test
    public void addReview() throws InterruptedException {
        homepage.clickOnRegister();
        registerpage.personalDetails();
        Thread.sleep(4000);
        computer.Computer();
        computer.addReview();
        String review = driver.findElement(By.cssSelector("div[class='result']")).getText();
        Assert.assertEquals(review, "Product review is successfully added.");
        System.out.println("User added the review");
    }

    @Test
    public void emileaFriend() throws InterruptedException {
        homepage.clickOnRegister();
        registerpage.personalDetails();
        Thread.sleep(4000);
        computer.Computer();
        computer.EmailaFriend();
        String EmailaFriend = driver.findElement(By.cssSelector("div[class='result']")).getText();
        Assert.assertEquals(EmailaFriend, "Your message has been sent.");
        System.out.println("User has send an Emial successfully");

    }

    @Test
    public void Electronics() throws InterruptedException {
        electronics.Electronics();
        Thread.sleep(4000);
    }

    @Test
    public void Lastproduct() throws InterruptedException {
        electronics.Electronics();
        electronics.Lastproduct();
        Thread.sleep(4000);
        String clearlist = driver.findElement(By.cssSelector("div[class='no-data']")).getText();
        Assert.assertEquals(clearlist, "You have no items to compare.");
        System.out.println("User able to clear a list successfully");

    }

    @Test
    public void CameraPhoto() throws InterruptedException {
        electronics.Electronics();
        electronics.CameraPhoto();

    }


}


