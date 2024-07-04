package demoqa.com.stepdefinitions;

import demoqa.com.enums.WidgetsValidation;
import demoqa.com.models.DatosWidgets;
import demoqa.com.questions.FinalizarWidgets;
import demoqa.com.tasks.AutoComplete;
import io.cucumber.java.DataTableType;
import io.cucumber.java.Transpose;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;

import java.util.Map;

import static com.google.common.base.Predicates.equalTo;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class StepDefinitionWidgets {
    @When("Resuelve el formulario Autocomplete")
    public void resuelveElFormularioAutocomplete(DatosWidgets datos) {
        theActorInTheSpotlight().attemptsTo(AutoComplete.elFormulario(datos));
    }
    @Then("El formulario se lleno correctamente")
    public void elFormularioSeLlenoCorrectamente() {
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(FinalizarWidgets.value(), equalTo(WidgetsValidation.TXT_TEXTO.getMesaje()))
        );
    }
    @DataTableType
    public DatosWidgets datosWidgets(@Transpose Map<String, String> entry){
        return new DatosWidgets(
                entry.get("strMultiple"),
                entry.get("strOnly")
        );
    }
}
