package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import page.MyAccountPage;
import page.MyEditpages;

import java.util.Map;

public class MyEditAccountSteps {

    MyAccountPage myAccountPage;
    MyEditpages myEditpages;
    Map<String,String> mapDados;

    @Dado("que esteja na pagina de alteracao de conta")
    public void queEstejaNaPaginaDeAlteracaoDeConta() {
myAccountPage= new MyAccountPage();
myAccountPage.clicklinkUser();
myAccountPage.clicklinMyaccount();
myAccountPage.clicklinkEdit();

    }
    @Quando("altero os valores dos seguintes campos")
    public void alteroOsValoresDosSeguintesCampos(Map<String,String>map) {
mapDados = map;
myEditpages = new MyEditpages();
myEditpages.setinpFirstname(map.get("firstname"));
myEditpages.setinpLastname(map.get("lastname"));
    }
    @Quando("realizo o clique em salvar")
    public void realizoOCliqueEmSalvar() {
myEditpages.clickbtnSave();
    }
    @Entao("a alteracao foi exibida na pagina MyAccount")
    public void aAlteracaoFoiExibidaNaPaginaMyAccount() {
String nome = mapDados.get("firstname")+" "+mapDados.get("lastname");
        Assert.assertEquals(nome,myAccountPage.gettextusuario());
    }
}
