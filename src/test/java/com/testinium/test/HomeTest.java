package com.testinium.test;

import com.testinium.driver.BasePage;
import com.testinium.page.HomePage;
import org.junit.Test;

public class HomeTest extends BasePage {

    @Test
    public void homeTest(){
        HomePage homePage =new HomePage();
        homePage.home();
    }
}
