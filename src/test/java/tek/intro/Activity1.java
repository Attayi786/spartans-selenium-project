package tek.intro;

import org.openqa.selenium.chrome.ChromeDriver;

public class Activity1 {

    public static void main(String[] args) {

        ChromeDriver fbDriver = new ChromeDriver();
        fbDriver.get("https://www.facebook.com/");
        String title = fbDriver.getTitle();
        System.out.println(title);


        // fbDriver.quit();

    }
}
