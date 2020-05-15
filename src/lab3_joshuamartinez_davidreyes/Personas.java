package lab3_joshuamartinez_davidreyes;

import java.util.ArrayList;
import java.util.Date;

public class Personas {
    String ID;
    String username;
    String contra;
    String Correo;
    Date nacimiento;

    public Personas() {
    }

    public Personas(String ID, String username, String contra, String Correo, Date nacimiento) {
        super();
        this.ID = ID;
        this.username = username;
        this.contra = contra;
        this.Correo = Correo;
        this.nacimiento = nacimiento;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    @Override
    public String toString() {
        return "Personas{" + "username=" + username + ", contra=" + contra + '}';
    }
            

}
