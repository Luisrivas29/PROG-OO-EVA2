
package eva2_6_clases_abstractas;


public class Rectangulo extends Figura{
     private double base;
    private double altura;
    
    public Rectangulo() {
        this.base = 0;
        this.altura = 0;
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPeri() {
       return (base*2)+(altura*2);
    }
    
    
}
