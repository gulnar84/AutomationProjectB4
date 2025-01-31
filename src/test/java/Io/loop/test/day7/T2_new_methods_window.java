package Io.loop.test.day7;


import Io.loop.test.base.TestBase;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

public class T2_new_methods_window extends TestBase {




    @Test
    public void test_new_methods() {

        // open a new tab
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.loopcamp.io");

        // open a new window
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.amazon.com");

}

}