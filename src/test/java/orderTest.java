import org.testng.annotations.Test;

public class orderTest extends baseTest{
    @Test
    public void orderTesting() throws InterruptedException {
        driver.get("https://glovoapp.com/hr/hr/osijek/");
        orderPage orderTest = new orderPage(driver);
        orderTest.signIn("projekttestiranje1@gmail.com","testiranje");
        orderTest.selectAddress("Sljemenska 128a, Osijek");
        orderTest.search("Pet centar","Igračke za pse");
        orderTest.add();
        orderTest.delete();

        orderTest.order();

    }
}
