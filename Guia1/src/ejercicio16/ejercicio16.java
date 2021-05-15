package ejercicio16;

import java.util.Scanner;

public class ejercicio16 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int suma = 0;
        int num;
        int i;
        for (i=1; i<20; i++){
            System.out.println("Ingrese el número "+i);
            num = read.nextInt();
            suma = suma + num;
            if(num==0){
                System.out.println("Se capturó el numero cero");
                break;
            }
        }
        System.out.println("La sumatoria de numeros es "+suma);
        System.out.println("El bucle realizó "+i+" iteraciones");
    }
}


/*Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe 
salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa 
deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el 
número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break*/