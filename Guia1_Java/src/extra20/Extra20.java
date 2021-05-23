/*
Los profesores del curso de programación de Egg necesitan llevar un registro de las notas adquiridas 
por sus 10 alumnos para luego obtener una cantidad de aprobados y desaprobados. Durante el periodo 
de cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos evaluativos y 2 por parciales. 
Las ponderaciones de cada nota son:
-> Primer trabajo práctico evaluativo 10% 
-> Segundo trabajo práctico evaluativo 15% 
-> Primer Integrador 25% 
-> Segundo integrador 50% 
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del programa los 
profesores necesitan obtener por pantalla la cantidad de aprobados y desaprobados, teniendo en cuenta 
que solo aprueban los alumnos con promedio mayor o igual al 7 de sus notas del curso.
 */
package extra20;

import java.util.Scanner;

public class Extra20 {

    public static void main(String[] args) {
        approvedChecker();
    } //endMain

    private static void approvedChecker() {

        int countApproved = 0;
        int countDisapproved = 0;
        double [] vectorNotes = createVector();
        for (double i : vectorNotes) {
            if (i >= 7) {
                countApproved++;
            } else {
                countDisapproved++;
            }
        }//For each sintaxis

        System.out.println("La cantidad de alumnos aprobados es: " + countApproved + "\nLa cantidad de alumnos desaprobados es: " + countDisapproved);

    } //end function

    private static double loadNotes() {
        Scanner read = new Scanner(System.in);
        int primerTrabajo = 0;
        int segundoTrabajo = 0;
        int primerIntegrador = 0;
        int segundoIntegrador = 0;
        double averageNotes;

        System.out.println("Ingrese la nota del primer trabajo");
        primerTrabajo = checkNote(primerTrabajo, read);

        System.out.println("Ingrese la nota del segundo trabajo");
        segundoTrabajo = checkNote(segundoTrabajo, read);

        System.out.println("Ingrese la nota del primer integrador");
        primerIntegrador = checkNote(primerIntegrador, read);

        System.out.println("Ingrese la nota del segundo integrador");
        segundoIntegrador = checkNote(segundoIntegrador, read);

        averageNotes = primerTrabajo * 0.1 + segundoTrabajo * 0.15 + primerIntegrador * 0.25 + segundoIntegrador * 0.5;

        return averageNotes;
    } //Average every note

    private static double[] createVector() {
        double[] vector = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese los datos del " + (i + 1) + "º alumno/a:");
            vector[i] = loadNotes();
        }

        return vector;
    } //End create vector

    private static int checkNote(int nota, Scanner read) {
        nota = read.nextInt();
        while (nota < 1 || nota > 10) {
            System.out.println("El valor ingresado es invalido, intente nuevamente");
            nota = read.nextInt();
        }
        return nota;
    } //End checker of notes 

}
