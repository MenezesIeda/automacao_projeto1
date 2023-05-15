package page;

import core.Driver;
import maps.NewAccountMap;
import org.openqa.selenium.support.PageFactory;

public class NewAccountPage {
    NewAccountMap newAccountMap;
    public NewAccountPage(){
        newAccountMap = new NewAccountMap();
        PageFactory.initElements(Driver.getDriver(),newAccountMap);
    }
    public String getTextNewAccount(){
        return newAccountMap.txtCreateAccount.getText();

    }
}
