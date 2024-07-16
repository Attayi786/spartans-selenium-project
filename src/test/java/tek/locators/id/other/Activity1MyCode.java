package tek.locators.id.other;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity1MyCode {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        // driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");

        By signInBtn = By.id("signinLink");
        WebElement signBtn = driver.findElement(signInBtn);
        signBtn.click();
        Thread.sleep(1000);


        By CreateNewAccountLocator = By.linkText("Create New Account");
        WebElement CreateNewAccount = driver.findElement(CreateNewAccountLocator);
        CreateNewAccount.click();

        By nameInputLocator = By.name("name");
        WebElement typeName = driver.findElement(nameInputLocator);
        typeName.sendKeys("SnowLeopard");

        driver.findElement(By.name("email")).sendKeys("SnowLeopard@gmail.com");

        driver.findElement(By.name("password")).sendKeys("Password@999");

        driver.findElement(By.name("confirmPassword")).sendKeys("Password@999");

        driver.findElement(By.id("signupBtn")).click();

        String errorText = driver.findElement(By.className("error")).getText();

        System.out.println(errorText);

        driver.quit();


    }
}
