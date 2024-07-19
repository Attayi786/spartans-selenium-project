package tek.review.week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Activity1MyCode {


    public static void main(String[] args) throws InterruptedException {



        WebDriver driver = new ChromeDriver();
        Thread.sleep(3000);
        // driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");

        By signInLocator = By.id("signinLink");
        WebElement signInElement = driver.findElement(signInLocator);
        signInElement.click();

        By emailInputLocator = By.id("email");
        WebElement emailInputElement = driver.findElement(emailInputLocator);

        emailInputElement.sendKeys("hamed.attayi@tekschool.us");

        By passwordLocator = By.id("password");
        WebElement passwordElement = driver.findElement(passwordLocator);
        passwordElement.sendKeys("Qwerty@1992");

        By loginBtnLocator = By.id("loginBtn");
        WebElement loginBtnElement = driver.findElement(loginBtnLocator);
        loginBtnElement.click();

        // Thread.sleep(1000);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.findElement(By.id("accountLink")).click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

        // Thread.sleep(1000);

        // driver.findElement(By.id("personalPhoneInput")).sendKeys("123123");

        driver.findElement(By.id("personalPhoneInput")).sendKeys("123123");






    }
}
