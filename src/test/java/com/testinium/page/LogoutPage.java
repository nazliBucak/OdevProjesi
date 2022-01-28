package com.testinium.page;

import com.testinium.methods.Methods;
import org.openqa.selenium.By;

public class LogoutPage {
    Methods methods;

    public LogoutPage(){
        methods = new Methods();

    }
    public void logout(){
        methods.scrollWithAction(By.xpath("//a[@class=\"common-sprite\" and text()='Merhaba ']"));
        methods.click(By.xpath("//a[contains(text(),'Çıkış')]"));

    }
}
