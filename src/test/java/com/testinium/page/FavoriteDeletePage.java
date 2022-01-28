package com.testinium.page;

import com.testinium.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

public class FavoriteDeletePage {
    Methods methods;
    Logger logger = LogManager.getLogger(PointPage.class);

    public void FavoriteDeletePage() {
        methods = new Methods();
    }

    public void favoriteDelete() {

        methods.click(By.id("cart-items"));
        methods.waitBySeconds(2);
        methods.click(By.id("js-cart"));


    }
}
