package com.example.modules.demosite;

import com.example.base.Actions;
import com.example.report.ExtentTestManager;
import com.example.utils.Helper;
import org.testng.Assert;

import java.util.Map;

import static com.example.objects.demosite.DemoSiteObjects.*;

public class DemositeModule {

    //Function - Launching WebSite
        public DemositeModule launchDemoSite(Map<String, String> data) {
            Actions.openUrl(data.get("Url"), "Launched url : " + data.get("Url"));
            Actions.takeScreenshot();
            return this;
    }
    //Function - Creating an User
        public DemositeModule createUser(Map<String, String> data) {
            Actions.click(ADD_USER,"Clicked on Add User button");
            Actions.enterText(USER_NAME, data.get("Username"), "Entered Username : " + data.get("Username"));
            Actions.enterText(PASSWORD, data.get("Password"), "Entered Password : " + data.get("Password"));
            Actions.click(SAVE_BUTTON);
            Actions.takeScreenshot();
            ExtentTestManager.getTest().info("User created");
            return this;
    }
    //Function - Loginng with new user
        public DemositeModule login(Map<String, String> data) {
            Actions.click(LOGIN_LINK);
            Actions.enterText(USER_NAME, data.get("Username"), "Entered Username : " + data.get("Username"));
            Actions.enterText(PASSWORD, data.get("Password"), "Entered Password : " + data.get("Password"));
            Actions.click(LOGIN_BUTTON);
            return this;
        }
    //Function - Login Validation
        public DemositeModule validateLoginIfLoginSuccessful() {
            String message = Actions.getText(MESSAGE);
            Assert.assertTrue(message.contains("Successful"), "Login failed : " + message);
            Helper.log("Login successful");
            Actions.takeScreenshot();
            return this;
        }

}
