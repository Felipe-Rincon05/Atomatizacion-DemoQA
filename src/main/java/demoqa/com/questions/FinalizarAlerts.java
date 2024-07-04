package demoqa.com.questions;

import demoqa.com.userinterface.Alertas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class FinalizarAlerts implements Question {
    @Override
    public String answeredBy(Actor actor) {
        return Alertas.TEXT_ALERT.resolveFor(actor).getText();
    }
    public static Question<String> value() {return new FinalizarAlerts();}
}
