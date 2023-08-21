package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.CarAndHomeInsurancePage;

public class CarInsuranceSteps {
    private WebDriver driver;
    private CarAndHomeInsurancePage carAndHomeInsurancePage;

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        carAndHomeInsurancePage = new CarAndHomeInsurancePage(driver);
    }

    @After
    public void tearDown(){
        driver.quit();
    }

    @Given("the user is on the car and home insurance page")
    public void theUserIsOnTheCarAndHomeInsurancePage(){
        driver.get("https://www.discovery.co.za/car-and-home-insurance/get-a-quote-alt");
    }
}
