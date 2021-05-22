/*
Realice un programa para que el usuario adivine el resultado de una multiplicación entre 
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir 
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue 
como utilizar la función Math.random() de Java.
 */
package extra10;

import java.util.Scanner;

public class Extra10 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int product;
        int result;
        boolean isTrue = false;

        System.out.println("Se va a realizar una multiplicación aleatoria, cuyo valor será de 0 a 100");

        do {
            System.out.println("Indique que valor cree se obtendrá");
            result = read.nextInt();
            product = (int) ((Math.random() * 10) * (Math.random() * 10));
            
            if(result==product){
                System.out.println("Has adivinado!!");
                isTrue = true;
            } else{
                System.out.println("No has adivinado ='(");
                System.out.println("¿Deseas intentar de nuevo? (S/N)");
                String ans = read.next().toLowerCase();
                while(!ans.equals("s") && !ans.equals("n")){
                    System.out.println("La opcion ingresada es incorrecta, intente nuevamente");
                    ans=read.next().toLowerCase();
                }
                if (ans.equals("n")) {
                    isTrue=true;
                }
            }
        } while (!isTrue);
        System.out.println("Gracias por haber participado!!!");
    }

}
