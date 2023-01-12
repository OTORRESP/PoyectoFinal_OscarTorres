package pageobjects;

import actions.SelectOptions;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class Login extends PageObject {

    @FindBy(xpath = "//a[@id='btn-make-appointment']")
    public WebElementFacade btnappointment;
    @FindAll({@FindBy(css = "#txt-username"), @FindBy(xpath = "//input[@name='username']")})
    public WebElementFacade lusername;
    @FindBy(xpath = "//input[@id='txt-password']")
    public WebElementFacade lpassword;
    @FindBy(xpath ="//button[@id='btn-login']")
    public WebElementFacade btnlogin;

    public void realizarappointment(){
    btnappointment.click();
    }

    public void completuspass(String usuario,String pass){
        element(lusername).waitUntilVisible();
        lusername.type(usuario);
        lpassword.type(pass);
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].click();", btnlogin.waitUntilEnabled());
    }




}
