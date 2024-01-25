import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addToCart extends searchPage{

    private WebDriver driver;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/div/div/div/section[1]/div[2]/div/div[3]/div[3]/div/div[1]/div/div[2]/div[1]/div/div[1]/div")
    private WebElement choice;


    @FindBy(xpath = "/html/body/div[1]/div/div/div[3]/div/div/div[2]/div/div[2]/div[1]/div[2]/div[1]/div/div/label")
    private WebElement pick;

    @FindBy(xpath = "//*[@id=\"base-modal\"]/div/div[2]/div/section/div[5]/button/span")
    private WebElement firstAdd;

    @FindBy(xpath = "//*[@id=\"default-wrapper\"]/div/div/div/section[1]/div[2]/div/div[3]/div[3]/div/div[1]/div/div[2]/div[3]/div/div[1]/div/div[1]/span/span[5]")
    private WebElement choice2;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[3]/div/div/div[2]/div/div[2]/div[1]/div[2]/div/div/div/label")
    private WebElement pick2;

    @FindBy(xpath = "//*[@id=\"base-modal\"]/div/div[2]/div/section/div[5]/button/span")
    private WebElement secondAdd;

    public addToCart(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void add() throws InterruptedException {
        choice.click();
        Thread.sleep(1500);

        pick.click();
        Thread.sleep(3000);

        firstAdd.click();
        Thread.sleep(3000);

        choice2.click();
        Thread.sleep(3000);

        pick2.click();
        Thread.sleep(1500);

        secondAdd.click();
        Thread.sleep(1500);



    }

}
