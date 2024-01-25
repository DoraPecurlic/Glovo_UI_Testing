import org.testng.annotations.Test;

public class signOutTest extends baseTest{
    @Test
    public void signOutTesting() throws InterruptedException {
        driver.get("https://glovoapp.com/hr/hr/osijek/");

        signOut signOut = new signOut(driver);
        signOut.signIn("projekttestiranje1@gmail.com","testiranje");
        signOut.selectAddress("Sljemenska 128a, Osijek");

        signOut.signOut();
    }

}
