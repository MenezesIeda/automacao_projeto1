package page;

import core.Driver;
import maps.NewAccountMap;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NewAccountPage {
    NewAccountMap newAccountMap;
    public NewAccountPage(){
        newAccountMap = new NewAccountMap();
        PageFactory.initElements(Driver.getDriver(),newAccountMap);
    }
    public String getTextNewAccount(){
        Driver.visibilityOf(newAccountMap.txtCreateAccount);
        return newAccountMap.txtCreateAccount.getText();

    }
    public void setinpUsername(String username){
        newAccountMap.inpUsername.sendKeys(username);

    }
    public void setinpEmail(String email){
        newAccountMap.inpEmail.sendKeys(email);
    }
    public void setinpPassword(String password){
        newAccountMap.inpPassword.sendKeys(password);
    }
    public void setinpConfirmaPassword(String password){
        newAccountMap.getinpConfirmaPassword.sendKeys(password);
    }
    public void slCountry(String country){
        Select select = new Select(newAccountMap.slCountry);
        select.selectByVisibleText(country);
    }
    public void clickinpIagree(){
        newAccountMap.inpIagree.click();
    }
    public void clickbtnRegister(){
        newAccountMap.btnRegister.click();
    }

}
