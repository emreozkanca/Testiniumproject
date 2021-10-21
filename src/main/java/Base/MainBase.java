package Base;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;

public class MainBase {
    WebDriver driver = null;
    WebDriverWait wait = null;
    public MainBase(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver,60);
    }
    //find Element Method
    public WebElement findElement(By by){
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        return driver.findElement(by);
    }
    //Send Keys Method
    public  void sendKeys(By by, String text){
        findElement(by).sendKeys(text);
    }
    //İsSelected Method
    public  void İsSelected(By by){
        findElement(by).isSelected();
    }
    //Click Method
    public  void click(By by){
        wait.until(ExpectedConditions.elementToBeClickable(by));
        findElement(by).click();
    }
    //gettext Method
    public void getText(By by){
        findElement(by).getText();
    }
    //Random Product Method
    public void RandomProduct(){
        Random random = new Random();

        List<WebElement> Products = driver.findElements(ConstantVariable.PRODUCT);
        int Productnumber = Products.toArray().length;
        WebElement ProductSelect = Products.get(random.nextInt(Productnumber));
        wait.until(ExpectedConditions.visibilityOf(ProductSelect));
        ProductSelect.click();

    }
    //İsEmty Check Method
    public void Isempty(By by){
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        } catch (TimeoutException e){
            Assert.fail("Bu eleman bulunamadı");
        }
    }


}
