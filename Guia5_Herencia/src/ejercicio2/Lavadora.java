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
public class Lavadora extends Electrodomestico {

    private Double carga;

    public Lavadora(Double precio, String color, char consumoEnergetico, Double peso, Double carga) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public Lavadora() {
    }

    public Double getCarga() {
        return carga;
    }

    public void setCarga(Double carga) {
        this.carga = carga;
    }

    /* Método crearLavadora (): este método llama a crearElectrodomestico() de la
    clase padre, lo utilizamos para llenar los atributos heredados del padre y
    después llenamos el atributo propio de la lavadora.*/
    public void crearLavadora() {
        System.out.println("Indique la capacidad de carga:");
        Double carga = read.nextDouble();
        read.nextLine();
        this.carga = carga;
        
        crearElectrodomestico();
    }

    /*Método precioFinal(): este método será heredado y se le sumará la siguiente
    funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500,
    si la carga es menor o igual, no se incrementará el precio. Este método debe
    llamar al método padre y añadir el código necesario. Recuerda que las
    condiciones que hemos visto en la clase Electrodoméstico también deben
    afectar al precio*/
    @Override
    public double precioFinal() {
        double value = super.precioFinal();
        if (this.carga > 30.0) {
            value += 500.0;
        }
        return value;
    }

    @Override
    public String toString() {
        return "COLOR " + this.color + " PRECIO " + this.precio + " CARGA " + this.carga + " eficiencia " + this.consumoEnergetico + " peso " + this.peso + " ";
    } //borrar luego

}
