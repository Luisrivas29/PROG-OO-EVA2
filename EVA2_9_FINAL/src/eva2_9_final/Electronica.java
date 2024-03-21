package eva2_9_final;


public abstract class Electronica extends Productos {
   private String marca;
   private boolean garantia;

    public Electronica() {
        this.marca = "------";
        this.garantia = false;
    }

    public Electronica(String marca, boolean garantia) {
        super();
        this.marca = marca;
        this.garantia = garantia;
    }

    public Electronica(String marca, boolean garantia, double precio, String nombre) {
        super(precio, nombre);
        this.marca = marca;
        this.garantia = garantia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isGarantia() {
        return garantia;
    }

    public void setGarantia(boolean garantia) {
        this.garantia = garantia;
    }
   
   @Override
    public String toString(){
        String cade = super.toString();
        cade += "\n " + "Marca: " + marca + "\n" 
                + "Garantia: " + garantia;
        return cade;
    }
   
}
