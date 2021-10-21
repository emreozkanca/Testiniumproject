package Base;

import org.openqa.selenium.By;
//All cosntant variable
public class ConstantVariable {
    public static final By SING = By.className("btnSignIn");
    public static final By EMAİL = By.id("email");
    public static final By PASSWORD = By.id("password");
    public static final By LOGİNBTN = By.id("loginButton");
    public static final By SEARCH = By.id("searchData");
    public static final By SRCHBTN = By.className("searchBtn");
    public static final By PAGE = By.xpath("/html/body/div[1]/div[3]/div/div/div[2]/div[5]/a[2]");
    public static final By PRODUCT = By.cssSelector(".plink:not([data-isadbidding])");
    public static final By BASKET = By.cssSelector(".btnAddBasket,.addBasketUnify");
    public static final By BASKETBTN = By.className("myBasket");
    public static final By POP = By.xpath("//*[@id=\"userKvkkModal\"]/div/div[2]/span");
    public static final By ADD = By.cssSelector(".spinnerArrow");
    public static final By DELETE = By.cssSelector(".removeProd");
    public static final By PAGEPRİCE = By.className("newPrice");
    public static final By BASKETPRİCE = By.className("priceArea");
    public static final By ISEMPTY = By.className("cartEmptyText");

}
