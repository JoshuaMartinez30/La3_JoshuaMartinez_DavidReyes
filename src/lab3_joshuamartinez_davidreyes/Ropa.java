package lab3_joshuamartinez_davidreyes;

public class Ropa extends Productos {
    String genero,talla;

    public Ropa() {
    }

    public Ropa(String genero, String talla, String despcrip, String nombre, double precio) {
        super(despcrip, nombre, precio);
        this.genero = genero;
        this.talla = talla;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }
    
}
