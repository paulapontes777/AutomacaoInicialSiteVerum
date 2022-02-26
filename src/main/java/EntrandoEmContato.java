import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class EntrandoEmContato {
	
	private WebDriver driver;
	private InicialPage page;
	
	@Before
	 public void inicializa() {
	    driver  = new FirefoxDriver();
		driver.manage().window().setSize(new Dimension(1200, 765));
		driver.get("https://www.verumoms.com.br/");
		page = new InicialPage(driver);
		
	}
	
	@Test
	public void PreencheOsCampos() {
	page.EscreveNome("Ana Paula");
	page.EscreveEmail("teste123@");
	page.EscreveTelefone("12345-6789");
	page.EscreveEmpresa("fake");
	page.EscreveMensagem("Teste do teste do teste");
	
	
	Assert.assertEquals("Ana Paula", driver.findElement(By.id("et_pb_contact_nome_0")).getAttribute("value"));
	Assert.assertEquals("teste123@", driver.findElement(By.id("et_pb_contact_email_0")).getAttribute("value"));
	Assert.assertEquals("12345-6789", driver.findElement(By.id("et_pb_contact_telefone_0")).getAttribute("value"));
	Assert.assertEquals("fake", driver.findElement(By.id("et_pb_contact_empresa_0")).getAttribute("value"));
	Assert.assertEquals("Teste do teste do teste", driver.findElement(By.id("et_pb_contact_mensagem_0")).getAttribute("value"));
	}
	

}	
