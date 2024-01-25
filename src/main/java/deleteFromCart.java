import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class deleteFromCart extends  addToCart{

    private WebDriver driver;
    public deleteFromCart(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id=\"default-wrapper\"]/div/div/div/section[1]/div[2]/div/div[4]/div/div/div/section/div/section[2]/li/div[2]/button[1]/span/img")
    private WebElement deleteFirst;

    public void delete() throws InterruptedException {
        deleteFirst.click();
        Thread.sleep(2000);
    }
}
