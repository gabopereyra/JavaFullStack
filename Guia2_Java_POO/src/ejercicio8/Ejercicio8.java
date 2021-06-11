/*
 Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
• Método invertirFrase(), deberá invertir la frase ingresada y mostrar la frase invertida por pantalla. 
Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
• Método vecesRepetido(String letra), deberá recibir por parámetro un carácter ingresado por el 
usuario y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
• Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone la 
clase con otra nueva frase ingresada por el usuario.
• Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadenacon una nueva 
frase ingresada por el usuario y mostrar la frase resultante.
• Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren 
en la frase, por algún otro carácter seleccionado por el usuario y
mostrar la frase resultante.
• Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no
 */
package ejercicio8;

public class Ejercicio8 {

    public static void main(String[] args) {
        Cadena nuevaCadena;
        CadenaService servicio = new CadenaService();
        
        nuevaCadena = servicio.crearCadena();
        
        System.out.println(nuevaCadena.getFrase());
        System.out.println(nuevaCadena.getLongitud());
        
        servicio.mostrarVocales(nuevaCadena);
        servicio.invertirFrase(nuevaCadena);
        servicio.vecesRepetido("a", nuevaCadena);
 
        servicio.compararLongitud("JUANITO PEREZ", nuevaCadena);
        
        servicio.unirFrases("JUANITO PEREZ", nuevaCadena);
        
        System.out.println(servicio.reemplazar(nuevaCadena, "X"));
        
        System.out.println(servicio.contiene("X", nuevaCadena));
        
    }
    
}
