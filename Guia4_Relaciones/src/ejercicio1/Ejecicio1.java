/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
Persona con atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
mostrar desde la clase Persona, la información del Perro y de la Persona
 */
package ejercicio1;

public class Ejecicio1 {

    public static void main(String[] args) {
        PersonaService serv = new PersonaService();
        PerroService servPerro = new PerroService();

        Persona personOne = serv.crearPersona(servPerro.crearPerro());
        Persona personTwo = serv.crearPersona(servPerro.crearPerro());

        System.out.println(personOne);
        System.out.println(personTwo);

    }
}
