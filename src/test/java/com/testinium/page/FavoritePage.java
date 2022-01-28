package com.testinium.page;

import com.testinium.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class FavoritePage {
    Methods methods;
    Logger logger= LogManager.getLogger(ProductSearchPage.class);

    public FavoritePage(){
        methods=new Methods();
    }

    public void Selection2(){

        methods.click(By.xpath("//div[@class='logo-text']"));

    }

}

