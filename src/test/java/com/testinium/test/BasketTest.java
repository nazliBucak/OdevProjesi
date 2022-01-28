package com.testinium.test;

import com.testinium.driver.BasePage;

import com.testinium.page.BasketPage;
import org.junit.Test;

public class BasketTest extends BasePage {
    @Test
    public void basketTest() {
        BasketPage basketPage = new BasketPage();
        basketPage.basket();


    }
}
