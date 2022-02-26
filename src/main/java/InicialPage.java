import org.openqa.selenium.WebDriver;

public class InicialPage {

	private DSL dsl;

	public InicialPage(WebDriver driver) {
	dsl = new DSL(driver);
    }
	
	public void EscreveNome(String nome) {
		dsl.Escreve("et_pb_contact_nome_0",nome);
    }
	
	public void EscreveEmail(String email) {
		dsl.Escreve("et_pb_contact_email_0", email);
	}
	
	public void EscreveTelefone(String telefone) {
		dsl.Escreve("et_pb_contact_telefone_0",telefone);
	}
	
	public void EscreveEmpresa(String empresa) {
		dsl.Escreve("et_pb_contact_empresa_0", empresa);
	}
	
	public void EscreveMensagem(String mensagem) {
		dsl.Escreve("et_pb_contact_mensagem_0", mensagem);
	}

	

}
