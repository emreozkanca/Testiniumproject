import Base.Base;
import Base.MetotPage;
import org.junit.Assert;

public class ControlCheck extends Base {
    MetotPage metotPage = new MetotPage(getWebDriver());
    // Second Page Check Method
    public  void PageCheck(){
        String URL = getWebDriver().getCurrentUrl();
        Assert.assertEquals(URL, "https://www.n11.com/arama?q=bilgisayar&pg=2" );
    }
    //Equal Value Check Method
    public void ValueCheck(){
       MetotPage Basketprice= metotPage.Basketgettext();
        MetotPage Pageprice= metotPage.Pagegettext();
        Pageprice.equals(Basketprice);
    }
    //İs this basket Emty Method
    public void BasketCheck(){

        metotPage.Isempty();
    }
    //Enterance Check Method
    public void LoginCheck(){
        metotPage.LoginBTNın().İsselected();
    }
}
