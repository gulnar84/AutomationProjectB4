package Io.loop.test.day8;

import Io.loop.test.Utilities.PizzaOrderWebTableUtil;
import Io.loop.test.base.TestBase;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class T0_pizza_order extends TestBase {
    @Test
public void test_pizza_type(){
        driver.get("https://loopcamp.vercel.app/web-tables.html");
        String name = "Samuel Jackson";
        String expectedPizzaType = "Italian";
        String actualPizzaType = PizzaOrderWebTableUtil.returnFieldValue(driver, name, "pizza type");

        System.out.println("actualPizzaType = " + actualPizzaType);

        assertEquals(actualPizzaType, expectedPizzaType, "Actual does not match expected");
    }
}
