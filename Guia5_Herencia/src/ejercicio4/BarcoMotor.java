/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

public class BarcoMotor extends Barco {

    private int potencia;

    public BarcoMotor() {

    }

    public BarcoMotor(String matricula, double eslora, int anioFabricacion, int potencia) {
        super(matricula, eslora, anioFabricacion);
        this.potencia = potencia;
    }

    @Override
    public double calcularModulo() {
        return (super.calcularModulo() + (double) this.potencia);
    }
}
