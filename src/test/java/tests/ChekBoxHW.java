package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BrowserFactory;

import java.util.List;
import java.util.Random;

public class ChekBoxHW {

    @Test
    public void test1() throws InterruptedException {
        WebDriver driver= BrowserFactory.getDriver("chrome");
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");

        WebElement userNameInbox=driver.findElement(By.cssSelector("#ctl00_MainContent_username"));
        userNameInbox.sendKeys("Tester");

        WebElement passwordInbox = driver.findElement(By.cssSelector("#ctl00_MainContent_password"));
        passwordInbox.sendKeys("test");

        Thread.sleep(2000);

        WebElement loginButton= driver.findElement(By.cssSelector("#ctl00_MainContent_login_button"));
        loginButton.click();

        Thread.sleep(2000);

        WebElement checkAllButton=driver.findElement(By.cssSelector("#ctl00_MainContent_btnCheckAll"));
        checkAllButton.click();

        Thread.sleep(2000);

        List<WebElement> checkBoxes=driver.findElements(By.cssSelector("input[type='checkbox']"));
        for(int i=0;i<checkBoxes.size();i++){
            Assert.assertTrue(checkBoxes.get(i).isSelected());
        }

        Thread.sleep(2000);

        WebElement uncheckedButton=driver.findElement(By.cssSelector("#ctl00_MainContent_btnUncheckAll"));

        uncheckedButton.click();

        Thread.sleep(2000);


        List<WebElement> checkBoxes1=driver.findElements(By.cssSelector("input[type='checkbox']"));
        for(int i=0;i<checkBoxes.size();i++){
            Assert.assertFalse(checkBoxes1.get(i).isSelected());
        }



        WebElement deletedButton= driver.findElement(By.cssSelector("#ctl00_MainContent_orderGrid_ctl03_OrderSelector"));

        deletedButton.click();

        WebElement textDeletedButton=driver.findElement(By.xpath("(//tr/td)[17]"));
        String DeletedText = textDeletedButton.getText();
        String pageSource1 = driver.getPageSource();
        Assert.assertTrue(pageSource1.contains(DeletedText));


        WebElement DeleteButton=driver.findElement(By.cssSelector("input[value*='Del']"));

        DeleteButton.click();

        String pageSource = driver.getPageSource();

        Assert.assertFalse(pageSource.contains(DeletedText));



       driver.quit();

    }
}
