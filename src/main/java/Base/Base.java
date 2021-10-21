package Base;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base {
    static WebDriver webDriver=new ChromeDriver();
    @Before
    //Main Setup Method
    public void SetUp(){
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-notifications");
        options.addArguments("disable-popup-blocking");
        webDriver.navigate().to("https://www.n11.com/");
        webDriver.manage().window().maximize();
    }
    public static WebDriver getWebDriver(){
        return webDriver;
    }
    public static void setWebDriver(WebDriver webDriver){
        Base.webDriver = webDriver;
    }
    public void ShutDown(){
        getWebDriver().quit();
    }
}
