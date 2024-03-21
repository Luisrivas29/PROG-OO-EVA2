package eva2_9_final;


public abstract class Productos {
     private double precio;
    private String nombre;

    public Productos() {
        this.precio = 0;
        this.nombre = "------";
    }

    public Productos(double precio, String nombre) {
        this.precio = precio;
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString(){
        String cade;
        cade = "Nombre: " + nombre + "\n" +
                "Precio: " + precio;
        return cade;
    }
}
