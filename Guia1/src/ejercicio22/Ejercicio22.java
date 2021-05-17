/*
Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y 
los muestre por pantalla en orden descendente.
 */
package ejercicio22;

public class Ejercicio22 {

    public static void main(String[] args) {
        int[] vec = new int[100];
        int num = 100;
        for(int i=0; i<100; i++){
            vec[i] = num;
            num -=1;
            System.out.println(vec[i]);
        }
    }
}
