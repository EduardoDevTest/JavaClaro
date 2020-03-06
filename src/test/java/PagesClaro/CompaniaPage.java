package PagesClaro;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CompaniaPage {

	private WebDriver driver;

	public CompaniaPage(WebDriver driver) {
		this.driver = driver;

	}

	public CompaniaPage ValidarCampania(String valicomp) {

		WebElement nomeDalinha = driver.findElement(By.xpath(
				"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td/table/tbody/tr[6]/td[1]/font/font/font[1]/b"));
		String mensagem = nomeDalinha.getText();
		Assert.assertEquals("Blue Skies Airlines 630", mensagem);


		return this;
	}

	public CompaniaPage escreverPrimNomeCompania(String valiname) {
		driver.findElement(By.xpath(
				"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[1]/input"))
				.sendKeys("Eduardo");
	
	return this;		

			}


	public  CompaniaPage escreverSegundoNomeCompania(String SobreNome) {
								
		driver.findElement(By.xpath(
				"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input"))
				.sendKeys("Barbosa");
				
		return this;		
				
			}
	
	public CompaniaPage inserirTelCompania(String cep) {
		driver.findElement(By.xpath(
				"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[6]/td/table/tbody/tr[2]/td[2]/input"))
				.sendKeys("1190000-2323");	
	
	
		return this;		
	}
	
	public ConfirmationPage clickPageCompania() {
		driver.findElement(By.xpath(
				"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[23]/td/input"))
				.click();
	
		return new ConfirmationPage(driver);
   

	}
}