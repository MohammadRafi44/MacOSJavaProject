package com.example.tests.web.amazon;

import com.example.base.Actions;
import com.example.base.BaseTest;
import com.example.base.DriverManager;
import com.example.modules.amazon.AmazonModule;
import com.example.utils.Helper;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static com.example.objects.amazon.AmazonObjects.*;

public class AmazonTests extends BaseTest {

  // In line web actions example
  @Test(dataProvider = "testDataProvider")

  public void amazonSearch(Map<String, String> data) {
    Actions.openUrl(data.get("Url"));
    Actions.takeScreenshot();
    Actions.enterText(SEARCH_BOX, data.get("SearchProduct"), "Searched for : " + data.get("SearchProduct"));
    Actions.takeScreenshot();
    Actions.click(GO_BUTTON, "Clicked Go button next to search box");
    Actions.sleep(5);
    Actions.click(ADDTOCART);
    Actions.takeScreenshot();
    Helper.log("My custom comment to extent from the test");
  }

  // Test with separate module class example
  @Test(dataProvider = "testDataProvider")

  public void amazonSearchWithModuleApproach(Map<String, String> data) {
    AmazonModule amazonModule = new AmazonModule();
    amazonModule.launchAmazon(data)
        .search(data);
    Helper.log("My custom comment to extent from the test");
  }
}
