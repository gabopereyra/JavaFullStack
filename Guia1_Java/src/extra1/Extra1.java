/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si 
el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 
horas.
 */
package extra1;
import java.util.Scanner;
public class Extra1 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el tiempo en minutos");
        double min = read.nextInt(); //lo vamos a guardar como double para poder transformarlo en dias y ese dia posteriormente en horas
        double diasDouble = min/1440; //Auxiliar
        int dias = (int) diasDouble; //Cantidad de dias (entero)
        double horasDouble = (double) ((diasDouble-dias)*24); //auxiliar para ver cantidad de horas
        int horas = (int) horasDouble; //cantidad de horas (entero)
        //int horas = min/60;
        //int dias = horas/24;
        System.out.println("El equivalente es "+dias+" dia(s) "+horas+" hora(s).");
    }
}
