import org.testng.annotations.Test;


public class selectAddressTest extends baseTest{
    @Test
    public void selectAddressTesting() throws InterruptedException {
        driver.get("https://glovoapp.com/hr/hr/osijek/");
        selectAddressPage  selectAddressPage = new selectAddressPage(driver);
        driver.manage().window().maximize();
        selectAddressPage.signIn("projekttestiranje1@gmail.com","testiranje");
        selectAddressPage.selectAddress("Sljemenska 128a, Osijek");

    }
}
