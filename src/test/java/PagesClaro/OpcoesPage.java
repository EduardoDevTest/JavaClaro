package PagesClaro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpcoesPage {

	private WebDriver driver;

	public OpcoesPage(WebDriver driver) {
		this.driver = driver;

	}

	public OpcoesPage SelecionarPartidaOpcao() {

		driver.findElement(By.xpath(
				"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr[3]/td[1]/input"))
				.click();

		return this;
	}

	public OpcoesPage SelecionarRetornoOpcao() {

		driver.findElement(By.xpath(
				"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/p/input"))
				.click();

		return this;

	}

	public CompaniaPage clickOpcoesOpcao() {
			driver.findElement(By.xpath(
					"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/p/input"))
					.click();
		
			return new CompaniaPage(driver);
		}
}