package extra1;

public class Polideportivo extends Edificio {

    private String nombre;
    private boolean esTechado;

    public Polideportivo(String nombre, boolean esTechado, Double ancho, Double alto, Double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.esTechado = esTechado;
    }

    public Polideportivo() {
    }

    @Override
    public Double calcularSuperficie() {
        return getAncho() * getLargo();
    }

    @Override
    public Double calcularVolumen() {
        return getAncho() * getLargo() * getAlto();
    }

    public boolean isEsTechado() {
        return esTechado;
    }

    
}
