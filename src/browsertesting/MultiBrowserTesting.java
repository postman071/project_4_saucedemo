package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTesting {
    static String browser="Chrome";

    static String baseUrl="https://www.saucedemo.com/";

    static WebDriver driver;          // Driver Declaration or Global Declaration

    public static void main(String[] args)
    {
        if(browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver =new FirefoxDriver();

        } else if (browser.equalsIgnoreCase("Edge")) {
            driver =new EdgeDriver();

        }else{
            System.out.println("Wrong Browser name");
        }
        // Open URL into Browser
        driver.get(baseUrl);
        // Maximise Browser
        driver.manage().window().maximize();
        // We give Implicit wait to Driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Print the Title of the page
        String Title= driver.getTitle();
        System.out.println("Print the Title :" +Title);
        //Print the Current URl
        System.out.println("Current URL"+driver.getCurrentUrl());
        //Print the page source
        String pageSource= driver.getPageSource();
        // Enter the Username field name Username
        driver.findElement(By.name("user-name")).sendKeys("Prime123@gmail.com");
        //Enter the Password to PasswordField
        driver.findElement(By.id("password")).sendKeys("prime123");
        //Close the Browser
        driver.close();
    }
}
