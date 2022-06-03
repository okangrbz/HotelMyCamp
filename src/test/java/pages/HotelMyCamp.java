package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HotelMyCamp {

    public HotelMyCamp() {
        PageFactory.initElements(Driver.getWebDriver(),this);

    }

    @FindBy(xpath = "//*[text()='Log in']")
    public WebElement login;

    @FindBy(xpath = "//input[@id='UserName']")
    public WebElement usernames;

    @FindBy(xpath = "//input[@id='Password']")
    public WebElement Password;

    @FindBy(xpath = "//input[@value='Log in']")
    public WebElement ikinciLogin;

   @FindBy(xpath = "//span[@class='username username-hide-on-mobile']")
   public WebElement kullaniciIsmi;


}
