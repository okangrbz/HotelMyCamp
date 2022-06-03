package tests;

import org.apache.hc.core5.util.Asserts;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCamp;
import utilities.ConfigReader;
import utilities.Driver;

public class PositiveTest {

   /*
    1 ) Bir Class olustur : PositiveTest
    2) Bir test method olustur positiveLoginTest()
    https://www.hotelmycamp.com/ adresine git
    login butonuna bas
    test data username: manager ,
    test data password : Manager1!
    Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
*/
   HotelMyCamp hmc=new HotelMyCamp();

    @Test
    public void positiveLoginTest() {


        Driver.getWebDriver().get(ConfigReader.getpropertie("hmcUrl"));
        hmc.login.click();
        hmc.usernames.sendKeys(ConfigReader.getpropertie("hmcUsernameValid"));
        hmc.Password.sendKeys(ConfigReader.getpropertie("hmcPassValid"));
        hmc.ikinciLogin.click();

        Assert.assertTrue(hmc.kullaniciIsmi.isDisplayed());
        Driver.closDriver();









    }
}
