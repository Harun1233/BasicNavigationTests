package tests.LocatorHomeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.BrowserFactory;

public class xPathPractices {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        //Home
        String textHome = driver.findElement(By.xpath("//a[@class='nav-link']")).getText();
        System.out.println("textHome = " + textHome);
        //"Forgot Password" Header
        String textForgotPass = driver.findElement(By.xpath("//div[@id='content']/div/h2")).getText();
        System.out.println("textForgotPass = " + textForgotPass);
        //"E-mail" text
        String textEmail = driver.findElement(By.xpath("//label[@for='email']")).getText();
        System.out.println("textEmail = " + textEmail);
        //Input an E-mail
        driver.findElement(By.xpath("//input[@pattern='[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}$']")).sendKeys("mike@mike.com");
       Thread.sleep(3000);
        //Print Retrieve Button text
        String textRetrieveButton = driver.findElement(By.xpath("//i[@class='icon-2x icon-signin']")).getText();
        System.out.println("textRetrieveButton = " + textRetrieveButton);

        driver.quit();


    }
}
