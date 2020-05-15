package lab3_joshuamartinez_davidreyes;

import java.util.ArrayList;
import java.util.Date;

public class Personas {
    ArrayList<String> ID;
    ArrayList<String> username;
    ArrayList<String> contra;
    String Correo;
    Date nacimiento;

    public Personas() {
    }

    public Personas(ArrayList<String> ID, ArrayList<String> username, ArrayList<String> contra, String Correo, Date nacimiento) {
        super();
        this.ID = ID;
        this.username = username;
        this.contra = contra;
        this.Correo = Correo;
        this.nacimiento = nacimiento;
    }

    public ArrayList<String> getID() {
        return ID;
    }

    public void setID(ArrayList<String> ID) {
        this.ID = ID;
    }

    public ArrayList<String> getUsername() {
        return username;
    }

    public void setUsername(ArrayList<String> username) {
        this.username = username;
    }

    public ArrayList<String> getContra() {
        return contra;
    }

    public void setContra(ArrayList<String> contra) {
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
