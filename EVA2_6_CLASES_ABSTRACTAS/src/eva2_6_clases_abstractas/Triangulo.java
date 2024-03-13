package eva2_6_clases_abstractas;


public class Triangulo extends Figura{
    private double base;
    private double altura;

    public Triangulo() {
        this.base  = 0;
        this.altura = 0;
    }

    public Triangulo(double base, double altura) {
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
       return (base * altura)/2;
    }
    
    private double calcularHip(){
        return Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
    }

    @Override
    public double calcularPeri() {
      return base + altura + calcularHip();
    }
    
}
