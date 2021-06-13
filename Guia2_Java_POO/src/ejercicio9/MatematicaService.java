
package ejercicio9;

import java.util.Scanner;

public class MatematicaService {
   Scanner read = new Scanner(System.in);
    
    public Matematica crearNumeros() {
        Matematica nuevosNumeros = new Matematica();

        System.out.println("Ingrese el primer numero real:");
        nuevosNumeros.setNumeroUno(read.nextDouble());
        System.out.println("Ingrese el segundo numero real:");
        nuevosNumeros.setNumeroDos(read.nextDouble());

        return nuevosNumeros;
    } //Fin crear nuevos numeros*/
    /*
• Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
valor*/ 
    public Double devolverMayor(Matematica numeros){
        return Math.max(numeros.getNumeroUno(), numeros.getNumeroDos()); 
    }
    //END devolverMayor
    
    /*• Método calcularPotencia() para calcular la potencia del mayor valor de la clase
    elevado al menor número. Previamente se deben redondear ambos valores. */
    public int calcularPotencia(Matematica numeros){
        int max = (int) Math.round(Math.max(numeros.getNumeroUno(), numeros.getNumeroDos()));
        int min = (int) Math.round(Math.min(numeros.getNumeroUno(), numeros.getNumeroDos()));
        
        return (int) Math.pow(max, min);
    } //fin metodo calcular potencia
    
    /*
• Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número
 */
    public double calcularRaiz(Matematica numeros){
        double valor = Math.abs(Math.min(numeros.getNumeroUno(), numeros.getNumeroDos()));
        
        return Math.sqrt(valor);
    }
       //fin calcularRaiz     
}
