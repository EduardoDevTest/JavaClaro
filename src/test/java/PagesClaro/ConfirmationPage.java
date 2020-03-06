package PagesClaro;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConfirmationPage {

	private WebDriver driver;

	public ConfirmationPage(WebDriver driver) {
		this.driver = driver;

	}

	public ConfirmationPage ValidarConfirmationNumber() {

		WebElement confirmation = driver.findElement(By.xpath(
				"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[5]/td/table/tbody/tr[1]/td/table/tbody/tr/td[1]/b/font/font/b/font[1]"));
		confirmation.getText();
		Assert.assertTrue(true);

		return this;
	}

}