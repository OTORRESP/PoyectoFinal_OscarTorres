package pageobjects;

import actions.SelectOptions;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Appointment extends PageObject {

    @FindBy(id = "combo_facility")
    public WebElementFacade opfacility;
    @FindBy(xpath = "//input[@id='chk_hospotal_readmission']")
    public WebElementFacade chkapply;
    @FindBy(xpath = "//div[@class='col-sm-4']/label")
    public List<WebElementFacade> rbtnmed;
    @FindBy(xpath = "//input[@id='txt_visit_date']")
    public WebElementFacade visitdte;
    @FindBy(xpath = "//textarea[@id='txt_comment']")
    public WebElementFacade txtcomentario;
    @FindBy(xpath = "//button[@id='btn-book-appointment']")
    public WebElementFacade btnbook;


    public void completeappointment(String healthp,String date,String coment){
        element(opfacility).waitUntilVisible();
        Select elementCountry = new Select(opfacility);
        elementCountry.selectByVisibleText("Hongkong CURA Healthcare Center");
        chkapply.click();
        SelectOptions.in(rbtnmed, healthp);
        visitdte.type(date);
        txtcomentario.type(coment);
        btnbook.click();
    }


}
