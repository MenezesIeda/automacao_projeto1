package steps;

import core.Driver;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import maps.NewAccountMap;
import org.junit.Assert;
import page.LoginPage;
import page.NewAccountPage;

import java.util.Map;

public class NewAccountSteps {
    NewAccountPage newAccountPage;
    String username;

    @Dado("que a pagina CreatAccount esteja sendo exibida")
    public void queAPaginaCreatAccountEstejaSendoExibida() {
        newAccountPage = new NewAccountPage();
        Driver.getDriver().get("https://advantageonlineshopping.com/#/");
        Driver.getDriver().get("https://advantageonlineshopping.com/#/register");
        Assert.assertEquals("CREATE ACCOUNT",newAccountPage.getTextNewAccount());

    }
    @Quando("os campos forem preenchidos da seguinte maneira")
    public void osCamposForemPreenchidosDaSeguinteManeira(Map<String,String> map) {
       username=map.get("username");
        newAccountPage.setinpUsername(map.get("username"));
        newAccountPage.setinpEmail(map.get("email"));
        newAccountPage.setinpPassword(map.get("password"));
        newAccountPage.setinpConfirmaPassword(map.get("password"));
        newAccountPage.slCountry(map.get("country"));
        newAccountPage.clickinpIagree();
        newAccountPage.clickbtnRegister();

    }
    @Entao("deve ser possivel logar no sistema apos o cadastro")
    public void deveSerPossivelLogarNoSistemaAposOCadastro() {
        LoginPage loginPage = new LoginPage();
        Assert.assertEquals(username,loginPage.gettextLogado());
    }
}
