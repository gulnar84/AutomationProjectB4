package Io.loop.test.day5;

import Io.loop.test.Utilities.GeneralConstants;
import Io.loop.test.Utilities.WebDriverUtil;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class T000_staleLementException {
    public static void main(String[] args) {

    }
    /*1. Open Chrome browser
          2. Go to http://the-internet.herokuapp.com/add_remove_elements/
          3. Click to “Add Element” button
          4. Verify “Delete” button is displayed after clicking.
          5. Click to “Delete” button.
          6. Verify “Delete” button is NOT displayed after clicking.
          USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS

         */
    //Open Chrome Browser
    WebDriver driver = WebDriverUtil.getDriver(GeneralConstants.BROWSER);
       // driver.manage().window().maximize();
    driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com/add_remove_elements);


}
