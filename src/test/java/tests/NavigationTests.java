package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import utilities.BrowserFactory;
import utilities.StringUtility;

public class NavigationTests extends StringUtility {
    public static void main(String[] args) throws InterruptedException {
     Chrome();
     Firefox();
     Edge();


    }

    public static void Chrome() throws InterruptedException {

        WebDriver driver= BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://google.com");
        Thread.sleep(2000);
        String titleGoogle = driver.getTitle();
        Thread.sleep(2000);
        driver.navigate().to("https://etsy.com");
        Thread.sleep(2000);
        String titleEtsy = driver.getTitle();
        driver.navigate().back();
        Thread.sleep(2000);
        String titleGoogle2 = driver.getTitle();
        verifyEquals(titleGoogle,titleGoogle2);
        driver.navigate().forward();
        Thread.sleep(2000);
        String titleEtsy2 = driver.getTitle();
        verifyEquals(titleEtsy,titleEtsy2);
        driver.quit();


    }
    public static void Firefox() throws InterruptedException {
        WebDriver driver= BrowserFactory.getDriver("firefox");
        driver.manage().window().maximize();
        driver.get("https://google.com");
        Thread.sleep(2000);
        String titleGoogle = driver.getTitle();
        Thread.sleep(2000);
        driver.navigate().to("https://etsy.com");
        Thread.sleep(2000);
        String titleEtsy = driver.getTitle();
        driver.navigate().back();
        Thread.sleep(2000);
        String titleGoogle2 = driver.getTitle();
        verifyEquals(titleGoogle,titleGoogle2);
        driver.navigate().forward();
        Thread.sleep(2000);
        String titleEtsy2 = driver.getTitle();
        verifyEquals(titleEtsy,titleEtsy2);
        driver.quit();
    }
    public static void Edge() throws InterruptedException {
        WebDriver driver= BrowserFactory.getDriver("edge");
        driver.manage().window().maximize();
        driver.get("https://google.com");
        Thread.sleep(2000);
        String titleGoogle = driver.getTitle();
        Thread.sleep(2000);
        driver.navigate().to("https://etsy.com");
        Thread.sleep(2000);
        String titleEtsy = driver.getTitle();
        driver.navigate().back();
        Thread.sleep(2000);
        String titleGoogle2 = driver.getTitle();
        verifyEquals(titleGoogle,titleGoogle2);
        driver.navigate().forward();
        Thread.sleep(2000);
        String titleEtsy2 = driver.getTitle();
        verifyEquals(titleEtsy,titleEtsy2);
        driver.quit();
    }

}
