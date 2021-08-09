/*
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de
fabricación.
 */
package ejercicio4;

public class Barco {

    protected String matricula;
    protected double eslora;
    protected int anioFabricacion;
    protected double modulo;

    public Barco(String matricula, double eslora, int anioFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
        this.modulo = calcularModulo();
    }

    public Barco() {

    }

    public double calcularModulo() {
        return (eslora*10);
    }
    
    
}
