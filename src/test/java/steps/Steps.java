package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Entao;
import elementos.Elementos;
import metodos.Metodos;

public class Steps {

	
	WebDriver driver;
	Metodos m = new Metodos();
	Elementos e = new Elementos();

	@Dado("^que o usuario acesse a url \"([^\"]*)\"$")
	public void que_o_usuario_acesse_a_url(String arg1) throws Throwable {
		m.ExecutarNavegador(arg1);
	}

	@Dado("^selecione o campo abra a sua conta$")
	public void selecione_o_campo_abra_a_sua_conta() throws Throwable {
		m.clicar(e.getBtbAbrirSuaConta());

	}

	@Dado("^preencha os dados$")
	public void preencha_os_dados() throws Throwable {
		m.pausa(3000);
		m.clicar(e.getBtnChato());
		m.preencher(e.getCampoNome(), "tarcio do arcodeom");
		m.preencher(e.getCampoTelefone(), "22222222222");
		m.preencher(e.getCampoEmail(), "weyde1999@outlook.com");
		m.preencher(e.getCampoCpf(), "82975308094");
		m.preencher(e.getCampoNascimento(), "30/11/1994");
	}

	@Dado("^selecione a politica de privacidade$")
	public void selecione_a_politica_de_privacidade() throws Throwable {
		m.pausa(3000);
		m.clicar(e.getCampoTratamentoDados());
	}

	@Quando("^selecionar o botao continuar$")
	public void selecionar_o_botao_continuar() throws Throwable {
		m.pausa(2000);
		m.clicar(e.getCampoContinuar());
	}

	@Entao("^realizo a validacao do texto Prontinho! Recebemos os seus dados$")
	public void realizo_a_validacao_do_texto_Prontinho_Recebemos_os_seus_dados() throws Throwable {
		m.validarTexto("Prontiiiinho! Recebemos os seus dados.", e.getValidacao());
	}

}
