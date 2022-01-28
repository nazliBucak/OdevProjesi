package com.testinium.test;

import com.testinium.driver.BasePage;
import com.testinium.page.*;
import org.junit.Test;

public class mainTest extends BasePage {
    @Test
    public void mainTest() {
        HomePage homePage = new HomePage();
        homePage.home();
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        ProductSearchPage productPage = new ProductSearchPage();
        productPage.ScrollAndSelect();
        FavoritePage favoritePage = new FavoritePage();
        favoritePage.Selection2();
        PointPage pointPage = new PointPage();
        pointPage.Selection();
        BasketPage basketPage = new BasketPage();
        basketPage.basket();
        LogoutPage logoutPage = new LogoutPage();
        logoutPage.logout();

    }
}

