import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class orderPage extends deleteFromCart{
    private WebDriver driver;

    @FindBy(xpath = "//*[@id=\"default-wrapper\"]/div/div/div/section[1]/div[2]/div/div[4]/div/div/div/div[3]/button/span")
    private WebElement orderButton;

    @FindBy(xpath = "//*[@id=\"address-submit-button\"]")
    private WebElement confirmAddressButton;
    public orderPage(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void order() throws InterruptedException {
        orderButton.click();
        Thread.sleep(3000);

        confirmAddressButton.click();
        Thread.sleep(3000);
    }
}
