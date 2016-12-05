package REST;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/*http://www.ontestautomation.com/how-not-to-test-restful-apis-with-selenium-webdriver/*/

/**
 * Created by luchk on 05.10.2016.
 */
public class APIRestFull {

    public void run() {
        String driverPath = "C:\\tools\\geckodriver-v0.11.1-win64\\";
        WebDriver driver;
        System.setProperty("webdriver.gecko.driver", driverPath+"geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://api.zippopotam.us/us/90210");
        System.out.println("browser start");
        driver.quit();
    }
}
