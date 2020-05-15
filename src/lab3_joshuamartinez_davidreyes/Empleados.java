package lab3_joshuamartinez_davidreyes;

import java.util.ArrayList;
import java.util.Date;

public class Empleados extends Personas{
    String horario;
    int ventas;

    public Empleados() {
    }

    public Empleados(String horario, int ventas, ArrayList<String> ID, ArrayList<String> username, ArrayList<String> contra, String Correo, Date nacimiento) {
        super(ID, username, contra, Correo, nacimiento);
        this.horario = horario;
        this.ventas = ventas;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }
    
}
