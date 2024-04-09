import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;




public class WeatherAppTest {
    public static void main(String[] args) throws MalformedURLException {
        openWeatherApp();
    }
   static AppiumDriver driver;
    public static void openWeatherApp() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName","OPPO Find X3 Pro");
        cap.setCapability("udid","4d897317");
      //  cap.setCapability("platformNames","[\"Windows\"]");
        cap.setCapability("platformName","Android");
        cap.setCapability("platformVersion","11");
        cap.setCapability("automationName","UIAutomator2");
        cap.setCapability("noReset", "true");
        cap.setCapability("fullReset", "false");

//        cap.setCapability("appPackage","com.coloros.calculator");
//        cap.setCapability("appActivity","com.android.calculator2.Calculator");

//        cap.setCapability("appPackage","com.ubercab");
//        cap.setCapability("appActivity","com.ubercab.presidio.app.core.root.RootActivity");

//        cap.setCapability("appPackage","com.reddit.frontpage");
//        cap.setCapability("appActivity","com.reddit.launch.main.MainActivity");

        cap.setCapability("appPackage","com.coloros.weather2");
        cap.setCapability("appActivity","com.oplus.weather.main.view.WeatherMainActivity");

        URL url = new URL("http://127.0.0.1:4723/");
        driver = new AppiumDriver(url,cap);
      //  driver.findElement(new AppiumBy.ByAccessibilityId("Manage cities")).click();
      //  driver.findElement(new AppiumBy.ByAccessibilityId("Add")).click();
      //  driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"Sydney\").instance(0)")).click();

System.out.println("Application started");

    }

}
