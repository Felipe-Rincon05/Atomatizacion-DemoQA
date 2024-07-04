package demoqa.com.tasks;

import demoqa.com.models.DatosWidgets;
import demoqa.com.userinterface.Widgets;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.Keys;

public class AutoComplete implements Task {
    private DatosWidgets datos;

    public AutoComplete(DatosWidgets datos) {
        this.datos = datos;
    }
    public static AutoComplete elFormulario(DatosWidgets datos) {
        return Tasks.instrumented(AutoComplete.class, datos);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(Widgets.MENU_WIDGETS),
                Click.on(Widgets.MENU_WIDGETS),
                Scroll.to(Widgets.BTN_AUTOCOMPLETE),
                Click.on(Widgets.BTN_AUTOCOMPLETE),
                Scroll.to(Widgets.TXT_MULTIPLE),
                Enter.theValue(datos.getStrMultiple()).into(Widgets.TXT_MULTIPLE),
                Hit.the(Keys.ENTER).into(Widgets.TXT_MULTIPLE),
                Enter.theValue(datos.getStrOnly()).into(Widgets.TXT_ONLY),
                Hit.the(Keys.ENTER).into(Widgets.TXT_ONLY)
        );
    }
}
