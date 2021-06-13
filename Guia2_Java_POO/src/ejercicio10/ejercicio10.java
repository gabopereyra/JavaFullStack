/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un 
arreglo A de 50 números reales, y el segundo B, un arreglo de 20 números, también 
reales. El programa deberá inicializar el arreglo A con números aleatorios y mostrarlo 
por pantalla. Luego, el arreglo A se debe ordenar de menor a mayor y copiar los 
primeros 10 números ordenados al arreglo B de 20 elementos, y rellenar los 10 
últimos elementos con el valor 0.5. Mostrar los dos arreglos resultantes: el ordenado 
de 50 elementos y el combinado de 20.
 */
package ejercicio10;

import java.util.Arrays;

public class ejercicio10 {

    public static void main(String[] args) {
        double[] arrayUno = new double[50];
        double[] arrayDos = new double[20];

        System.out.println("MOSTAR ARRAY UNO:");
        for (int i = 0; i < arrayUno.length; i++) {
            arrayUno[i] = (int) Math.floor(Math.random() * (100 + 1));
            System.out.print(arrayUno[i] + " - ");
        } //Crear y mostrar vector

        Arrays.sort(arrayUno); //Ordena array de 50 elementos

        //Crear vector DOS
        System.arraycopy(arrayUno, 0, arrayDos, 0, 10);
        for (int i = 10; i < arrayDos.length; i++) {
            arrayDos[i] = 0.5;
        }
        //Fin Creacion vector dos
        
        System.out.println("\n\nMOSTAR ARRAYS FINALES:");
        for (int i = 0; i < arrayUno.length; i++) {
            System.out.print(arrayUno[i] + " - ");
        } //Mostrar vector uno
        System.out.println("");
        for (int i = 0; i < arrayDos.length; i++) {
            System.out.print(arrayDos[i] + " - ");
        } //Mostrar vector dos

    } //End main

} //End class
