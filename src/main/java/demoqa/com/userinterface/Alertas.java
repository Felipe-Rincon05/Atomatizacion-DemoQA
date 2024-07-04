package demoqa.com.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Alertas {
    public static final Target MENU_ALERTS = Target.the("Selecciona el boton que despliega las opciones de alerts")
            .located(By.xpath("//h5[contains(text(),'Alerts, Frame & Windows')]"));
    public static final Target BTN_ALERTS = Target.the("Selecciona las alertas a validar")
            .located(By.xpath("//span[contains(text(),'Alerts')]"));
    public static final Target BTN_ALERT1 = Target.the("Selecciona la alerta 1")
            .located(By.xpath("//button[@id='alertButton']"));
    public static final Target BTN_ALERT2 = Target.the("Selecciona la alerta 2")
            .located(By.xpath("//button[@id='timerAlertButton']"));
    public static final Target BTN_ALERT3 = Target.the("Selecciona la alerta 3")
            .located(By.xpath("//button[@id='confirmButton']"));
    public static final Target BTN_ALERT4 = Target.the("Selecciona la alerta 4")
            .located(By.xpath("//button[@id='promtButton']"));
    public static final Target TEXT_ALERT = Target.the("Permite ver lo que se escribio en la alerta 4")
            .located(By.xpath("//span[@id='promptResult']"));
}
