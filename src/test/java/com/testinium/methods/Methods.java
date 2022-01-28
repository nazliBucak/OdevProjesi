package com.testinium.methods;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

import com.testinium.driver.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;


import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;

public class Methods {

    WebDriver driver;
    FluentWait<WebDriver> wait;
    JavascriptExecutor jsdriver;

    public Methods() {

        driver = BasePage.driver;
        wait = new FluentWait<WebDriver>(driver);
        wait.withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(300))
                .ignoring(NoSuchElementException.class);

        jsdriver = (JavascriptExecutor) driver;

    }

    public WebElement findElement(By by) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));


    }

    private List<WebElement> findElements(By by) {
        return (List<WebElement>) wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public void click(By by) {
        findElement(by).click();
    }



    public void waitBySeconds(long seconds) {

        try {
            Thread.sleep(1500);

        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public boolean isElementVisible(By by) {
        try {
            wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void sendKeys(By by, String text) {
        findElement(by).sendKeys(text);

    }


    public void scrollWithAction(By by) {

        Actions actions = new Actions(driver);
        actions.moveToElement(findElement(by)).build().perform();

    }

    public void scrollWithJavaScript(By by) {
        jsdriver.executeScript("arguments[0].scrollIntoView();", findElement(by));

    }


    public Select getSelect(By by) {
        return new Select(findElement(by));
    }

    public void selectByText(By by, String text) {
        getSelect(by).selectByVisibleText(text);

    }

    public String getAttribute(By by, String attributeName) {

        return findElement(by).getAttribute(attributeName);

    }

    public String getText(By by) {

        return findElement(by).getText();

    }

    public String getValue(By by) {
        return jsdriver.executeScript("return arguments[0].value", findElement(by)).toString();
    }

    public void hover(By by) {
        Actions action = new Actions(driver);
        WebElement web = driver.findElement(by);
        action.moveToElement(web).build().perform();
    }
    public void clear(By by){
        findElement(by).clear();}

    public List<WebElement> findToAll(By by) {
        return driver.findElements(by);

    }

    public void randomSelect(By by) {
        Random random = new Random();
        findToAll(by).get(random.nextInt(findToAll(by).size())).click();

    }
}


