import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Launchbrowser {
    WebDriver driver;
    public void Browserchrome(){

        System.setProperty("webdriver.chrome.driver","src/main/resources/Drivers/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90));
    }

    public void Openurl(String url){
        driver.get(url);

    }
    public boolean Verifyelement(By locatortype){
        return driver.findElement(locatortype).isDisplayed();
    }

    public void Clickelement(By locator){
        driver.findElement(locator).click();
    }

    public void Entertext(By locator,String text){
        driver.findElement(locator).sendKeys(text);
    }
    public void Switchtonewwindow(){
        ArrayList<String> Windows=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(Windows.get(1));
    }


}
