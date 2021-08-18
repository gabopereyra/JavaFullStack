/*
 Definir una Clase que contenga algún tipo de dato de tipo array y agregue el 
código para generar y capturar una excepción ArrayIndexOutOfBoundsException
(índice de arreglo fuera de rango).
 */
package ejercicio2;

import java.util.Scanner;

public class ClasePrueba {
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    private int[] arreglo;

    public ClasePrueba(int[] arreglo) {
        this.arreglo = arreglo;
    }

    public ClasePrueba() {

    }
    
    public void recorrer(){
        System.out.println("Indique la cantidad de iteraciones: ");
        int cantidad = read.nextInt();
        try {
            for (int i = 0; i < cantidad; i++) {
                System.out.println("El elemento "+i+" es: "+arreglo[i]);
        }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        
    }

}
