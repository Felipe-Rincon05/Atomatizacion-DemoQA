package demoqa.com.enums;

public enum WidgetsValidation {
    TXT_TEXTO("White");
    private final String mensaje;
    WidgetsValidation(String mensaje){
        this.mensaje = mensaje;
    }
    public String getMesaje (){return mensaje;}
}
