
package eva2_14_vehiculo;

public class Motocicleta extends Vehiculo {
    private int capacidad;

    public Motocicleta(int capacidad, int velocidad) {
        super(velocidad);
        this.capacidad = capacidad;
    }

    public Motocicleta() {
        
    }

    
    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
  
}
