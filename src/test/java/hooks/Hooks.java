package hooks;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.Driver;

public class Hooks {

    @Before
    public void setUp() {
        Driver.initialize();
    }

    @After
    public void tearDown() {
        Driver.quitDriver();
    }
}