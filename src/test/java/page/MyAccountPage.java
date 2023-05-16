package page;

import core.Driver;
import maps.MyAccountMaps;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {
    MyAccountMaps myAccountMaps;

    public MyAccountPage() {
        myAccountMaps = new MyAccountMaps();
        PageFactory.initElements(Driver.getDriver(), myAccountMaps);
    }

    public void clicklinkUser() {
        myAccountMaps.linkUser.click();
    }

    public void clicklinMyaccount() {
        Driver.visibilityOf(myAccountMaps.linkMyAccount);
        myAccountMaps.linkMyAccount.click();
    }

    public void clicklinkEdit() {
        Driver.visibilityOf(myAccountMaps.LinkEdit);
        myAccountMaps.LinkEdit.click();
    }

    public String gettextusuario() {
        Driver.visibilityOf(myAccountMaps.textUsuario);
        return myAccountMaps.textUsuario.getText();
    }

    public void clickbtnDelete() {
        Driver.visibilityOf(myAccountMaps.btnDelete);
        myAccountMaps.btnDelete.click();
    }

    public void clickbtnYes() {
        Driver.visibilityOf(myAccountMaps.btnYes);
        myAccountMaps.btnYes.click();
    }

    public String getTextDelete() {
        Driver.visibilityOf(myAccountMaps.textDelete);
        return myAccountMaps.textDelete.getText();
    }
}