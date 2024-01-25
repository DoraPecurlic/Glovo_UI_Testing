import org.testng.annotations.Test;

public class addToCartTest extends baseTest{
    @Test
    public void addToCartTesting() throws InterruptedException {
        driver.get("https://glovoapp.com/hr/hr/osijek/");

        addToCart addToCart = new addToCart(driver);
        addToCart.signIn("projekttestiranje1@gmail.com","testiranje");
        addToCart.selectAddress("Sljemenska 128a, Osijek");
        addToCart.search("Pet centar","Igračke za pse");

        addToCart.add();
    }

}
