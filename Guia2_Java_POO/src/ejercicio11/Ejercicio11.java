/*
En este ejercicio deberemos instanciar en el main, una fecha 
usando la clase Date, para esto vamos a tener que crear 3 variables, dia, mes y anio 
que se le pedirán al usuario para poner el constructor del objeto Date. Una vez 
creada la fecha de tipo Date, deberemos mostrarla y mostrar cuantos años hay entre 
esa fecha y la fecha actual, que se puede conseguir instanciando un objeto Date con 
constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 */
package ejercicio11;

import java.util.Date;
import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        int dia;
        int mes;
        int anio;
        
        System.out.println("Indique el dia (en numeros enteros):");
        dia = read.nextInt();
        System.out.println("Indique el mes (en numeros enteros):");
        mes = read.nextInt();
        System.out.println("Indique el año (en numeros enteros):");
        anio = read.nextInt();
        
        Date fechaCargada = new Date((anio-1900), (mes-1), dia);
        System.out.println("La fecha cargada es la siguiente: "+fechaCargada);
        
        Date fechaActual = new Date();
        
        System.out.println("La diferencia de años entre la fecha actual y la cargada es de: "+(fechaActual.getYear()-fechaCargada.getYear())+" años.");
        
    } //End main
    
}
