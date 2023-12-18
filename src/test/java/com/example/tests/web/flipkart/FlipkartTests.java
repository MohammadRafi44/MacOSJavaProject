package com.example.tests.web.flipkart;

import com.example.base.BaseTest;
import java.util.Map;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class FlipkartTests extends BaseTest {

  @Test(dataProvider = "testDataProvider")

  public void flipkartSearch(Map<String, String> data) {
    // TODO
  }
}
