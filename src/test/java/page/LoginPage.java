package page;

import core.Driver;
import maps.LoginMap;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    LoginMap loginMap;
    public LoginPage(){
        loginMap = new LoginMap();
        PageFactory.initElements(Driver.getDriver(),loginMap);
    }
    public void clickBtnLogin(){
        Driver.visibilityOf(loginMap.btnLogin);
        loginMap.btnLogin.click();
    }

    public void clickbtnFechar(){
        loginMap.btnFechar.click();
    }

    public void clickdivFechaModal(){
        loginMap.divFecharModal.click();
    }
    public void setinpUsername(String username) {
        if (username != null) {
            loginMap.inpUsername.sendKeys(username);

        }
    }
    public void setinpPassword(String password){
            if(password!=null){
                loginMap.inpPassword.sendKeys(password);
            }
        }


    public void clickinpRemember(){
        loginMap.inpRemember.click();
    }
    public void clickbtnSigIn(){
        loginMap.btnSigIn.click();
    }
    public void clicklinkCreateAccount(){
        loginMap.linkCreateAccount.click();
    }
    public boolean isbtnSigIn(){
        return loginMap.btnSigIn.isEnabled();
    }
    public void visibilityOfBtnFechar(){
        Driver.visibilityOf(loginMap.btnFechar);
    }
    public void invisibilityOfBtnFechar(){
        Driver.invisibilityOf(loginMap.btnFechar);
    }
    public void aguardaLoader(){
        Driver.attributeChange(loginMap.divLoader, "display","none");
    }
    public String gettextLogado(){
        Driver.visibilityOf(loginMap.textLogado);
        return loginMap.textLogado.getText();

    }
    public String getTextErroLogin(){
        Driver.visibilityOf(loginMap.textErroLogin);
        return loginMap.textErroLogin.getText();
    }
}

