package elementos;

import org.openqa.selenium.By;

public class Elementos {

	private By btnChato = By.id("onetrust-accept-btn-handler");
	private By btbAbrirSuaConta = By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div/header/div/div/div[3]/div/button");
	private By campoNome = By.id("nome");
	private By campoTelefone = By.id("celular");
	private By campoEmail = By.id("email");
	private By campoCpf = By.id("cpf");
	private By campoNascimento = By.id("dataNascimento");
	private By campoTratamentoDados = By.xpath("/html/body/div[3]/div[2]/div/div[2]/form/div/div[6]/div/label");
	private By campoContinuar = By.xpath("/html/body/div[3]/div[2]/div/div[2]/form/div/div[7]/button");
	private By validacao = By.xpath("/html/body/div[3]/div[2]/div/p");
	public By getValidacao() {
		return validacao;
	}
	public void setValidacao(By validacao) {
		this.validacao = validacao;
	}
	public By getBtbAbrirSuaConta() {
		return btbAbrirSuaConta;
	}
	public By getBtnChato() {
		return btnChato;
	}
	public void setBtnChato(By btnChato) {
		this.btnChato = btnChato;
	}
	public By getCampoNome() {
		return campoNome;
	}
	public By getCampoTelefone() {
		return campoTelefone;
	}
	public By getCampoEmail() {
		return campoEmail;
	}
	public By getCampoCpf() {
		return campoCpf;
	}
	public By getCampoNascimento() {
		return campoNascimento;
	}
	public By getCampoTratamentoDados() {
		return campoTratamentoDados;
	}
	public By getCampoContinuar() {
		return campoContinuar;
	}
	
	
	
	
}