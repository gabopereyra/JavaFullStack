/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author Gabriel
 */
public class Televisor extends Electrodomestico {

    private Double resolucion;
    private boolean TDT;

    //resolución (en pulgadas) y sintonizador TDT (booleano)
    Televisor(Double precio, String color, char consumoEnergetico, Double peso, Double resolucion, boolean TDT) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.TDT = TDT;
    }

    Televisor() {
    }

    public Double getResolucion() {
        return resolucion;
    }

    public void setResolucion(Double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTDT() {
        return TDT;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }

    public void crearTelevisor() {
        System.out.println("Indique las pulgadas del equipo:");
        this.resolucion = read.nextDouble();
        read.nextLine();
        System.out.println("Indique si el equipo posee TDT (true/false):");
        this.TDT = read.nextBoolean();
        read.nextLine();

        crearElectrodomestico();
        precioFinal();
    }

    /*Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado,
aumentará $500. Recuerda que las condiciones que hemos visto en la clase
Electrodomestico también deben afectar al precio*/
    public double precioFinal() {
        double value = super.precioFinal();
        if (this.resolucion > 40.0) {
            value *= 1.3;
        }
        if (this.TDT) {
            value += 500;
        }
        return value;
    }

}
