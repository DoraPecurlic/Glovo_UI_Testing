
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class signInPage {
    private  WebDriver driver;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[1]/div/div/div[1]/div/div[1]/div/div/div[2]/div/button")
    private WebElement signInButton;

    @FindBy(xpath = "//*[@id=\"base-modal\"]/div/div[2]/div/div/div[2]/button/span[2]")
    private WebElement emailSignInButton;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div/div[2]/div/div/form/div/div[1]/div/div/input")
    private WebElement emailTextBox;

    @FindBy(css = "button[data-test-id='submit-button']")
    private WebElement continueButton;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div/div[2]/div/div/form/div/div[1]/div/div/input")
    private WebElement passwordTextBox;

    @FindBy(xpath ="/html/body/div[1]/div/div/div[2]/div/div/div[2]/div/div/form/button[2]" )
    private WebElement submitButton;

    public signInPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void signIn(String email, String password) throws InterruptedException {
        driver.manage().window().maximize();
        Thread.sleep(3000);

        signInButton.click();
        Thread.sleep(3000);

        emailSignInButton.click();
        Thread.sleep(3000);

        emailTextBox.sendKeys(email);
        Thread.sleep(3000);

     //   WebDriverWait wait = new WebDriverWait(driver, 10);
        //WebElement continueButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("button[data-test-id='submit-button']")));
        continueButton.click();
        Thread.sleep(1500);

        passwordTextBox.sendKeys(password);
        Thread.sleep(1500);

        submitButton.click();
        Thread.sleep(4500);


    }


}
