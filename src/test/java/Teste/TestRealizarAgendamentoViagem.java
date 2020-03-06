package Teste;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import PagesClaro.LoginPage;

public class TestRealizarAgendamentoViagem {
	private WebDriver driver;
	
	@Before
	public void SetNavagador() {
		driver = WebBrowser.CreateFirefox(); 
				
	}
	
	@Test
	public void testRealizarAgendamentoViagem() {
		String click;
		new LoginPage(driver)
		//Sign-in
		.usuarioLogin("teste")
		.SenhaLogin("teste")
		.clickLogin()
		//Na tela “Flight Finder” escolha os detalhes: 
		.inserirDestinoDetalhes("New York")
		.insertMesDetalhes("December")
		.insertMesDetalhes("February")
		.linhasAreasDetelhes("Unified Airlines")
		.ClickCadastrarDetalhes()
		//Na tela “Select Flight” escolha as opções abaixo e clique em “Continue”:
		.SelecionarPartidaOpcao()
		.SelecionarRetornoOpcao()
		.clickOpcoesOpcao()
		//Na tela Book a Flight, valide em “Summary” se realmente estão as escolhas da compania “Blue Skies”
		.ValidarCampania("Blue Skies Airlines 630")
		.escreverPrimNomeCompania("Eduardo")
		.escreverSegundoNomeCompania("Barbosa")
		.inserirTelCompania("1190000-2323")
		.clickPageCompania()
		//Na tela Flight Confirmation, Veja se Foi gerado o Flight confirmation NUMBER
		.ValidarConfirmationNumber();
		
		}
	@After
	public void fecharNavgador() {
		driver.close();
		driver.quit();
		
		
	}
	
	

}
