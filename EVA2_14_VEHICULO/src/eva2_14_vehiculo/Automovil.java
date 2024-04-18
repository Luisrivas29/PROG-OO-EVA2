package eva2_14_vehiculo;


public class Automovil extends Vehiculo {
    private int noPuertas;

    public Automovil(int noPuertas, int velocidad) {
        super(velocidad);
        this.noPuertas = noPuertas;
    }

    public Automovil() {
        super();
    }

    public int getNoPuertas() {
        return noPuertas;
    }

    public void setNoPuertas(int noPuertas) {
        this.noPuertas = noPuertas;
    }
    
    
}
