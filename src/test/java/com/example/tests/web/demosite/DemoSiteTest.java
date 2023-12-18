package com.example.tests.web.demosite;

import static com.example.objects.demosite.DemoSiteObjects.ADD_USER;
import static com.example.objects.demosite.DemoSiteObjects.LOGIN_BUTTON;
import static com.example.objects.demosite.DemoSiteObjects.LOGIN_LINK;
import static com.example.objects.demosite.DemoSiteObjects.MESSAGE;
import static com.example.objects.demosite.DemoSiteObjects.PASSWORD;
import static com.example.objects.demosite.DemoSiteObjects.SAVE_BUTTON;
import static com.example.objects.demosite.DemoSiteObjects.USER_NAME;

import com.example.base.Actions;
import com.example.base.BaseTest;
import com.example.modules.amazon.AmazonModule;
import com.example.modules.demosite.DemositeModule;
import com.example.report.ExtentTestManager;
import com.example.utils.Helper;
import java.util.Map;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoSiteTest extends BaseTest {

  // Test to create an User and Login on Demo Website
  @Test(dataProvider = "testDataProvider",testName = "TC1",
          description = "Demo site create user and login")
  public void demoSiteCreateUserAndLogin(Map<String, String> data) {
    DemositeModule demositeModule = new DemositeModule();
    demositeModule
            .launchDemoSite(data)
            .createUser(data)
            .login(data)
            .validateLoginIfLoginSuccessful();
    Helper.log("My custom comment to extent from the test");
  }
}
