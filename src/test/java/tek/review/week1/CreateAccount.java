package tek.review.week1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

    public class CreateAccount {

        public static void main(String[] args) throws InterruptedException {

            WebDriver driver = new ChromeDriver();
            Thread.sleep(3000);

            // driver.manage().window().maximize();
            driver.get("https://retail.tekschool-students.com/");

            By signInBtn = By.id("signinLink");
            WebElement signBtn = driver.findElement(signInBtn);
            signBtn.click();

            By accountBtnCreate = By.id("newAccountBtn");
            WebElement foundNewAccBtn = driver.findElement(accountBtnCreate);
            foundNewAccBtn.click();

            By nameInput = By.id("nameInput");
            WebElement insertName = driver.findElement(nameInput);
            insertName.sendKeys("MrUnique");


            By emailInput = By.id("emailInput");
            WebElement insertEmail = driver.findElement(emailInput);
            insertEmail.sendKeys("Mr.Unique@tekschool.us");


            By passwordInput = By.id("passwordInput");
            WebElement insertPass = driver.findElement(passwordInput);
            insertPass.sendKeys("1992@1992hA");


            By confirmPasswordInput = By.id("confirmPasswordInput");
            WebElement insertPassConfirm = driver.findElement(confirmPasswordInput);
            insertPassConfirm.sendKeys("1992@1992hA");


            By signupBtn = By.id("signupBtn");
            WebElement btnForSignUp = driver.findElement(signupBtn);
            btnForSignUp.click();

            By profileImage = By.id("profileImage");
            WebElement imageIsDisplay = driver.findElement(profileImage);
            imageIsDisplay.isDisplayed();

            if (imageIsDisplay.isDisplayed()) {
                System.out.println("Test Passed");
            } else System.out.println("Test has Failed");
        }
    }
