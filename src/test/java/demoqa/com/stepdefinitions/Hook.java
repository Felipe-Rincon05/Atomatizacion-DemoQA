package demoqa.com.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class Hook {
    @Before
    public void prepararEscenario() {
        setTheStage(new OnlineCast());
        theActorCalled("Felipe Rincon");
    }
    @Given("El usuario ingresa a la pagina demoqa")
    public void elUsuarioIngresaALaPaginaDemoqa() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://demoqa.com/"));
    }
}
