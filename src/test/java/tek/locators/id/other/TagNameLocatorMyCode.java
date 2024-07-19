package tek.locators.id.other;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TagNameLocatorMyCode {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bbc.com/");

        By buttonTag = By.tagName("button");
        List<WebElement> buttonElements = driver.findElements(buttonTag);
        System.out.println(buttonElements.size());





    }
}
