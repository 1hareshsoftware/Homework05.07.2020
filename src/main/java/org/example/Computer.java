package org.example;

import org.openqa.selenium.By;

import static org.example.Utils.utils.*;


public class Computer extends Utils{

    private By Computer=By.xpath("//a[@href='/computers']");
    private By Desktop=By.cssSelector("h2 [title='Show products in category Desktops']");
    private By clickOnFirstProduct = By.cssSelector("a [title='Show details for Build your own computer']");
    private By addYourReview = By.cssSelector("div[class='product-review-links'] a:nth-child(3)");
    private By reviewTitle = By.id("AddProductReview_Title");
    private By reviewText = By.id("AddProductReview_ReviewText");
    private By rating = By.id("addproductrating_3");
    private By submitReview = By.cssSelector("div[class='buttons'] input");
    private By EmailaFriend = By.cssSelector("div[class='email-a-friend']");
    private By FriendaEmail = By.id("FriendEmail");
    String emailTimestamp = "Test"+ timeStamp()+"@gmail.com";
    //private By youremailaddress= By.id("YourEmailAddress");
    private By Personalmessage = By.id("PersonalMessage");
    private By SendEmail =By.cssSelector("div[class='buttons']");

    public void Computer(){
        ClickOnElement(Computer);
        ClickOnElement(Desktop);
        ClickOnElement(clickOnFirstProduct);

    }

    public void addReview(){
        ClickOnElement(addYourReview);
        enterText(reviewTitle, "Gift");
        enterText(reviewText,"This gift for u");
        ClickOnElement(rating);
        ClickOnElement(submitReview);
    }

    public void EmailaFriend() {
        ClickOnElement(EmailaFriend);
        enterText(FriendaEmail, "abcdefg@gmail.com");
        //enterText(youremailaddress, "hijklm@gmail.com");
        enterText(Personalmessage, "hope you and your family well");
        ClickOnElement(SendEmail);


    }



}