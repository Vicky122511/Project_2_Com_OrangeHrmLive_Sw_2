package testsuite;

import browsefactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class ForgotPasswordTest extends BaseTest
{
    String baseurl = "https://opensource-demo.orangehrmlive.com/";

    String expectedText,actualText;
    @Before
    public void setUp()
    {
        openBrowser(baseurl);
    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully()
    {
        //click on the ‘Forgot your password’ link
        driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")).click();
        expectedText="Reset Password";
        actualText=driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 orangehrm-forgot-password-title']")).getText();
        Assert.assertEquals("Both Text Are Not Equal",expectedText,actualText);
    }

    @After
    public void tearDown()
    {
        closeBrowser();
    }

}
