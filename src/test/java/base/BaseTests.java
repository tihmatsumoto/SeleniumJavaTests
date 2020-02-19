package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

public class BaseTests {

    private static WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp(){
        /* Setting up selenium environment for testing */
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");

        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        //Maximize window
        driver.manage().window().maximize();
        homePage = new HomePage(driver);

        //Fullscreen mode
        /* driver.manage().window().fullscreen(); */

        //Setting up for a specific device -- iPhone X
        /* Dimension size = new Dimension(375, 812);
        driver.manage().window().setSize(size); */

    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
