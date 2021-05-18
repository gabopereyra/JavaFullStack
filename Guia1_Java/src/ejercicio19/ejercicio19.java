/*
 Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, 
si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * * 
*     *
*     *
* * * *
 */
package ejercicio19;

import java.util.Scanner;

public class ejercicio19 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del cuadrado a generar:");
        int size = read.nextInt();
        for (int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                if(i==0 || i==(size-1)){
                    System.out.print("*");
                }else{
                    if(j==0 || j==(size-1)){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
        }
    }
}
