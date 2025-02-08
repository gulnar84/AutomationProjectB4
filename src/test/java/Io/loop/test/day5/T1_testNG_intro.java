package Io.loop.test.day5;

import org.testng.Assert;
import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;

public class T1_testNG_intro {

    @Test //(priority =2 olsa run oldugda 2ci gostereck hemcinin depemd on group da sece bilerik)
    public void test2(){ // (atest2 yazilsa 1ci test 2 runing olunacaq sonra test1 runing alfabetik order)
        System.out.println("Test 2 is running");

        String expected ="Diana"; //Diana same diana, if i write  Dianaaa it is not working
        String actual="Diana";
        assertEquals(actual, expected, "Actual does not match with expected");
    }

    @Test //(priority=1 run oldugda consula 1ci bu gosterecek)
    public void test1(){
        System.out.println("Test 1 is rinning");
        String actual="Feyruz";
        String expected= "Nadir";
      // Assert.assertEquals(actual, expected, "Message will show if only test fails"); //1 way
        assertEquals(actual, expected, "Message will show if only test fails"); //2 way

    }
    @BeforeMethod
    public void setupMethod(){
        System.out.println("Before method is running");
    }
    @AfterMethod
    public void tearDownMethod(){
        System.out.println("After method is running");
    }
    @BeforeClass
    public void setUp(){
        System.out.println("Before class is running");
    }
    @AfterClass
    public void tearDown(){
        System.out.println("After class is running");
    }
}
