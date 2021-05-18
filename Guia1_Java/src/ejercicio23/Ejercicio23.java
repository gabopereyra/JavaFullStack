/*
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le 
pida al usuario un numero a buscar en el vector. El programa mostrará donde se 
encuentra el numero y si se encuentra repetido
 */
package ejercicio23;

import java.util.Scanner;

public class Ejercicio23 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num;
        int[] vec;
        int buscar;
        int contador = 0;
        System.out.println("Indique el tamaño del vector");
        num = read.nextInt();

        vec = new int[num];
        for (int i = 0; i < num; i++) {
            vec[i] = (int) (Math.random() * 11);
        }
        System.out.println("Se ha generado un vector aleatorio (numeros entre 0 y 10 inclusive");

        System.out.println("Indique el numero a buscar en el vector");
        buscar = read.nextInt();
        for (int i = 0; i < num; i++) {
            if (buscar == vec[i]) {
                System.out.println("El número se encuentra en la posición " + i);
                contador += 1;
            }
        }
        if (contador > 1) {
            System.out.println("El numero se encuentra repetido");
            System.out.println("Aparece " + contador + " veces");
        }
        if(contador == 0){
            System.out.println("El numero NO se encuentra en el vector");
        }
        for (int i = 0; i < num; i++) {
            System.out.println(vec[i]);
        }
    }
}
