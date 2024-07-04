package demoqa.com.models;

public class DatosWidgets {
    public String strMultiple;
    public String strOnly;

    public DatosWidgets(String strMultiple, String strOnly) {
        this.strMultiple = strMultiple;
        this.strOnly = strOnly;
    }

    public String getStrMultiple() {
        return strMultiple;
    }

    public void setStrMultiple(String strMultiple) {
        this.strMultiple = strMultiple;
    }

    public String getStrOnly() {
        return strOnly;
    }

    public void setStrOnly(String strOnly) {
        this.strOnly = strOnly;
    }
}
