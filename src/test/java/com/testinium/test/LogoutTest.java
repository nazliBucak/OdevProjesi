package com.testinium.test;

import com.testinium.driver.BasePage;
import com.testinium.page.LogoutPage;
import org.junit.Test;

public class LogoutTest extends BasePage {
    @Test
    public void logOutTest(){
        LogoutPage logOutPage = new LogoutPage();
        logOutPage.logout();
    }
}
