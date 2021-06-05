/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio 
de tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo
del objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio!).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
 */
package ejercicio2;

import java.util.Scanner;

public class Circunferencia {

    Scanner read = new Scanner(System.in);

   private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    } //End Constructor (punto a)

    public Circunferencia() {
    } //end empty constructor
   
    
    public double getRadio() {
        return radio;
    } //(punto b)

    public void setRadio(double radio) {
        this.radio = radio;
    } //(punto b)
    
    public void crearCircunferencia(){
        System.out.println("Ingrese el valor del radio: ");
        this.radio = read.nextInt();
    } //(punto C)

    public double area() {
        double area = Math.sqrt(radio) * Math.PI;
        return area;
    }//End area (punto D)

    public double perimetro() {
        double perimetro = radio * 2 * Math.PI;
        return perimetro;
    }//End perimetro (punto E)

}
