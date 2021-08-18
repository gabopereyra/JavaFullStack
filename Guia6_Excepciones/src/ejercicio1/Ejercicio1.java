/*
A continuación, en la clase main hacer lo siguiente: 
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos 
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, 
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la 
persona es mayor de edad. 

Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad 
en distintas variables, para después en el main, calcular un porcentaje de esas 4 
personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por 
encima, y también calcularemos un porcentaje de cuantos son mayores de edad y 
cuantos menores.
 */
package ejercicio1;

public class Ejercicio1 {

    public static void main(String[] args) {
        try {
            Persona nueva = new Persona();
            nueva = null;

            nueva.isMayorEdad();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
