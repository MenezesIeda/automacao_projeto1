package maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyEditMaps {
    @FindBy(name = "first_nameAccountDetails")
    public WebElement setinpFirstname;

    @FindBy(name = "last_nameAccountDetails")
    public WebElement inpLastname;

    @FindBy(css = "#save_btnundefined")
    public WebElement btnSave;
}
