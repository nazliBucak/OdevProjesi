package com.testinium.test;

import com.testinium.driver.BasePage;
import com.testinium.page.FavoriteDeletePage;
import org.junit.Test;

public class FavoriteTest extends BasePage {
    @Test
    public void favoritePage(){

        FavoriteDeletePage favoritesPage =new FavoriteDeletePage();
        favoritesPage.favoriteDelete();
    }
}
