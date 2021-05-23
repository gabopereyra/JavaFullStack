/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los 
datos de las personas ingresadas por teclado e indique si son mayores o menores 
de edad. Después de cada persona, el programa debe preguntarle al usuario si 
quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra 
“No”.
 */
package extra15;

import java.util.Scanner;

public class Extra15 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        boolean continuation;
        do {
            continuation = askForInformation(read);
            System.out.println(continuation);
        } while (continuation);
    } //end main

    private static boolean askForInformation(Scanner read) {
        String name;
        boolean haveToContine;
        int age;
        
        System.out.println("Ingrese el nombre de la persona: ");
        name = read.next();
        System.out.println("Ingrese la edad de la persona: ");
        age = read.nextInt();
        
        if (isOlder(age)) {
            System.out.println(name + " es mayor de edad");
        } else {
            System.out.println(name + " NO es mayor de edad");
        }
        
        haveToContine = answer(read);
        return haveToContine;
    } //end ask for information

    private static boolean answer(Scanner read) {
        boolean answer = false;
        String question;

        System.out.println("¿Desea cargar los datos de otra persona? (N: no), (S: si)");
        question = read.next().toLowerCase();

        while (question.equals("s") && question.equals("n")) {
            System.out.println("La opción es inválida, intente nuevamente");
            question = read.next();
        }

        if (question.equals("s")) {
            answer = true;
        }
        return answer;
    }

    private static boolean isOlder(int age) {
        boolean answer = false;
        if (age >= 18) {
            answer = true;
        }
        return answer;
    } //end function is older

}//end public class
