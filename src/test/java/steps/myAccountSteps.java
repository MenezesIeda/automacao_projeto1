package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import page.MyAccountPage;

public class myAccountSteps {
    MyAccountPage myAccountPage;
    @Dado("que esteja na pagina MyAccount")
    public void queEstejaNaPaginaMyAccount() {
       myAccountPage = new MyAccountPage();
       myAccountPage.clicklinkUser();
       myAccountPage.clicklinMyaccount();
    }
    @Quando("for efetuado o clique em Delete e Yes")
    public void forEfetuadoOCliqueEmDeleteEYes() {
        myAccountPage.clickbtnDelete();
        myAccountPage.clickbtnYes();
    }
    @Entao("o usuario deve ser deletado")
    public void oUsuarioDeveSerDeletado() {
        Assert.assertEquals("Delete Account",myAccountPage.getTextDelete());
    }

}
