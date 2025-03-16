package Io.loop.test.day10;

import Io.loop.pages.LoopPracticeDynamicLoading7;
import Io.loop.test.Utilities.BrowserUtils;
import Io.loop.test.Utilities.ConfigurationReader;
import Io.loop.test.Utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertTrue;

public class T2_explicit_wait {

      /*
       1. go https://loopcamp.vercel.app/dynamic_loading/7.html
       2. Wait until title is “Dynamic title”
       3. Assert: Message “Done!” is displayed.
       4. Assert: Image is displayed.
     */

    LoopPracticeDynamicLoading7 loopPracticeDynamicLoading7;
    WebDriverWait wait;

    @BeforeMethod
    public void setUpMethod() {
        loopPracticeDynamicLoading7 = new LoopPracticeDynamicLoading7();
        Driver.getDriver().get(ConfigurationReader.getProperties("loop.practice"));
    }

    @AfterMethod
    public void tearDownMethod() {
        Driver.closeDriver();
    }

    @Test
    public void explicit_wait_test() {
        BrowserUtils.loopLinkClick("Dynamic Loading");
        loopPracticeDynamicLoading7.getDynamicLoading7.click();
        wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleIs("Dynamic title"));
        assertTrue(loopPracticeDynamicLoading7.doneMessage.isDisplayed(), "Element is NOT displayed");
        assertTrue(loopPracticeDynamicLoading7.image.isDisplayed(), "Element is NOT displayed");

    }
}