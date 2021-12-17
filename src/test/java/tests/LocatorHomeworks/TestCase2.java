package tests.LocatorHomeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.BrowserFactory;

public class TestCase2 {
    public static void main(String[] args) {
        WebDriver driver= BrowserFactory.getDriver("chrome");
        driver.get("https://ebay.com");
        WebElement element=driver.findElement(By.xpath("(//input)[3]"));
        element.sendKeys("selenium");
        driver.findElement(By.id("gh-btn")).click();
        String numberOfResults = driver.findElement(By.xpath("//h1/span[1]")).getText();

        System.out.println("numberOfResults = " + numberOfResults);
        driver.quit();
    }
}
