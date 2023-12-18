package com.example.modules.testcrew;

import com.example.base.Actions;
import com.example.base.DriverManager;
import com.example.modules.demosite.DemositeModule;
import com.example.report.ExtentTestManager;
import com.example.utils.Helper;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import java.util.Map;
import static com.example.objects.testcrew.TestcrewObjects.*;


public class TestcrewModule {

    //Function - Launching WebSite
        public TestcrewModule launchTestcrewSite(Map<String, String> data) {
            Actions.openUrl(data.get("Url"), "Launched url : " + data.get("Url"));
            Actions.takeScreenshot();
            return this;
        }
    //Function - Header Verification
        public TestcrewModule HeaderVerification(Map<String, String> data) {
            Actions.checkIfWebElementExists(HEADER_PHONE);
            Actions.checkIfWebElementExists(HEADER_EMAIL);
            //Assert.assertTrue(Actions.checkIfWebElementExists(CONTACT_US,"Contact Us - Header is Available "));
            Actions.takeScreenshot();
            ExtentTestManager.getTest().info("TestCrew website Header - Phone and Email Availability Tested");
            return this;
        }
    //Function - HomePageHeadersVerification
        public TestcrewModule HomePageHeadersVerification(Map<String, String> data) {
            Assert.assertTrue(Actions.checkIfWebElementExists(HOME,"Home - Header is Available "));
            Assert.assertTrue(Actions.checkIfWebElementExists(ABOUT_US,"About Us - Header is Available "));
            Assert.assertTrue(Actions.checkIfWebElementExists(SERVICES,"Services - Header is Available "));
            Assert.assertTrue(Actions.checkIfWebElementExists(CLEINTS_PATNERS,"Clients & Patners - Header is Available "));
            Assert.assertTrue(Actions.checkIfWebElementExists(CASE_STUDIES,"Case Studies - Header is Available "));
            Assert.assertTrue(Actions.checkIfWebElementExists(NEWS,"News - Header is Available "));
            Assert.assertTrue(Actions.checkIfWebElementExists(BLOGS,"Blogs - Header is Available "));
            Assert.assertTrue(Actions.checkIfWebElementExists(CONTACT_US,"Contact Us - Header is Available "));
            Actions.takeScreenshot();
            ExtentTestManager.getTest().info("TestCrew website Headers Availability Tested");
            return this;
        }
    //Function - FooterVerification
        public void FooterVerification(Map<String, String> data) {
            JavascriptExecutor js = (JavascriptExecutor)DriverManager.getDriver();
            js.executeScript("window.scrollBy(0, 250)", "");
            Actions.checkIfWebElementExists(FOOTER_TWITTER);
            Actions.checkIfWebElementExists(FOOTER_INSTAGRAM);
            Actions.checkIfWebElementExists(FOOTER_FACEBOOK);
            Actions.checkIfWebElementExists(FOOTER_LINKEDIN);
            Actions.checkIfWebElementExists(FOOTER_CONTACT_INFO);
            Actions.checkIfWebElementExists(FOOTER_PRIVACY_POLICY);
            Actions.takeScreenshot();
            ExtentTestManager.getTest().info("TestCrew website Footer - Sections Availability Tested");
        }
    //Function - NewsLetterSubscriptionVerification
        public void NewsLetterSubscriptionVerification(Map<String, String> data) {
                JavascriptExecutor js = (JavascriptExecutor)DriverManager.getDriver();
                js.executeScript("window.scrollBy(0, document.body.scrollHeight)", "");
                Actions.click(FOOTER_NEWSLETTER_EMAIL);
                DriverManager.getDriver().findElement(FOOTER_NEWSLETTER_EMAIL).clear();
                DriverManager.getDriver().findElement(FOOTER_NEWSLETTER_EMAIL).sendKeys("mohammadrafi@test.com");
                Actions.click(FOOTER_NEWSLETTER_BUTTON);
                Assert.assertTrue(Actions.checkIfWebElementExists(FOOTER_NEWSLETTER_SUCCESS_TEXT),"Clicked on Newletter subsribe button");
                Actions.takeScreenshot();
                ExtentTestManager.getTest().info("TestCrew website News Letter subscritpion Tested");
            }
}
