package tek.locators.id.other;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity2 {

    /*
    In google.com search for TekSchool and Click on First Link that have TekSchool.

    Hint. to click on first link you can use partialLinkText locator strategy

     */

    // if it didn't work the link that appears might be different. Hamed

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        driver.findElement(By.name("q")).sendKeys("Tekschool");

        Thread.sleep(1000);

        driver.findElement(By.name("btnK")).click();

        Thread.sleep(2000);
        driver.findElement(By.partialLinkText("TEK SCHOOL Modern")).click();


    }
}
