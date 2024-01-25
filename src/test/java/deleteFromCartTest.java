import org.testng.annotations.Test;

public class deleteFromCartTest extends baseTest{
    @Test
    public void deleteTesting() throws InterruptedException {
        driver.get("https://glovoapp.com/hr/hr/osijek/");

        deleteFromCart deleteFromCart = new deleteFromCart(driver);
        deleteFromCart.signIn("projekttestiranje1@gmail.com","testiranje");
        deleteFromCart.selectAddress("Sljemenska 128a, Osijek");
        deleteFromCart.search("Pet centar","Igračke za pse");
        deleteFromCart.add();

        deleteFromCart.delete();
    }
}
