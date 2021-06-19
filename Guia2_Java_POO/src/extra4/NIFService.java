
package extra4;

import java.util.Scanner;

public class NIFService {

    Scanner read = new Scanner(System.in);
    String auxiliar[] = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

    /*• Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
    corresponderá. Una vez calculado, le asigna la letra que le corresponde según el
    resultado del calculo.
    La letra correspondiente al dígito verificador se calculará a traves de un método que 
    funciona de la siguiente manera: Para calcular la letra se toma el resto de dividir el 
    número de DNI por 23 (el resultado debe ser un número entre 0 y 22). El método debe 
    buscar en un array (vector) de caracteres la posición que corresponda al resto de la 
    división para obtener la letra correspondiente */
    public NIF crearNif() {
        NIF persona = new NIF();
        long dni;

        System.out.println("Ingrese el DNI de la persona:");
        dni = read.nextLong();
        persona.setDNI(dni);

        persona.setLetra(auxiliar[(int) (dni % 23)]);

        return persona;
    }
    
    //FIN METODO CREAR
    
    /*
    • Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra
    en mayúscula; por ejemplo: 00395469-F).     */
    public void mostrar(NIF nif){
        System.out.println(nif.getDNI()+"-"+nif.getLetra());
    }
    //FIN METODO MOSTRAR
}
