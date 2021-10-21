import Base.Base;
import Base.MetotPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BaseControl extends Base {
//All test main file
    MetotPage metotPage = new MetotPage(getWebDriver());
    ControlCheck controlCheck = new ControlCheck();
    @Before
    public void before(){
        String URL = getWebDriver().getCurrentUrl();
        Assert.assertEquals(URL, "https://www.n11.com/" );
    }

    @Test
    public void test(){
        //loginPage.Sıngın().EMAİLın().PASSWORDın().LoginBTNın();
        //controlCheck.LoginCheck();
        metotPage.Searchın().Searchbtnın().Pageın();
        controlCheck.PageCheck();
        metotPage.Productın().Basketın().Basketbtnın().Pop();
        controlCheck.ValueCheck();
        metotPage.ADDın().DELETEın();
        controlCheck.BasketCheck();

    }

    @After
    public void after(){
        ShutDown();
    }
}

