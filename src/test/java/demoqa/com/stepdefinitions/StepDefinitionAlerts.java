package demoqa.com.stepdefinitions;

import demoqa.com.enums.AlertsValidation;
import demoqa.com.questions.FinalizarAlerts;
import demoqa.com.tasks.Alerts;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;

import static com.google.common.base.Predicates.equalTo;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class StepDefinitionAlerts {
    @When("Valida las alertas")
    public void validaLasAlertas() {
        theActorInTheSpotlight().attemptsTo(Alerts.alerts());
    }
    @Then("Se validaron las alertas correctamente")
    public void seValidaronLasAlertasCorrectamente() {
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(FinalizarAlerts.value(), equalTo(AlertsValidation.TXT_TEXTO.getMesaje()))
        );
    }
}
