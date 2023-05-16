package maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountMaps {
    @FindBy(css ="#menuUserLink")
    public WebElement linkUser;

    @FindBy(css = "#loginMiniTitle > label:nth-child(1)")
    public WebElement linkMyAccount;

    @FindBy(css = "#myAccountContainer > div:nth-child(1) > h3 > a")
    public WebElement LinkEdit;

    @FindBy(css="#myAccountContainer > div:nth-child(1) > div > div:nth-child(1)")
    public WebElement textUsuario;

    @FindBy(css = ".deleteMainBtnContainer ")
    public WebElement btnDelete;

    @FindBy(css = ".deleteRed")
    public WebElement btnYes;

    @FindBy(css = "#myAccountContainer > div:nth-child(6) > button > div")
    public WebElement textDelete;

}
