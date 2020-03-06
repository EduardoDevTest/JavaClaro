package Teste;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebBrowser {
	public static WebDriver CreateFirefox() {

		System.setProperty("webdriver.geckodriver.driver", "C:\\driver");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//inicio de Navegação
		driver.get("http://www.newtours.demoaut.com/");
		
		
		
		return driver;
	}
}
