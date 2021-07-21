package ejercicio1;

import java.util.Scanner;

public class PerroService {

    Scanner read = new Scanner(System.in);

    public Perro crearPerro() {
        System.out.println("Indique el nombre del perro:");
        String name = read.nextLine();
        System.out.println("Indique la edad del perro:");
        Integer age = read.nextInt();
        read.nextLine(); //Para limpiar buffer
        System.out.println("Indique la raza del perro:");
        String race = read.nextLine();
        System.out.println("Indique el tamaño del perro:");
        String size = read.nextLine();
        
        Perro dog = new Perro(name, age, race, size);
        
        return dog;
    }
}
