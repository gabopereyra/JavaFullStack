package ejercicio5;

public class Circulo implements calculosFormas {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public Circulo() {

    }

    @Override
    public double obtenerArea() {
        return PI * (Math.pow(radio, 2));
    }

    @Override
    public double obtenerPerimetro() {
        return PI * diametro();
    }

    private double diametro() {
        return radio * 2;
    }
}
