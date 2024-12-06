package BasePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomeBasePage extends BasePage {
    public By menuManager = By.xpath("//span[normalize-space()='Menu Manager']");
    public By menu = By.xpath("//span[normalize-space()='Menus']");
    public By createMenu=By.xpath("//span[.='Create Menu ']");
    public By menuName =By.name("menuName");
    public By POSName =By.name("posDisplayName");
    public By ButtonColor =By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div/div/div[3]/div/div/input[2]");
    public By Save = By.xpath("//span[@role='button']");
    public By SucessfullMessage =By.xpath("//div[@class='MuiSnackbarContent-message mui-1w0ym84']");



    public void mainMenu (WebDriver Browser){
        Browser.findElement(menuManager).click();
    }
    public void Menu(WebDriver Browser){
        Browser.findElement(menu).click();
    }
    public void setCreateMenu(WebDriver Browser){
        Browser.findElement(createMenu).click();
    }
    public void setMenuName(WebDriver Browser) {
        Browser.findElement(menuName).sendKeys("ABC");
    }
    public void posName(WebDriver Browser){
        Browser.findElement(POSName).sendKeys("Umer");
    }
    public void color(WebDriver Browser){
        Browser.findElement(ButtonColor).sendKeys("#57c4cb");
    }

    public void SaveButton(WebDriver Browser){
        Browser.findElement(Save).click();
    }
    public void SucessFull (WebDriver Browser){
        Browser.findElement(SucessfullMessage).getText();
    }
    public void ForSuccessMessage(WebDriver browser, WebDriverWait wait) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(menuManager));
    }
    public void Formenu(WebDriver browser, WebDriverWait wait) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(menu));
    }

    public void ForCreate(WebDriver browser, WebDriverWait wait) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(createMenu));
    }

    public void ForMenuName(WebDriver browser, WebDriverWait wait) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(menuName));
    }

    public void ColorButton(WebDriver browser, WebDriverWait wait) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(ButtonColor));
    }
    public void setSucessfullMessage(WebDriver browser, WebDriverWait wait) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(SucessfullMessage));
    }
}
