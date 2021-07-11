/*
Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado
y los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
programa mostrará por pantalla el número de valores que se han leído, su suma y su
media (promedio).
 */
package extra1;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Numeros {

    Scanner read = new Scanner(System.in);
    List<Integer> numeros = new ArrayList();

    public void ejecutar() {
        Integer num;
        
        System.out.println("Ingrese un número entero: (para detener el programa ingrese -99)");
        num = read.nextInt();

        if (!(num == -99)) {
            numeros.add(num);
            
            while (!(num == -99)) {
                System.out.println("Ingrese un número entero: (para detener el programa ingrese -99)");
                num = read.nextInt();
                if (!(num == -99)) {
                    numeros.add(num);
                }
            } //Fin while

            System.out.println("La cantidad elementos guardados es: " + numeros.size());
            System.out.println("La sumatoria de los elementos es: " + suma());
            promedio();
            
        } else {
            System.out.println("El programa se detuvo sin inserción de datos.");
        }
    } //Fin ejecutar

    //Suma
    private Integer suma() {
        Integer sum = 0;
        for (Integer numero : numeros) {
            sum += numero;
        }
        return sum;
    }
    //Fin suma

    //Promedio
    private void promedio() {
        System.out.println("El promedio de los elementos es: " + (suma() / numeros.size()));
    }
    //Fin promedio

}
