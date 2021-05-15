/*
. Realizar un programa que simule el funcionamiento de un dispositivo RS232, este 
tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar 
con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer 
carácter tiene que ser X y el último tiene que ser una O. 
Las secuencias leídas que respeten el formato se consideran correctas, la 
secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda 
secuencia distinta de FDE, que no respete el formato se considera incorrecta. 
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas 
correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo 
se utilizan las siguientes funciones de Java Substring(), Length(), equals().
 */
package ejercicio17;

import java.util.Scanner;

public class ejercicio17 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        int correcto = 0;
        int incorrecto = 0;
        String frase;
         
        do {
            System.out.println("Ingrese una frase");
            frase = read.next();
            if (frase.length()== 5){
                if(frase.substring(0,1).equals("X") && frase.substring(4,5).equals("O")){
                    correcto = correcto + 1;
                } else{
                    incorrecto = incorrecto + 1;
                }
            } else {
                incorrecto = incorrecto + 1;
            }
        } while(!frase.equals("&&&&&"));
        
        System.out.println("La cantidad de ingresos incorrectos son: " + (incorrecto-1));
        System.out.println("La cantidad de ingresos incorrectos son: " + correcto);
    }
}
