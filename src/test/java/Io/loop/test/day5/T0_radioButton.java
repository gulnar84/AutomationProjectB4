package Io.loop.test.day5;

import Io.loop.test.Utilities.GeneralConstants;
import Io.loop.test.Utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class T0_radioButton {
    public static void main(String[] args) {
      /*
        https://loopcamp.vercel.app/radio-buttons.html
        wait implicitly 10 seconds
        is selected
        is enabled
         */

        WebDriver driver = WebDriverUtil.getDriver(GeneralConstants.BROWSER);
        driver.manage().window().maximize();
        driver.get("https://loopcamp.vercel.app/radio-buttons.html");

        // selenium 3 wait
        // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // selenium 4 wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement red = driver.findElement(By.xpath("//input[@id = 'red']"));
        WebElement green = driver.findElement(By.xpath("//input[@id='green']"));

        // isSelected()
        System.out.println("red.isSelected() BEFORE CLICKING = " + red.isSelected()); //hele red button secmir

        red.click();    // indi sececek

        System.out.println("red.isSelected() AFTER CLICKING = " + red.isSelected());  // red is selected().Soutv enter shortcut


        green.click();

        System.out.println("green.isSelected() = " + green.isSelected());

        // isEnabled()
        System.out.println("red.isEnabled() = " + red.isEnabled());
        System.out.println("green.isEnabled() = " + green.isEnabled());


    }

}


