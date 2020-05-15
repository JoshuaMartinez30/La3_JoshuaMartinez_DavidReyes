package lab3_joshuamartinez_davidreyes;

public class Productos {
    String despcrip;
    String nombre;
    double precio;

    public Productos() {
    }

    public Productos(String despcrip, String nombre, double precio) {
    super();
        this.despcrip = despcrip;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getDespcrip() {
        return despcrip;
    }

    public void setDespcrip(String despcrip) {
        this.despcrip = despcrip;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto " + "descripcion=" + despcrip + ", Nombre=" + nombre + ", Precio=" + precio;
    }
    
}
