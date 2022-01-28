package com.testinium.page;

import com.testinium.methods.Methods;
import org.junit.Assert;
import org.openqa.selenium.By;


public class LoginPage {
    Methods methods;
    public LoginPage(){
        methods=new Methods();
    }
    public void login(){

        methods.click(By.xpath("//a[contains(text(),'Giriş Yap')]"));
        methods.waitBySeconds(5);
        methods.sendKeys(By.id("login-email"), "nazlihilal.bucak@testinium.com");
        methods.waitBySeconds(5);
        methods.sendKeys(By.id("login-password"), "naber123");
        methods.waitBySeconds(5);
        methods.click(By.xpath("//button[contains(text(),'Giriş Yap')]"));
        methods.waitBySeconds(5);
        Assert.assertTrue(methods.isElementVisible(By.xpath("//h1[contains(text(),'Hesabım')]")));




    }
}
