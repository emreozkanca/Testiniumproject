package Base;

import org.openqa.selenium.WebDriver;

import static Base.ConstantVariable.*;

public class MetotPage extends MainBase {

    public MetotPage(WebDriver driver){
        super(driver);
    }
//All Method Main Page
    public MetotPage Sıngın(){
        click(SING);
        return this;
    }
    public MetotPage EMAİLın() {
        sendKeys(EMAİL,"zibincizibin@gmail.com");
        return this;
    }
    public MetotPage PASSWORDın() {
        sendKeys(PASSWORD,"Zibinci1.");
        return this;
    }
    public MetotPage LoginBTNın() {
       click(LOGİNBTN);
        return this;
    }
    public MetotPage Searchın(){
        sendKeys(SEARCH,"bilgisayar");
        return this;
    }
    public MetotPage Searchbtnın(){
        click(SRCHBTN);
        return this;
    }
    public MetotPage Pageın(){
        click(PAGE);
        return this;
    }
    public MetotPage Productın(){
        RandomProduct();
        return this;
    }
    public MetotPage Basketın(){
        click(BASKET);
        return this;
    }
    public MetotPage Basketbtnın(){
        click(BASKETBTN);
        return this;
    }
    public MetotPage ADDın(){
        click(ADD);
        return this;
    }
    public MetotPage Pop(){
        click(POP);
        return this;
    }
    public MetotPage DELETEın() {
        click(DELETE);
        return this;
    }
    public MetotPage İsselected(){
        İsSelected(DELETE);
        return this;
    }
    public MetotPage Pagegettext(){
        getText(PAGEPRİCE);
        return this;
    }
    public MetotPage Basketgettext(){
        getText(BASKETPRİCE);
        return this;
    }
    public MetotPage Isempty(){
        Isempty(ISEMPTY);
        return this;
    }

}
