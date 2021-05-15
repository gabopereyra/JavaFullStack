package ejercicio7;
import java.util.Scanner;
public class ejercicio7 {

public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num_uno;
        int num_dos;
        System.out.println("Ingrese el primer valor:");
        num_uno = read.nextInt();
        System.out.println("Ingrese el segundo valor:");
        num_dos = read.nextInt();
        if(num_uno>=num_dos){
            System.out.println("El numero uno es mayor");
        } else {
            System.out.println("El numero dos es mayor");
        }
    }
    
}
