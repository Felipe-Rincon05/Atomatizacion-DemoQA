package demoqa.com.questions;

import demoqa.com.userinterface.Widgets;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class FinalizarWidgets implements Question {
    @Override
    public String answeredBy(Actor actor) {
        return Widgets.TEXT_WHITE.resolveFor(actor).getText();
    }
    public static Question<String> value() {return new FinalizarWidgets();}
}
