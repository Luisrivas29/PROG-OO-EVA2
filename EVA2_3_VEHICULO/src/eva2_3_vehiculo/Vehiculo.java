package eva2_3_vehiculo;


public class Vehiculo {
    private String marca;
    private String modelo;
    private int año;
    private String color;

    public Vehiculo() {
        marca = "SIN MARCA";
        modelo = "SIN MODELO";
        año = 0;
        color = "SIN COLOR";
    }

    public Vehiculo(String marca, String modelo, int año, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public void imprimirDatos(){
        System.out.println("MARCA: " + marca);
        System.out.println("MODELO: " + modelo);
        System.out.println("AÑO: " + año);
        System.out.println("COLOR: " + color);
        
    }
    
}
