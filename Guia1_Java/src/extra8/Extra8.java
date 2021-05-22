/*
Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe detener la lectura 
y mostrar la cantidad de números leídos, la cantidad de números pares y la cantidad de números impares. Los números negativos 
no deben sumarse.
 */
package extra8;

import java.util.Scanner;

public class Extra8 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num;
        int par = 0;
        int impar = 0;
        int count = 0;

        do {
            System.out.println("Ingrese un número entero");
            num = read.nextInt();
            if (num > 0 ){
                if(num%2==0){
                    par ++;
                }else{
                    impar ++;
                }
                count ++;
            }
        } while (num%5 != 0);
        System.out.println("Los numeros leidos son: "+count+"\nTotal pares: "+par+"\nTotal impares: "+impar);
    }

}
