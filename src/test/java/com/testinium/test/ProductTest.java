package com.testinium.test;

import com.testinium.driver.BasePage;
import com.testinium.page.HomePage;
import com.testinium.page.LoginPage;
import com.testinium.page.ProductSearchPage;
import org.junit.Test;

public class ProductTest extends BasePage {
    @Test
    public void ProductTest(){

        ProductSearchPage productSearchPage=new ProductSearchPage();
        productSearchPage.ScrollAndSelect();

    }




}
