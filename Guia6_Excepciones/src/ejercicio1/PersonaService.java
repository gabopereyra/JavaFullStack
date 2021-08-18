package ejercicio1;

import java.util.Scanner;

public class PersonaService {
    
    Scanner read = new Scanner(System.in).useDelimiter("\n");

    /* Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
    al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
    Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
    O. Si no es correcto se deberá mostrar un mensaje*/
    
    public Persona crearPersona() {
        Persona nuevaPersona = new Persona();

        System.out.println("Ingrese el nombre:");
        nuevaPersona.setNombre(read.next());

        System.out.println("Ingrese la edad:");
        nuevaPersona.setEdad(read.nextInt());

        System.out.println("Ingrese el sexo, H (hombre), M (mujer), O (otro):");
        String sexo = read.next().toUpperCase();

        while (!sexo.equals("H") && !sexo.equals("M") && !sexo.equals("O")) {
            System.out.println("La opción ingresada es inválida, intente nuevamtente");
            System.out.println("");
            sexo = read.next().toUpperCase();
        }

        nuevaPersona.setSexo(sexo);

        return nuevaPersona;
    } //Fin crear persona

    /*• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/
    (altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, la función 
    devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25 (incluidos), 
    significa que el peso está por debajo de su peso ideal y la función devuelve un 0. 
    Finalmente, si el resultado de la fórmula es un valor mayor que 25 significa que la 
    persona tiene sobrepeso, y la función devuelve un 1. Se recomienda hacer uso de 
    constantes para devolver estos valores.*/
    public void calcularIMC(Persona personaIMC) {
        
        System.out.println("Ingrese la altura de la persona");
        double altura = read.nextDouble();

        System.out.println("Ingrese el peso de la persona");
        double peso = read.nextDouble();

        double auxIMC = peso / Math.pow(altura, 2);

        if (auxIMC < 20) {
            personaIMC.setIMC(-1);
            System.out.println("La persona está DEBAJO del peso ideal");
        } else if (auxIMC <= 25) {
            personaIMC.setIMC(0);
            System.out.println("La persona está dentro del peso ideal");
        } else {
            personaIMC.setIMC(1);
            System.out.println("La persona está POR ENCIMA del peso ideal");
        } 
    } //End CalcularIMC
    
    /* Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
    devuelve un booleano*/
    public void esMayorDeEdad(Persona persona){
        if (persona.getEdad()<18){
            persona.setMayorEdad(false);
            System.out.println("La persona es menor de edad");
        }else{
            persona.setMayorEdad(true);
            System.out.println("La persona es mayor de edad");
        }
    } //End esMayorDeEdad();
    
}
