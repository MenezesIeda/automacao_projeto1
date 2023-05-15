package automacao;

import core.Driver;
import enulls.Browser;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWeb {
    WebDriver driver;
    Driver driverWeb;
    @Test
    @Before

      public void inicializaNavegador(){
driverWeb = new Driver(Browser.CHROME);
driver = Driver.getDriver();
driver.get("https://advantageonlineshopping.com/#/");
    }
    @After
    public void finalizaNavegador(){
        driver.quit();
    }
}
