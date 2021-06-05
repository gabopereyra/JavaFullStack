/*
. Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los
guarda en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero,
si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el
error. Si no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a
pasar una división por cero, el método devuelve 0 y se le informa al usuario el
error se le informa al usuario. Si no, se hace la división y se devuelve el resultado
al main.
 */
package ejercicio3;

import java.util.Scanner;

public class Operacion {

    private int numero1;
    private int numero2;

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    } //End Constructor (punto A)

    public Operacion() {
    } //End Constructor (empty) (punto B)

    //public crearOperacion
    //
    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    // Punto (c)

    public void crearOperacion(){
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el valor del primer número: ");
        //this.numero1 = read.nextInt(); Se puede utilizar este en lugar del set, dado que estamos dentro de la misma clase
        setNumero1(read.nextInt());        
        System.out.println("Ingrese el valor del segundo número: ");
        setNumero2(read.nextInt());
    } //Punto D
    
    public int sumar(){
        int suma = numero1 + numero2;
        return suma;
    }//Punto E
    
    public int resta(){
        int resta = numero1 - numero2;
        return resta;
    }//Punto F
    
    public int multiplicar(){
        int multiplicacion;
        if (numero1 == 0 || numero2==0){
            System.out.println("ERROR, al menos uno de los valores tenia un valor de cero");
            multiplicacion = 0;        
        } else{
            multiplicacion = numero1*numero2;
        }
        return multiplicacion;
    } //Punto G
    
    public double dividir(){
        double division;
           if (numero2==0){
                  System.out.println("ERROR, el divisor es igual a cero");
            division = 0;
           } else{
               division = (double) numero1 / numero2;
           }
        return division;
    }

}
