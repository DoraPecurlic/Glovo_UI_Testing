
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;


public class baseTest {

    protected WebDriver driver;



    @Parameters("browser")
    @BeforeMethod
    public void setUp(@Optional("chrome")String browser) {

        if(browser.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            System.out.println("Firefox launched!");

        }else if(browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
            driver = new ChromeDriver();
            System.out.println("Chrome launched!");
        }else if(browser.equalsIgnoreCase("edge")){
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
            System.out.println("Edge is launched!");
        }


    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
