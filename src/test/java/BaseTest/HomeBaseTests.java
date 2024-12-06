package BaseTest;

import BasePage.HomeBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomeBaseTests extends BaseTest{


    HomeBasePage webDash = new HomeBasePage();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    @Test(groups = "smoke")
    public void verifyMenu() {

        webDash.loginWebDash(driver,wait);
        webDash.mainMenu(driver);//*[@id="root"]/div/div[2]/div[2]/div/div[1]/div/div/div[3]/div/div/input[2]
        webDash.Formenu(driver, wait);
        webDash.Menu(driver);
        webDash.ForCreate(driver, wait);
        webDash.setCreateMenu(driver);
        webDash.ForMenuName(driver,wait);
        webDash.posName(driver);
        webDash.setMenuName(driver);
        webDash.ColorButton(driver,wait);
        webDash.color(driver);
        webDash.SaveButton(driver);
        webDash.setSucessfullMessage(driver,wait);
        webDash.SucessFull(driver);

    }

        @Test(groups = "sanity")
        public void verifyMenuSanity() {

            webDash.loginWebDash(driver,wait);
            webDash.mainMenu(driver);//*[@id="root"]/div/div[2]/div[2]/div/div[1]/div/div/div[3]/div/div/input[2]
            webDash.Formenu(driver, wait);
            webDash.Menu(driver);
            webDash.ForCreate(driver, wait);
            webDash.setCreateMenu(driver);
            webDash.ForMenuName(driver,wait);
            webDash.posName(driver);
            webDash.setMenuName(driver);
            webDash.ColorButton(driver,wait);
            webDash.color(driver);
            webDash.SaveButton(driver);
            webDash.setSucessfullMessage(driver,wait);
            webDash.SucessFull(driver);

        }
    }

