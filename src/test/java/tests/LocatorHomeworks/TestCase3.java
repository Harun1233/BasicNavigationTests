package tests.LocatorHomeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.BrowserFactory;

public class TestCase3 {
    public static void main(String[] args) {
        WebDriver driver= BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://wikipedia.org");
        WebElement search=driver.findElement(By.id("searchInput"));
        search.sendKeys("selenium webdriver");
        driver.findElement(By.xpath("//i[@class='sprite svg-search-icon']")).click();
        driver.findElement(By.xpath("//a[@href='/wiki/Selenium_(software)']")).click();
        String currentUrl = driver.getCurrentUrl();

        int a=currentUrl.indexOf('S');
        if(currentUrl.substring(a).equals("Selenium_(software)")){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
    driver.quit();
    }
}
