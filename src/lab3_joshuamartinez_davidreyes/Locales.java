package lab3_joshuamartinez_davidreyes;

import java.util.ArrayList;

public class Locales {

    String nombrelocal;
    ArrayList<Empleados> lista;
    ArrayList<Productos> listp;
    Empleados gerente;

    public Locales() {
    }

    public Locales(String nombrelocal, ArrayList<Empleados> lista, ArrayList<Productos> listp, Empleados gerente) {
        super();
        this.nombrelocal = nombrelocal;
        this.lista = lista;
        this.listp = listp;
        this.gerente = gerente;
    }

    public ArrayList<Empleados> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Empleados> lista) {
        this.lista = lista;
    }

    public ArrayList<Productos> getListp() {
        return listp;
    }

    public void setListp(ArrayList listp) {
        this.listp = listp;
    }

    public Empleados getGerente() {
        return gerente;
    }

    public void setGerente(Empleados gerente) {
        this.gerente = gerente;
    }

    public void setNombrelocal(String nombrelocal) {
        this.nombrelocal = nombrelocal;
    }

    @Override
    public String toString() {
        return "Locales{" + "nombre del local=" + nombrelocal + ", "
                + "Empleados=" + lista + ", Productos=" + listp + ", Gerente o jefe =" + gerente + '}';
    }

}
