package demoqa.com.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Widgets {
    public static final Target MENU_WIDGETS = Target.the("Selecciona el boton que despliega las opciones de widgets")
            .located(By.xpath("//h5[contains(text(),'Widgets')]"));
    public static final Target BTN_AUTOCOMPLETE = Target.the("Selecciona el formulario 'Autocomplete'")
            .located(By.xpath("//span[contains(text(),'Auto Complete')]"));
    public static final Target TXT_MULTIPLE = Target.the("Caja de texto donde se pueden escribir mas de un color")
            .located(By.xpath("//input[@id='autoCompleteMultipleInput']"));
    public static final Target TXT_ONLY = Target.the("Caja de texto donde se puede escribir un color")
            .located(By.xpath("//input[@id='autoCompleteSingleInput']"));
    public static final Target TEXT_WHITE = Target.the("Valor 'white' para TXT_ONLY")
            .located(By.xpath("//div[contains(text(),'White')]"));
}
