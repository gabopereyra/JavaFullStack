/*
Crear una clase llamada Alumno que mantenga información sobre las notas de
distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una lista
de tipo Integer con sus 3 notas.

En el main deberemos tener un bucle que crea un objeto Alumno. Se pide toda la
información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no. 

Despues de ese bluce tendremos el siguiente método en la clase Alumno: 
Metodo notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular
su nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al
método. Dentro del método se usará la lista notas para calcular el promedio final
de alumno. Siendo este promedio final, devuelto por el método y mostrado en el
main. 
Ejemplo de una colección como atributo: ColeccionAtributo
 */
package ejercicio3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        boolean ans = true;

        ArrayList<Alumno> alumnos = new ArrayList();

        while (ans) {

            ArrayList<Integer> notas = new ArrayList();

            System.out.println("Ingrese el nombre del alumno: ");
            String nombre = read.next();

            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese la " + (i + 1) + "º nota:");
                notas.add(read.nextInt());
            }
            Alumno nuevoAlumno = new Alumno(nombre, notas);
            alumnos.add(nuevoAlumno); //Se adiciona a la lista que guarda los nombres

            ans = question(read);

            System.out.println(notaFinal(read, alumnos));
        } 
    } //fin main

    //Metodo pregunta
    public static boolean question(Scanner read) {
        System.out.println("\nDesea agregar un nuevo alumno? (S/N)");
        String ans = read.next().toUpperCase();
        while (!ans.equals("S") && !ans.equals("N")) {
            System.out.println("El valor indicado es incorrecto, intente nuevamente:");
            ans = read.next().toUpperCase();
        }
        return ans.equals("S");
    } //Fin metodo pregunta
    //metodo para calculo nota

    public static double notaFinal(Scanner read,ArrayList<Alumno> alumnos ) {
        double nota = 0;

        System.out.println("Ingrese el nombre del alumno a buscar: ");
        String nombre = read.next();
        for (Alumno elemento : alumnos) {
            if (elemento.getNombre().equals(nombre)) {
                System.out.println("La nota final del alumno es: ");
                nota = ((double) elemento.getNotas().get(0)+(double) elemento.getNotas().get(1)+(double) elemento.getNotas().get(2))/3;
            }else{
                System.out.println("No se ha encontrado un alumno con dicho nombre.");
            }
        }
        return nota;
    } //metodo nota final
    
        public static double notaFinal__(Scanner read,ArrayList<Alumno> alumnos ) {
        double nota = 0;

        System.out.println("Ingrese el nombre del alumno a buscar: ");
        String nombre = read.next();
        for (Alumno elemento : alumnos) {
            if (elemento.getNombre().equals(nombre)) {
                System.out.println("La nota final del alumno es: ");
                Iterator <Integer> iterator = (Iterator <Integer>) elemento.getNotas();
                while(iterator.hasNext()){
                    //nota =+ (double) iterator.next();
                    System.out.println(iterator.next());
                }
                //nota = nota/3;
                
            }else{
                System.out.println("No se ha encontrado un alumno con dicho nombre.");
            }
        }
        return nota;
    } //metodo nota final
    
    
}
