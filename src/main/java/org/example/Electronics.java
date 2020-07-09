package org.example;


import org.openqa.selenium.By;

import static org.example.BasePage.driver;
import static org.example.Utils.utils.ClickOnElement;

public class Electronics {
    private By Electronics = By.xpath("//ul[@class='top-menu notmobile']/li[2]");
    private By Camera = By.cssSelector("a [title='Show products in category Camera & photo']");
    private By Compair = By.cssSelector("div [class='buttons'] input:nth-child(2)");
    private By LastProduct = By.cssSelector("div.product-grid > div > div:nth-child(3) > div >  div.details > div.add-info > div.buttons > input.button-2.add-to-compare-list-button");
    private By Camparison = By.cssSelector("div [class='bar-notification success'] a");
    private By Clearlist = By.cssSelector("[class='clear-list']");
    private By AddtoCart = By.cssSelector("input[class='button-2 product-box-add-to-cart-button']");
    private By addtoCarttwo = By.cssSelector("div[class='add-to-cart-panel'] input:nth-child(3)");
    private By ShoppingCart = By.cssSelector("div [id='topcartlink'] span:nth-child(2)");
    private By TermsofService = By.className("[name='termsofservice']");
    private By Checkout = By.cssSelector("div[id='checkout']");




    public void Electronics() throws InterruptedException {
        ClickOnElement(Electronics);
        Thread.sleep(4000);
        ClickOnElement(Camera);
        ClickOnElement(Compair);

    }

    public void Lastproduct() {
        ClickOnElement(Electronics);
        ClickOnElement(Camera);
        ClickOnElement(LastProduct);
        ClickOnElement(Camparison);
        ClickOnElement(Clearlist);
    }

    public void CameraPhoto () throws InterruptedException {
        ClickOnElement(Electronics);
        ClickOnElement(Camera);
        ClickOnElement(AddtoCart);
        Thread.sleep(4000);
        ClickOnElement(addtoCarttwo);
        ClickOnElement(ShoppingCart);
        ClickOnElement(TermsofService);
        ClickOnElement(Checkout);
    }

}
