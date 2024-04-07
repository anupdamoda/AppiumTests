import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileCommand;

import java.net.MalformedURLException;
import java.net.URL;




public class CalculatorTest {
    public static void main(String[] args) throws MalformedURLException {
        openCalculator();
    }
   static AppiumDriver driver;
    public static void openCalculator() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName","OPPO Find X3 Pro");
        cap.setCapability("udid","4d897317");
      //  cap.setCapability("platformNames","[\"Windows\"]");
        cap.setCapability("platformName","Android");
        cap.setCapability("platformVersion","11");
        cap.setCapability("automationName","UIAutomator2");
        cap.setCapability("noReset", "false");
        cap.setCapability("fullReset", "false");

//        cap.setCapability("appPackage","com.coloros.calculator");
//        cap.setCapability("appActivity","com.android.calculator2.Calculator");

        cap.setCapability("appPackage","com.ubercab");
        cap.setCapability("appActivity","com.ubercab.presidio.app.core.root.RootActivity");

        cap.setCapability("appPackage","com.reddit.frontpage");
        cap.setCapability("appActivity","com.reddit.launch.main.MainActivity");

        URL url = new URL("http://127.0.0.1:4723/");
        driver = new AppiumDriver(url,cap);
System.out.println("Application started");

    }

}
