package com.testinium.page;

import com.testinium.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

public class BasketPage {
    Methods methods;
    Logger logger = LogManager.getLogger(PointPage.class);

    public BasketPage() {
        methods = new Methods();
    }

    public void basket() {


        methods.clear(By.xpath("//input[@value=\"1\"]"));
        methods.waitBySeconds(7);
        methods.sendKeys(By.xpath("//input[@value=\"1\"]"),"2");
        methods.waitBySeconds(7);
        methods.randomSelect(By.xpath("//a[@class='button red']"));
        methods.waitBySeconds(7);
        methods.click(By.xpath("//a[@onclick=\"setShippigAddressType('new')\"]"));
        methods.waitBySeconds(7);
        methods.sendKeys(By.id("address-firstname-companyname"),"Nazlı Hilal");
        methods.sendKeys(By.id("address-lastname-title"),"Bucak");
        methods.selectByText(By.id("address-zone-id"),"İstanbul");
        methods.waitBySeconds(7);
        methods.selectByText(By.id("address-county-id"),"KAĞITHANE");
        methods.waitBySeconds(7);
        methods.sendKeys(By.xpath("//input[@id=\"district\"]"),"YEŞİLCE MAH");
        methods.waitBySeconds(7);
        methods.click(By.xpath("//div[contains(text(),'YEŞİLCE MAH')]"));
        methods.waitBySeconds(7);
        methods.sendKeys(By.id("address-address-text"),"Dalgın Sokak No7/4");
        methods.waitBySeconds(7);
        methods.sendKeys(By.id("address-postcode"),"34418");
        methods.waitBySeconds(7);
        methods.sendKeys(By.id("address-telephone"),"5536266173");
        methods.waitBySeconds(7);
        methods.sendKeys(By.id("address-mobile-telephone"),"5536266173");
        methods.waitBySeconds(7);
        methods.click(By.id("button-checkout-continue"));
        methods.waitBySeconds(80);
        methods.click(By.id("button-checkout-continue"));
        methods.waitBySeconds(80);
        methods.sendKeys(By.id("credit-card-owner"),"Nazlı Hilal Bucak");
        methods.sendKeys(By.id("credit_card_number_1"),"5262");
        methods.waitBySeconds(7);
        methods.sendKeys(By.id("credit_card_number_2"),"9015");
        methods.waitBySeconds(7);
        methods.sendKeys(By.id("credit_card_number_3"),"2996");
        methods.waitBySeconds(7);
        methods.sendKeys(By.id("credit_card_number_4"),"7284");
        methods.waitBySeconds(7);
        methods.selectByText(By.id("credit-card-expire-date-month"),"01");
        methods.waitBySeconds(7);
        methods.selectByText(By.id("credit-card-expire-date-year"),"2026");
        methods.waitBySeconds(7);
        methods.sendKeys(By.id("credit-card-security-code"),"850");
        methods.waitBySeconds(7);
        methods.click(By.id("button-checkout-continue"));
        methods.waitBySeconds(7);
        methods.click(By.xpath("//input[@type=\"checkbox\"]"));
        methods.waitBySeconds(7);
        methods.click(By.xpath("//input[@value=\"Siparişi Onaylayın\"]"));
        Assert.assertTrue(methods.isElementVisible(By.xpath("//div[contains(text(),'Kredi kartınızın limiti yetersizdir.')]")));
        methods.waitBySeconds(7);
        methods.click(By.cssSelector(".checkout-logo"));


    }
}
