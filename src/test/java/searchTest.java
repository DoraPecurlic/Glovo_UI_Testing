import org.testng.annotations.Test;

public class searchTest extends baseTest{
    @Test
    public void signInTesting() throws InterruptedException {

        driver.get("https://glovoapp.com/hr/hr/osijek/");
        searchPage  search = new searchPage(driver);
        driver.manage().window().maximize();
        search.signIn("projekttestiranje1@gmail.com","testiranje");
        search.selectAddress("Sljemenska 128a, Osijek");
        search.search("Pet centar","Igračke za pse");


    }
}
