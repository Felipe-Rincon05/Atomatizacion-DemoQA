package demoqa.com.enums;

public enum AlertsValidation {
    TXT_TEXTO("You entered Buenas noches");
    private final String mensaje;
    AlertsValidation(String mensaje){
        this.mensaje = mensaje;
    }
    public String getMesaje (){return mensaje;}
}
