/*
Crea una clase en Java donde declares una variable de tipo array de Strings que
contenga los doce meses del año, en minúsculas. A continuación declara una variable
mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo
mesSecreto = mes[9]. 

El programa debe pedir al usuario que adivine el mes secreto.

Si el usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar
adivinar el mes secreto. Un ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
No ha acertado. Intente adivinarlo introduciendo otro mes: octubre
¡Ha acertado!
 */
package extra5;
import java.util.Scanner;

public class Meses {
    Scanner read = new Scanner(System.in);
    private final String mes[] = {"enero", "febrero","marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
    
    public void adivinarMes(){
        String mesAdivinar = mes[(int) (Math.random() * 12)];
        System.out.println("Indique que mes cree es el correcto: ");
        String mesUsuario = read.nextLine();
        while(!mesAdivinar.equals(mesUsuario.toLowerCase())){
            System.out.println("El mes ingresado es incorrecto, intente nuevamente:");
            mesUsuario = read.nextLine();
        }
        System.out.println("Eureka!! has acertado!!");
    }
}
