package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class DriverClass {

    public DriverClass(WebDriver driver) {
        this.driver = driver;
    }

    public static WebDriver driver;

    public static void InitialiseDriver()
    {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public static void QuitDriver()
    {
        if (driver != null)
            driver.quit();
    }
}

