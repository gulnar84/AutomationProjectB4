package Io.loop.test.day4;

import Io.loop.test.Utilities.GeneralConstants;
import Io.loop.test.Utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T00_css_IsDisplayed {
    public static void main(String[] args) {
          /*
    https://the-internet.herokuapp.com/forgot_password
     */
        WebDriver driver = WebDriverUtil.getDriver(GeneralConstants.BROWSER);
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/forgot_password");

        WebElement forgotPasswordHeading = driver.findElement(By.cssSelector("div[class='example']>h2"));
        System.out.println("forgotPasswordHeading.getText() = " + forgotPasswordHeading.isDisplayed());

      // isDisplayed() boolean-will return true or false depending the element is displayed at html

        if (forgotPasswordHeading.isDisplayed()) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
    }
}
