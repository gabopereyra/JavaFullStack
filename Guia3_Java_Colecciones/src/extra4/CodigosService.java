package extra4;

import java.util.HashMap;
import java.util.Scanner;

public class CodigosService {

    Scanner read = new Scanner(System.in).useDelimiter("\n");

    public static void showAll(HashMap<Integer, String> codigos) {
        System.out.println("-------------------------\nLas ciudades del listado son:");
        codigos.entrySet().forEach((entrada) -> {
            System.out.println("CIUDAD: " + entrada.getValue() + ", CODIGO POSTAL: " + entrada.getKey());
        });
//                for (Map.Entry<Integer, String> entrada : codigos.entrySet()) {
//            System.out.println("CIUDAD: " + entrada.getValue() + ", CODIGO POSTAL:"
//                    + entrada.getKey());
//        }
        System.out.println("-------------------------");
    }//End ShowAll

    public void findCity(HashMap<Integer, String> codigos) {
        System.out.println("-------------------------");
        System.out.println("Indique el codigo de la ciudad a buscar:");
        Integer code = read.nextInt();
        if (codigos.containsKey(code)) {
            System.out.println("La ciudad asociada es: " + codigos.get(code) + ".");
        } else {
            System.out.println("La ciudad no se encuentra en el listado.");
        }
        System.out.println("-------------------------");
    } //End findCity
    
    public void delete(HashMap<Integer, String> codigos) {
                System.out.println("-------------------------");
        System.out.println("Indique el codigo de la ciudad a eliminar:");
        Integer code = read.nextInt();
        if (codigos.containsKey(code)) {
            System.out.println("La ciudad asociada: <" + codigos.get(code) + "> ha sido removida.");
            codigos.remove(code);
        } else {
            System.out.println("La ciudad no se encuentra en el listado.");
        }
        System.out.println("-------------------------");
    } //End Delete
}
