package demoqa.com.tasks;

import demoqa.com.userinterface.Alertas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static net.serenitybdd.core.Serenity.getDriver;

public class Alerts implements Task {
    public Alerts() {
    }
    public static Alerts alerts() {
        return Tasks.instrumented(Alerts.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(Alertas.MENU_ALERTS),
                Click.on(Alertas.MENU_ALERTS),
                Scroll.to(Alertas.BTN_ALERTS),
                Click.on(Alertas.BTN_ALERTS),
                Scroll.to(Alertas.BTN_ALERT1),
                Click.on(Alertas.BTN_ALERT1)
        );
        getDriver().switchTo().alert().accept();
        actor.attemptsTo(
                Scroll.to(Alertas.BTN_ALERT2),
                Click.on(Alertas.BTN_ALERT2)
        );
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {}
        getDriver().switchTo().alert().accept();
        actor.attemptsTo(
                Click.on(Alertas.BTN_ALERT3)
        );
        getDriver().switchTo().alert().dismiss();
        actor.attemptsTo(
                Scroll.to(Alertas.BTN_ALERT4),
                Click.on(Alertas.BTN_ALERT4)
        );
        getDriver().switchTo().alert().sendKeys("Buenas noches");
        getDriver().switchTo().alert().accept();
    }
}
