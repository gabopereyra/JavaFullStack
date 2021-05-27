/*
Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los 
elementos).
 */
package extra18;

import java.util.Scanner;

public class Extra18 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        int [] vectorOne;
        int [] vectorTwo;
        int dimension;
        
        System.out.println("Indique que dimensión tendrán los vectores:");
        dimension = read.nextInt();
        while(dimension<1){
            System.out.println("El valor ingresado es inválido, por favor intente nuevamente");
            dimension = read.nextInt();
        }
        
        System.out.println("Cargue los valores del vector uno");
        vectorOne = createVector(dimension, read);
        System.out.println("\nCargue los valores del vector dos");
        vectorTwo = createVector(dimension, read);
               
        if(areEquals(vectorOne, vectorTwo, dimension)){
            System.out.println("Los vectores son iguales");
        }else{
            System.out.println("NO SON iguales");
        }
        
    } //End main
    
    private static int[] createVector(int dimension, Scanner read) {
        int vector[];
        vector = new int[dimension];
        
        for (int i = 0; i < dimension; i++) {
            System.out.println("Indique el valor para la posición " + i);
            vector[i] = read.nextInt();
        }
        
        return vector;
    }//End create vector

    private static boolean areEquals(int[] vectorOne, int[] vectorTwo, int dimension) {
        boolean answer = true;
        for (int i = 0; i < dimension && answer; i++) {
            if (vectorOne[i] !=vectorTwo[i] ) {
                answer = false;
            }
        }
       return answer; 
    } //end check function
    
}//End public class
