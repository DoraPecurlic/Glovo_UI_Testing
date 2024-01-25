import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class selectAddressPage extends signInPage{
    private WebDriver driver;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[3]/div/div/div[2]/div/div/form/div[1]/div[1]/div[1]/div/div/div[1]/div/div/input")
    private WebElement addressTextBox;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[3]/div/div/div[2]/div/div/form/div[1]/div[1]/div[1]/div/div[2]/div/div")
    private WebElement suggestion;
    public selectAddressPage(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void selectAddress(String address) throws InterruptedException {
        addressTextBox.sendKeys(address);
        Thread.sleep(4500);

        suggestion.click();
        Thread.sleep(4000);
    }
}
