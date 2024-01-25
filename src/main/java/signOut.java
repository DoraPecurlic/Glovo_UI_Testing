
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class signOut extends selectAddressPage{

    private WebDriver driver;

    @FindBy(xpath = "//*[@id=\"default-wrapper\"]/div/div/div[1]/div/div[1]/div[2]/div/div[2]/div/div[1]/img[1]")
    private WebElement profileButton;

    @FindBy(css = "div.profile_logout")
    private WebElement signOutButton;

    public signOut(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void signOut() throws InterruptedException {
        profileButton.click();
        Thread.sleep(3000);

        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", signOutButton);


        Thread.sleep(5000);




    }
}
