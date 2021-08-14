package extra1;

public abstract class Edificio {

    private Double ancho;
    private Double alto;
    private Double largo;

    public Edificio(Double ancho, Double alto, Double largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }

    public Edificio() {

    }

    public abstract Double calcularSuperficie();

    public abstract Double calcularVolumen();

    public Double getAncho() {
        return ancho;
    }

    public Double getAlto() {
        return alto;
    }

    public Double getLargo() {
        return largo;
    }
    
    
}
