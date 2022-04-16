package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

    private static WebDriver driver = null;

    public static WebDriver getDriver(){

        if (driver == null){
            System.setProperty("webdriver.chrome.driver", "./\\src\\main\\java\\chromedriver.exe");


            driver = new ChromeDriver();
            driver.manage().window().fullscreen();


        }

        return driver;
    }

    public void getWaitBrowser(){

        try{
            driver.wait(1500);
        }catch (InterruptedException e){
            e.printStackTrace();
        }


    }

    public void getQuitDriver(){

        if(driver != null){
            driver.quit();
        }

    }
}
