    package BasePage;

    import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.chrome.ChromeDriver;
    import org.openqa.selenium.remote.Browser;
    import org.openqa.selenium.support.ui.ExpectedConditions;
    import org.openqa.selenium.support.ui.WebDriverWait;

    import java.time.Duration;
    import java.util.List;
    import java.util.Set;

    public class BasePage {

        public By email = By.name("email");
        public By password = By.name("password");
        public By loginButton = By.xpath("//span[@role='button']");
        public By waitElement = By.id("email");
//        public String Url = "https://uatv2-dashboard.dev.aioapp.com/home";
        public By Message = By.xpath("//p[@class='MuiTypography-root MuiTypography-body1 mui-vk2eg2']");


//        public void goTODash(WebDriver Browser) {
//            Browser.get(Url);
//        }

        public void setEmail(WebDriver Browser) {
            Browser.findElement(email).sendKeys("dash.auto@aioapp.com");
        }

        public void setPassword(WebDriver Browser) {
            Browser.findElement(password).sendKeys("Test@1234");
        }

        public void setLoginButton(WebDriver Browser) {
            Browser.findElement(loginButton).click();
        }


        public void waitForSuccessMessage(WebDriver browser, WebDriverWait wait) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(Message));
        }

        public void waitForElementToDisappear(WebDriver browser, WebDriverWait wait) {
            wait.until(ExpectedConditions.invisibilityOfElementLocated(waitElement));
        }

        public void loginWebDash(WebDriver driver, WebDriverWait wait) {
//            goTODash(driver);
            setEmail(driver);
            setPassword(driver);
            setLoginButton(driver);
            waitForSuccessMessage(driver, wait);
            waitForElementToDisappear(driver, wait);
        }

    }
