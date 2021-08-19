/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Scanner;

public class DivisionNumero {

    Scanner read = new Scanner(System.in).useDelimiter("\n");
    private int numeroUno;
    private int numeroDos;

    public DivisionNumero() {
    }

    public DivisionNumero(int numeroUno, int numeroDos) {
        this.numeroUno = numeroUno;
        this.numeroDos = numeroDos;
    }

    public void ingresar() {
        try {
            System.out.println("Ingrese el primer numero");
            String numUno = read.next();
            System.out.println("Ingrese el segundo numero");
            String numDos = read.next();
            parsear(numUno, numDos);
       
        } catch (java.util.InputMismatchException e) {
            System.out.println("El dato ingresado no es del tipo String.");
            System.out.println(e);
        }
    }

    public void parsear(String uno, String dos) {
        try {
            this.numeroUno = Integer.parseInt(uno);
            this.numeroDos = Integer.parseInt(dos);
            dividir();
        } catch (NumberFormatException e) {
            System.out.println("No se han podido convertir los datos.");
        }
    }

    private void dividir() {

        try {
            System.out.println("La division es: " + this.numeroUno / this.numeroDos);
        } catch (ArithmeticException e) {
            System.out.println("No es posible dividir por cero.");
        }

    }
}
