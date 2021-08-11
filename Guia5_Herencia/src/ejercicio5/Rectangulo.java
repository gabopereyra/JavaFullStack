package ejercicio5;

public class Rectangulo implements calculosFormas {

    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
    }

    @Override
    public double obtenerArea() {
        return (base*altura);
    }

    @Override
    public double obtenerPerimetro() {
        return (base+altura)*2;
    }

}
