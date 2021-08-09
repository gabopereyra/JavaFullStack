/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

/**
 *
 * @author Gabriel
 */
public class Velero extends Barco {

    private int numeroMastiles;

    public Velero() {

    }

    public Velero(String matricula, double eslora, int anioFabricacion, int numeroMastiles) {
        super(matricula, eslora, anioFabricacion);
        this.numeroMastiles = numeroMastiles;
    }

    @Override
    public double calcularModulo() {
        return (super.calcularModulo() + (double) this.numeroMastiles);
    }

}
