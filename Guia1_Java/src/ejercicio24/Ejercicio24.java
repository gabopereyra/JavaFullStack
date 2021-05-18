/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, 
cuántos de 2 dígitos, etcétera (hasta 5 dígitos)
 */
package ejercicio24;

import java.util.Scanner;

public class Ejercicio24 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num;
        int[] vec;
        int countOne = 0;
        int countTwo = 0;
        int countThree = 0;
        int countFour = 0;
        int countFive = 0;

        System.out.println("Indique el tamaño del vector:");
        num = read.nextInt();

        vec = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.println("Indique el valor para la posición "+i+".");
            vec[i] = read.nextInt();
        }
        System.out.println("---Se ha generado un vector---");

        for (int i = 0; i < num; i++) {
            String evaluar = String.valueOf(vec[i]);
            switch (evaluar.length()) {
                case 1:
                    countOne++;
                    break;
                case 2:
                    countTwo++;
                    break;
                case 3:
                    countThree++;
                    break;
                case 4:
                    countFour++;
                    break;
                default:
                    countFive++;
                    break;
            }
        } // fin for to count the numbers
        System.out.println("De 1 digito hay " + countOne+" numeros");
        System.out.println("De 2 digitos hay " + countTwo+" numeros");
        System.out.println("De 3 digitos hay " + countThree+" numeros");
        System.out.println("De 4 digitos hay " + countFour+" numeros");
        System.out.println("De 5 digitos hay " + countFive+" numeros");
    }
}