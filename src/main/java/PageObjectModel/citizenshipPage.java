package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class citizenshipPage {

    private WebDriver driver ;

    public citizenshipPage(){
        driver = Driver.getDriver();
        PageFactory.initElements( driver , this );
    }

    @FindBy(xpath="//ms-dialog-content//ms-text-field[@placeholder='GENERAL.FIELD.NAME']//input")
    private WebElement inputCitizenName;

    @FindBy(xpath = "//ms-dialog-content//ms-text-field[@placeholder='GENERAL.FIELD.SHORTNAME']//input")
    private WebElement getInputCitizenShortName;

    public void typeInTheInputCitizenName(){
        
    }

}
