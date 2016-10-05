import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/*http://www.ontestautomation.com/how-not-to-test-restful-apis-with-selenium-webdriver/*/

/**
 * Created by luchk on 05.10.2016.
 */
public class APIRestFull {
    public static WebDriver driver;
    public static void main(String[] args) {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://api.zippopotam.us/us/90210");
    }
}
