package steps;

import core.Driver;
import enulls.Browser;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.LoginPage;
import page.NewAccountPage;

import java.io.IOException;
import java.util.Map;

public class LoginSteps {
    LoginPage loginPage;
    NewAccountPage newAccountPage;
    String username;


@Before
public void inicializaNavegador(Scenario cenario){
  new Driver(Browser.CHROME);
  Driver.setNomeCenario(cenario.getName());
  Driver.criaDiretorio();
 System.out.println(Driver.getNomeCenario()+"-"+cenario.getStatus());

}
@After
public void fechaNavegador(Scenario cenario) throws IOException {
    if(cenario.isFailed()) {
    Driver.printScreen("cenario com erro");
}
    Driver.getDriver().quit();
    System.out.println(cenario.getStatus());
    System.out.println(cenario.isFailed());
}

    @Dado("que a modal esteja aberta")
    public void queAModalEstejaAberta() {
        Driver.getDriver().get("https://advantageonlineshopping.com/#/");
        loginPage = new LoginPage();
        loginPage.clickBtnLogin();
        loginPage.visibilityOfBtnFechar();
        loginPage.aguardaLoader();

    }
    @Quando("for realizado o clique fora da modal")
    public void forRealizadoOCliqueForaDaModal() {
     loginPage.clickdivFechaModal();
    }
    @Então("a janela modal deve ser fechada")
    public void aJanelaModalDeveSerFechada() throws Exception {
        try {
            loginPage.visibilityOfBtnFechar();
        } catch (Exception e) {
            throw new Exception("A janela modal nao foi fechada");
        }
    }
        @Quando("for realizado o clique no icone do fechar modal")
        public void forRealizadoOCliqueNoIconeDoFecharModal() {
            loginPage.clickbtnFechar();


    }

    @Quando("for realizado o clique no link Create NewAccount")
    public void forRealizadoOCliqueNoLinkCreateNewAccount()  {
        loginPage.clicklinkCreateAccount();

    }

    @Então("a pagina Create NewAccount deve ser exibida")
    public void aPaginaCreateNewAccountDeveSerExibida() throws IOException {
        newAccountPage = new NewAccountPage();
        Assert.assertEquals("CREATE ACCOUNT",newAccountPage.getTextNewAccount());
        Driver.printScreen("logado new account");
    }

    @Quando("os campos de login sejam preenchidos da seguinte forma")
    public void osCamposDeLoginSejamPreenchidosDaSeguinteForma(Map<String,String>map) throws IOException {
        username = map.get("usuario");
        String password = map.get("senha");
        boolean remember = Boolean.parseBoolean(map.get("remember"));
        loginPage.setinpUsername(username);
        loginPage.setinpPassword(password);
        if(remember)
            loginPage.clickinpRemember();
        Driver.printScreen("preenchimento dos campos de login");


        
    }

    @Quando("for realizado o clique no botao sign in")
    public void forRealizadoOCliqueNoBotaoSignIn() {
        loginPage.clickbtnSigIn();
    }

    @Entao("deve ser possivel logar no sistema")
    public void deveSerPossivelLogarNoSistema() throws IOException {
        Assert.assertEquals(username,loginPage.gettextLogado());
        Driver.printScreen("logado no sistema");
    }

    @Entao("o sistema devera exibir uma mensagem de erro")
    public void oSistemaDeveraExibirUmaMensagemDeErro() throws IOException {
        Assert.assertEquals("Incorrect user name or password.",loginPage.getTextErroLogin());
        Driver.printScreen("mensagem de erro");
    }

    @Entao("o botao sign in deve permanecer desabilitado")
    public void oBotaoSignInDevePermanecerDesabilitado() throws IOException {
        boolean enable = loginPage.isbtnSigIn();
        Assert.assertFalse(enable);
        Driver.printScreen("Dados em branco");
    }
    @Dado("que esteja logado no sistema")
    public void queEstejaLogadoNoSistema(Map<String,String>map) throws IOException {
        queAModalEstejaAberta();
        osCamposDeLoginSejamPreenchidosDaSeguinteForma(map);
        forRealizadoOCliqueNoBotaoSignIn();
        deveSerPossivelLogarNoSistema();

    }

}



