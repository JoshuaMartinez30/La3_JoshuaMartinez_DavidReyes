package lab3_joshuamartinez_davidreyes;

import java.util.Date;

public class Comida extends Productos {
    String tipo;
    Date caducidad;

    public Comida(String tipo, Date caducidad, String despcrip, String nombre, double precio) {
        super(despcrip, nombre, precio);
        this.tipo = tipo;
        this.caducidad = caducidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(Date caducidad) {
        this.caducidad = caducidad;
    }

    
}
