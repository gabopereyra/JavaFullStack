package ejercicio8;
import java.util.Scanner;
public class ejercicio8 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un número entero");
        int num = read.nextInt();
        if (num%2 == 0){
            System.out.println("El número ingresado es par");
        } else{
            System.out.println("El número ingresado es impar");
        }
    }
}

/*Crear un programa que dado un numero determine si es par o impar.*/