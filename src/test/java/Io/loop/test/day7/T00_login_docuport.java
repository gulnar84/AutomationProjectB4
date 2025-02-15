package Io.loop.test.day7;

import Io.loop.test.Utilities.DocuportConstants;
import Io.loop.test.Utilities.DocuportUtils;
import Io.loop.test.base.TestBase;
import org.testng.annotations.Test;

public class T00_login_docuport extends TestBase {

    @Test
    public void test_login_logout_docuport () throws InterruptedException {
        DocuportUtils.login(driver, DocuportConstants.CLIENT);
        DocuportUtils.logOut(driver);

        Thread.sleep(3000);

        DocuportUtils.login(driver, DocuportConstants.EMPLOYEE);
        DocuportUtils.logOut(driver);

        Thread.sleep(3000);

        DocuportUtils.login(driver, DocuportConstants.ADVISOR);
        DocuportUtils.logOut(driver);

        Thread.sleep(3000);

        DocuportUtils.login(driver, DocuportConstants.SUPERVISOR);
        DocuportUtils.logOut(driver);


    }
}
