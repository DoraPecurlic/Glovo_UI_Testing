import org.testng.annotations.Test;

public class signInTest extends baseTest {
    @Test
    public void signInTesting() throws InterruptedException {

        driver.get("https://glovoapp.com/hr/hr/osijek/");
        signInPage signInPage = new signInPage(driver);
        driver.manage().window().maximize();
        signInPage.signIn("projekttestiranje1@gmail.com","testiranje");


    }

}