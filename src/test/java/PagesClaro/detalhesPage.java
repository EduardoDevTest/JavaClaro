package PagesClaro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class detalhesPage {

	private WebDriver driver;

	public detalhesPage(WebDriver driver) {
		this.driver = driver;

	}

	public detalhesPage inserirDestinoDetalhes(String Dest) {

		WebElement combo1 = driver.findElement(By.xpath(
				"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/select"));
		Select combo = new Select(combo1);

		combo.selectByVisibleText("New York");

		return this;

	}

	public detalhesPage inserirMesdeIdaDetalhes(String mes) {
		WebElement combo2 = driver.findElement(By.xpath(
				"html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[5]/td[2]/select[1]"));
		Select on = new Select(combo2);

		on.selectByVisibleText("December");
		return this;

	}

	public detalhesPage insertMesDetalhes(String ret) {

		WebElement combo3 = driver.findElement(By.xpath(
				"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/select[1]"));
		Select Returning = new Select(combo3);

		Returning.selectByVisibleText("February");

		return this;

	}

	public detalhesPage linhasAreasDetelhes(String line){
		
		WebElement combo4 = driver.findElement(By.xpath(
				"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[10]/td[2]/select"));
		Select Airline = new Select(combo4);

		Airline.selectByVisibleText("Unified Airlines");

		
		return this;
		
	
	}
	
	public detalhesPage clickCadastraDetalhes(String Deta){
		
		driver.findElement(By.xpath(
				"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td/input"))
				.click();

		
		return this;
		
		
	}

	public OpcoesPage ClickCadastrarDetalhes() {

		driver.findElement(By.xpath(
				"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td/input"))
				.click();

		return new OpcoesPage(driver);

	}

	
	
	
}
