import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class searchPage extends selectAddressPage{

    private WebDriver driver;

    @FindBy(xpath = "//*[@id=\"search-input\"]")
    private WebElement searchTextBox;

    @FindBy(xpath="//*[@id=\"Sve\"]/div[2]/div[1]/div/a/div[2]/div[1]")
    private WebElement firstBox;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/div/div/div/section[1]/div[2]/div/div[3]/div[1]/div[2]/div/form/div/input")
    private WebElement searchStore;


    public searchPage(WebDriver driver){
        super(driver);

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void search(String store, String item) throws InterruptedException {
        searchTextBox.sendKeys(store);
        Thread.sleep(4000);

        firstBox.click();
        Thread.sleep(5000);


        searchStore.sendKeys(item);
        Thread.sleep(3000);



    }

}
