package com.testinium.test;

import com.testinium.driver.BasePage;
import com.testinium.page.LoginPage;
import org.junit.Test;

public class LoginTest extends BasePage {

    @Test
    public void loginTest(){
        LoginPage loginPage = new LoginPage();
        loginPage.login();
    }
}
