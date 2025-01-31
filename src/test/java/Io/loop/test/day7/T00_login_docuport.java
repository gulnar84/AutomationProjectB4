package Io.loop.test.day7;

import Io.loop.test.Utilities.DocuportConstants;
import Io.loop.test.Utilities.DocuportUtils;
import Io.loop.test.base.TestBase;
import org.testng.annotations.Test;

public class T00_login_docuport extends TestBase {

    @Test
    public void test_login_docuport () throws InterruptedException {
        DocuportUtils.login(driver, DocuportConstants.CLIENT);
        //DocuportUtils.logout(driver);

    }
}
