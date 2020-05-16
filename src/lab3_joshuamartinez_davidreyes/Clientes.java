package lab3_joshuamartinez_davidreyes;

import java.util.ArrayList;
import java.util.Date;

public class Clientes extends Personas {
double dinero;
ArrayList<Productos> compras;

    public Clientes() {
    }

    public Clientes(double dinero,String ID, String username, String contra, String Correo, Date nacimiento) {
        super(ID, username, contra, Correo, nacimiento);
        this.dinero = dinero;
        
    }

    public Clientes(ArrayList<Productos> compras) {
        this.compras = compras;
    }
    
    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public ArrayList<Productos> getCompras() {
        return compras;
    }

    public void setCompras(ArrayList<Productos> compras) {
        this.compras = compras;
    }

}
