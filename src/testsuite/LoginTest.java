package testsuite;

import browsefactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest
{
    String baseurl = "https://opensource-demo.orangehrmlive.com/";

    String expectedText,actualText;
    @Before
    public void setUp()
    {
        openBrowser(baseurl);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials()
    {
        //Enter “Admin” username
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");

        //Enter “admin123 password
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");

        //Click on ‘LOGIN’ button
        driver.findElement(By.xpath("//button[text()=' Login ']")).click();

        expectedText="Dashboard";
        actualText=driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")).getText();
        Assert.assertEquals("Both Text are Not Equal",expectedText,actualText);


    }


    @After
    public void tearDown()
    {
        closeBrowser();
    }
}
