/*
Almacena en un HashMap los códigos postales de 10 ciudades a elección de esta
página: https://mapanet.eu/index.htm. Nota: Poner el código postal sin la letra, solo el
numero.
• Pedirle al usuario que ingrese 10 códigos postales y sus ciudades.
• Muestra por pantalla los datos introducidos
• Pide un código postal y muestra la ciudad asociada si existe sino avisa al
usuario.
• Muestra por pantalla los datos
• Agregar una ciudad con su código postal correspondiente más al HashMap.
• Elimina 3 ciudades existentes dentro del HashMap, que pida el usuario.
• Muestra por pantalla los datos
 */
package extra4;

import java.util.HashMap;
import java.util.Scanner;

public class Extra4 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        HashMap<Integer, String> codigos = new HashMap();
        CodigosService servicio = new CodigosService();

        Integer codigo;
        String nombre;

        for (int i = 0; i < 10; i++) {
            System.out.println("Inserte el nombre de la ciudad:");
            nombre = read.next();
            System.out.println("Indique el codigo postal:");
            codigo = read.nextInt();
            codigos.put(codigo, nombre);
        }
        servicio.showAll(codigos);
        servicio.findCity(codigos);

        //Ingreso nueva ciudad
        System.out.println("A continuación se va a agregar una nueva ciudad.\n"
                + "Inserte el nombre de la ciudad:");
        nombre = read.next();
        System.out.println("Indique el codigo postal:");
        codigo = read.nextInt();
        codigos.put(codigo, nombre);
        //FIN Ingreso nueva ciudad

        //Eliminar ciudades
        System.out.println("A continuación se pediran los datos de tres ciudades y se eliminarán del registro.");
        for (int i = 0; i < 3; i++) {
            servicio.delete(codigos);
        }
        //Fin eliminar

        servicio.showAll(codigos);
    }

}
