package com.testinium.page;

import com.testinium.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

public class ProductSearchPage {

    Methods methods;
    Logger logger= LogManager.getLogger(ProductSearchPage.class);
    public ProductSearchPage(){

        methods=new Methods();

    }
    public void ScrollAndSelect(){

        methods.sendKeys(By.id("search-input"),"oyuncak");
        methods.waitBySeconds(4);
        methods.click(By.cssSelector(".common-sprite.button-search"));
        methods.scrollWithAction(By.xpath("//a[contains(text(),'Güncelle')]"));
        methods.waitBySeconds(4);
      //  methods.randomSelect(By.xpath("//a[@class=\"add-to-favorites\"]"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//div[@class=\"menu top my-list\"]"));
        methods.waitBySeconds(4);
        methods.click(By.xpath("//a[contains(text(),'Favorilerim')]"));
        methods.waitBySeconds(4);









    }

}
