package pages;

import driver.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage extends DriverFactory {

    public WebDriver createDriver(){

        return getDriver();
    }



}
