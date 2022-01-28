package com.testinium.page;

import com.testinium.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class PointPage {
   Methods methods;
    Logger logger= LogManager.getLogger(PointPage.class);

   public PointPage(){
       methods=new Methods();
    }

    public void Selection(){
        methods.click(By.xpath("//div[@class='lvl1catalog']"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//img[@title='Puan Kataloğundaki Türk Klasikleri']"));
        methods.waitBySeconds(2);
        methods.selectByText(By.xpath("//*[@class='sort']/select"),"Yüksek Oylama");
        methods.waitBySeconds(2);
        methods.hover(By.xpath("//*[@class=\"mn-strong common-sprite\" and contains(text(),'Tüm Kitaplar')]"));
        methods.waitBySeconds(5);
        methods.click(By.xpath("//*[@class='mn-icon icon-angleRight' and contains(text(),'Hobi')]"));
        methods.waitBySeconds(5);
        methods.randomSelect(By.xpath("//a[@class=\"pr-img-link\"]"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//span[contains(text(),'Sepete Ekle')]"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//div[@class=\"menu top my-list\"]"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//a[contains(text(),'Favorilerim')]"));
        methods.waitBySeconds(2);
        methods.click(By.id("cart-items"));
        methods.waitBySeconds(2);
        methods.click(By.id("js-cart"));






    }
}
