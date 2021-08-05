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
import java.time.*;
import java.time.Period;
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

        Date fechaCargada = new Date((anio - 1900), (mes - 1), dia);
        System.out.println("La fecha cargada es la siguiente: " + fechaCargada);

        Date fechaActual = new Date();

        System.out.println("La diferencia de años entre la fecha actual y la cargada es de: " + (fechaActual.getYear() - fechaCargada.getYear()) + " años.");
        long resta = fechaActual.getTime() - fechaCargada.getTime();
        //Date resta = new Date (fechaActual.getTime()-fechaCargada.getTime());
        Date finalFecha = new Date(resta);

        System.out.println("la resta es:" + resta);
        System.out.println("La fecha final es: " + finalFecha.toString());
        //System.out.println("La diferencia es: "+resta.getYear()+"anios"+resta.getMonth()+"meses"+resta.getDay()+"dias");

        System.out.println("");
        System.out.println("Ahora vamos a usar el otro metodo (TIME)");

        System.out.println("La fecha cargada es: " + LocalDate.of(anio, mes, dia));
        Period period = Period.between(LocalDate.of(anio, mes, dia), LocalDate.now());

        int years = Math.abs(period.getYears());
        int months = Math.abs(period.getMonths());
        int days = Math.abs(period.getDays());
        System.out.println("Diference is : " + years + " year, " + months + " months, " + days + " days");

        System.out.println(period);
        
        // DateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        // System.out.println("\nFecha ingresada: " + formatoFecha.format(fecha1));

        //
    } //End main

}
