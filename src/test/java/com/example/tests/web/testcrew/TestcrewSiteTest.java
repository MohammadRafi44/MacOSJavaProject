package com.example.tests.web.testcrew;

import com.example.base.BaseTest;
import com.example.modules.demosite.DemositeModule;
import com.example.modules.testcrew.TestcrewModule;
import com.example.utils.Helper;
import org.testng.annotations.Test;

import java.util.Map;

public class TestcrewSiteTest extends BaseTest {

    //Test to verify -  "Testcrew Website Menu HeadersTest"
        @Test(dataProvider = "testDataProvider",testName = "TC1",
                description = "Testcrew Website Menu HeadersTest")
        public void testCrewSiteHeaderTest(Map<String, String> data) {
            TestcrewModule testcrewModule = new TestcrewModule();
            testcrewModule
                    .launchTestcrewSite(data)
                    .HeaderVerification(data);
        }

    //Test to verify -  "Testcrew Website HeaderTest - Phone & Email"
        @Test(dataProvider = "testDataProvider",testName = "TC2",
                description = "Testcrew Website HeaderTest - Phone & Email")
        public void testCrewSiteMenuHeadersTest(Map<String, String> data) {
            TestcrewModule testcrewModule = new TestcrewModule();
            testcrewModule
                    .launchTestcrewSite(data)
                    .HomePageHeadersVerification(data);
        }

    //Test to verify -  "Testcrew Website Footer Test - Sections"
        @Test(dataProvider = "testDataProvider",testName = "TC3",
                description = "Testcrew Website Footer Test - Sections")
        public void testCrewSiteFooterTest(Map<String, String> data) {
            TestcrewModule testcrewModule = new TestcrewModule();
            testcrewModule
                    .launchTestcrewSite(data)
                    .FooterVerification(data);
        }

    //Test to verify -  "Testcrew Website News Letter - Subscription"
        @Test(dataProvider = "testDataProvider",testName = "TC4",
                description = "Testcrew Website News Letter - Subscription")
        public void NewsLetterSubscriptionTest(Map<String, String> data) {
            TestcrewModule testcrewModule = new TestcrewModule();
            testcrewModule
                    .launchTestcrewSite(data)
                    .NewsLetterSubscriptionVerification(data);
        }
}



