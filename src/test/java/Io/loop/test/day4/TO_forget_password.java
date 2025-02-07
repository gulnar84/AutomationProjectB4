package Io.loop.test.day4;

import Io.loop.test.Utilities.DocuportConstants;
import Io.loop.test.Utilities.GeneralConstants;
import Io.loop.test.Utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TO_forget_password {
    /*
    validate forget password
    Identify reset password heading using css and go from parent to child
     */
    public static void main(String[] args) {
        // get driver and maximize
        WebDriver driver = WebDriverUtil.getDriver(GeneralConstants.BROWSER);
        driver.manage().window().maximize();

        // go to url
        driver.get(DocuportConstants.DOCUPORT_TEST);

        // locate the forget password and click
        WebElement forgetPasswordLink = driver.findElement(By.cssSelector("a[href='/reset-password"));
        forgetPasswordLink.click();

        // locate forget password heading
        WebElement forgetPasswordHeading = driver.findElement(By.cssSelector("div[class='login-layout__form']>h1"));
        System.out.println("forgetPasswordHeading.getText() = " + forgetPasswordHeading.getText());

    }
}
