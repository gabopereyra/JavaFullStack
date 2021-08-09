/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

public class Yate extends BarcoMotor {

    private int cantidadCamarotes;

    public Yate() {

    }

    public Yate(String matricula, double eslora, int anioFabricacion, int potencia, int cantidadCamarotes) {
        super(matricula, eslora, anioFabricacion, potencia);
        this.cantidadCamarotes = cantidadCamarotes;
    }

    @Override
    public double calcularModulo() {
        return (super.calcularModulo() + (double) this.cantidadCamarotes);
    }
}
