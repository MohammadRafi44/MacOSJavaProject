package com.example.modules.amazon;

import com.example.base.Actions;
import java.util.Map;

import static com.example.objects.amazon.AmazonObjects.*;

public class AmazonModule {

  public AmazonModule launchAmazon(Map<String, String> data) {
    Actions.openUrl(data.get("Url"), "Opened amazon url");
    Actions.takeScreenshot();
    return this;
  }

  public AmazonModule search(Map<String, String> data) {
    Actions.openUrl(data.get("Url"));
    Actions.takeScreenshot();
    Actions.enterText(SEARCH_BOX, data.get("SearchProduct"), "Searched for : " + data.get("SearchProduct"));
    Actions.click(GO_BUTTON, "Clicked Go button next to search box");
    Actions.sleep(5);
    Actions.click(IPHONE_SERACH_RESULT, "Clicked on iphone 12 pro max item - search result ");
    
    return this;
  }

}
