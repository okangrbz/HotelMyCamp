package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCamp;
import utilities.ConfigReader;
import utilities.Driver;

public class NegativeTest {
HotelMyCamp hmc=new HotelMyCamp();


    @Test
    public void NegativeTest() {
        Driver.getWebDriver().get(ConfigReader.getpropertie("hmcUrl"));
        hmc.login.click();
        hmc.usernames.sendKeys(ConfigReader.getpropertie("hmcWrongUsername"));
        hmc.Password.sendKeys(ConfigReader.getpropertie("hmcWrongPass"));
        hmc.ikinciLogin.click();

        Assert.assertTrue(hmc.ikinciLogin.isDisplayed());
        Driver.closDriver();



    }
}
