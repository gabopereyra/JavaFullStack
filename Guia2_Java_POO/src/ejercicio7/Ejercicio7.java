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
package ejercicio7;

public class Ejercicio7 {

    public static void main(String[] args) {
        int objetos = 0;
        int mayores = 0;
        int pesoBajo = 0;
        int pesoIdeal = 0;
        int pesoAlto = 0;

        PersonaService person = new PersonaService();

        Persona[] persona = new Persona[4];

        for (int i = 0; i < 4; i++) {
            System.out.println("--OBJETO EN POSICIÓN: "+i+"--");
           
            persona[i] = person.crearPersona();
            
            person.calcularIMC(persona[i]);
            person.esMayorDeEdad(persona[i]);

            if (persona[i].isMayorEdad()) {
                mayores++;
            }

            switch (persona[i].getIMC()) {
                case -1:
                    pesoBajo++;
                    break;
                case 0:
                    pesoIdeal++;
                    break;
                default:
                    pesoAlto++;
                    break;
            }
            objetos++;
        }

        System.out.println("Son mayores de edad el: " + ((double) mayores / objetos) * 100 + "%");
        System.out.println("Son menores de edad el: " + (1 - ((double) mayores / objetos)) * 100 + "%");

        System.out.println("Las personas que se encuentran con peso bajo representan el: " + ((double) pesoBajo / objetos) * 100 + "%");
        System.out.println("Las personas que se encuentran con peso ideal representan el: " + ((double) pesoIdeal / objetos) * 100 + "%");
        System.out.println("Las personas que se encuentran con peso alto representan el: " + ((double) pesoAlto / objetos) * 100 + "%");

    }

}
