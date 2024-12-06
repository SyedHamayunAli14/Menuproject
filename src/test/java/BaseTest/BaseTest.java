package BaseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    WebDriver driver = new ChromeDriver();


    @BeforeMethod
    public void setUp(){
        driver.get("https://uatv2-dashboard.dev.aioapp.com/home");
    }

    @AfterMethod
    public void tearUp() {
        driver.quit();

    }
}
