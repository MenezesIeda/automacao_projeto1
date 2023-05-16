package page;

import core.Driver;
import maps.MyEditMaps;
import org.openqa.selenium.support.PageFactory;

public class MyEditpages {
    MyEditMaps myEditMaps;

    public MyEditpages(){
        myEditMaps = new MyEditMaps();
        PageFactory.initElements(Driver.getDriver(),myEditMaps);
    }
    public void setinpFirstname(String firstname){
        Driver.visibilityOf(myEditMaps.setinpFirstname);
        myEditMaps.setinpFirstname.sendKeys(firstname);
    }
    public void setinpLastname(String lastname){
        myEditMaps.inpLastname.sendKeys(lastname);
    }

    public void clickbtnSave(){
        myEditMaps.btnSave.click();
    }
}
