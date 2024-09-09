package stepdef;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class hooks {
    public static WebDriver driver = null;
    @Before
    public void open_browser()
    {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //navigate to the website
        driver.navigate().to("https://www.saucedemo.com/");
    }

    @After
    public void close_browser() throws InterruptedException
    {
        Thread.sleep(2000);
        driver.quit();
    }


}
