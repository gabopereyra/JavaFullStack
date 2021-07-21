package ejercicio1;

import java.util.Scanner;

public class PersonaService {

    Scanner read = new Scanner(System.in);

    public Persona crearPersona(Perro dog) {
        System.out.println("Indique el nombre de la persona:");
        String name = read.nextLine();
        System.out.println("Indique el apellido de la persona:");
        String surname = read.nextLine();
        System.out.println("Indique la edad de la persona:");
        Integer age = read.nextInt();
        System.out.println("Indique el documento de la persona:");
        Long document = read.nextLong();

        Persona persona = new Persona(name, surname, age, document, dog);
        
        return persona;
    }
}
