/*
Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por debajo de 1.60 mts. 
y el promedio de estaturas en general
 */
package extra6;
import java.util.Scanner;
public class Extra6 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double[] data;
        int quantity;
        System.out.println("Indique la cantidad de datos a cargar");
        quantity = read.nextInt();
        data = new double[quantity];
        int sum = 0;
        double total = 0;
        for (int i = 0; i < quantity; i++) {
            System.out.println("Ingrese el dato nº "+(i+1));
            data[i] = read.nextDouble();
            if(data[i] < 1.6){
                sum ++;
                total +=data[i];
            }
        }
        
        System.out.println("La cantidad de personas con una altura menor a 1.6 es: "+sum);
        if (total!=0) {
            System.out.println("El promedio de altura de estas personas es: "+(total/sum));
        } else{
            System.out.println("No se encontraron datos menores a 1.6");
        }
    }
    
}
