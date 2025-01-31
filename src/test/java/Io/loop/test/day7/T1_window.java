package Io.loop.test.day7;

import Io.loop.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

import static org.testng.Assert.assertEquals;

public class T1_window extends TestBase {

    /*
    1. Open a chrome browser
    2. Go to : http://the-internet.herokuapp.com/windows
    3. Assert: Title is “The Internet”
    4. Click to: “Click Here” link
    5. Switch to new Window.
    6. Assert: Title is “New Window”
     */

    @Test
    public void test_window_handle(){
        driver.get("http://the-internet.herokuapp.com/windows");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        assertEquals(driver.getTitle(), "The Internet", "Actual does not match expected");

        System.out.println("driver.getWindowHandle() = " + driver.getWindowHandle());

        WebElement clickHere = driver.findElement(By.xpath("//a[text()='Click Here']"));
        clickHere.click();

        System.out.println("driver.getTitle() = " + driver.getTitle());

        //get orginal windowhandle
        String orginalWindow= driver.getWindowHandle();

        // get all window handles
        Set <String> windowHandles= driver.getWindowHandles();

        // loop through and stay at the last window
        for (String each :windowHandles);
        System.out.println("each");

}
}
