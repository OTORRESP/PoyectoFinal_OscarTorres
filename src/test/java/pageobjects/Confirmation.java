package pageobjects;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

public class Confirmation extends PageObject {
    @FindBy(xpath = "//p[@id='facility']")
    public WebElementFacade validopfaci;
    @FindBy(xpath = "//p[@id='hospital_readmission']")
    public WebElementFacade validhops;
    @FindBy(xpath = "//p[@id='program']")
    public WebElementFacade validhprogram;
    @FindBy(xpath = "//p[@id='visit_date']")
    public WebElementFacade validdate;
    @FindBy(xpath = "//p[@id='comment']")
    public WebElementFacade validcom;

    public void validardatos(String healthp, String date, String coment) throws InterruptedException{
        validopfaci.withTimeoutOf(Duration.ofSeconds(20)).isEnabled();
        Assert.assertEquals(validopfaci.getText(), "Hongkong CURA Healthcare Center");
        validhops.withTimeoutOf(Duration.ofSeconds(20)).isEnabled();
        Assert.assertEquals(validhops.getText(), "Yes");
        validhprogram.withTimeoutOf(Duration.ofSeconds(20)).isEnabled();
        Assert.assertEquals(validhprogram.getText(), healthp);
        validdate.withTimeoutOf(Duration.ofSeconds(20)).isEnabled();
        Assert.assertEquals(validdate.getText(), date);
        validcom.withTimeoutOf(Duration.ofSeconds(20)).isEnabled();
        Assert.assertEquals(validcom.getText(), coment);
        Thread.sleep(3000);
    }



}
