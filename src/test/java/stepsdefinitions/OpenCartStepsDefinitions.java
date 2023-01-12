package stepsdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import pageobjects.Appointment;
import pageobjects.Login;
import pageobjects.Confirmation;

public class OpenCartStepsDefinitions {

    @Steps
    Login login;

    @Steps
    Appointment appointment;

    @Steps
    Confirmation confirmation;

    @Given("^que el usuario ingresa a la web cura healtcare$")
    public void queelusuarioingresaalawebcurahealtcare(){
    login.open();
    }

    @When("^ingreso mi usuario(.*) y contrasena(.*)en login$")
    public void ingresoMiUsuarioYContrasenaEnLogin(String usuario,String pass) {
        login.realizarappointment();
        login.completuspass(usuario,pass);
    }

    @And("^ingreso datos de registro facilidad programa(.*) fecha(.*) comentario(.*)$")
    public void ingresoDatosDeRegistroFacilidadProgramaHealthpFechaDateComentarioComent(String healthp,String date,String coment) {
        appointment.completeappointment(healthp,date,coment);
    }


    @Then("^validar datos ingresados facilidad programa(.*) fecha(.*) comentario(.*)$")
    public void validarDatosIngresadosFacilidadProgramaHealthpFechaComentario(String health, String date, String coment) throws InterruptedException {
        confirmation.validardatos(health,date,coment);
    }
}

