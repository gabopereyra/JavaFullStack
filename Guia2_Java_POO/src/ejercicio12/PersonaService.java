package ejercicio12;

import java.util.Date;
import java.util.Scanner;

public class PersonaService {

    Scanner read = new Scanner(System.in);

    /*• Agregar un método de creación del objeto que respete la siguiente firma:
    crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta
    al usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos
    que la fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.*/
    public Persona crearPersona() {

        Persona nuevaPersona = new Persona();
        int dia;
        int mes;
        int anio;

        System.out.println("Ingrese el nombre de la persona:");
        nuevaPersona.setNombre(read.nextLine());
        System.out.println("-AHORA VAMOS A CARGAR LA FECHA DE NACIMIENTO-");
        System.out.println("Indique el dia (en numeros enteros):");
        dia = read.nextInt();
        System.out.println("Indique el mes (en numeros enteros):");
        mes = read.nextInt();
        System.out.println("Indique el año (en numeros enteros):");
        anio = read.nextInt();

        Date fechaCargada = new Date((anio - 1900), (mes - 1), dia);
        nuevaPersona.setFechaNacimiento(fechaCargada);

        return nuevaPersona;
    }
    //Fin crear persona

    /*• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada.
    Tener en cuenta que para conocer la edad de la persona también se debe
    conocer la fecha actual.*/
    public int calcularEdad(Persona persona) {
        int edad;
        Date fecha = persona.getFechaNacimiento();
        Date fechaActual = new Date();
        if (fecha.getMonth() <= fechaActual.getMonth()) {
            if (fecha.getDate() <= fechaActual.getDate()) {
                edad = fechaActual.getYear() - fecha.getYear();
            } else {
                edad = (fechaActual.getYear() - fecha.getYear())-1;
            }
        } else {
            edad = (fechaActual.getYear() - fecha.getYear())-1;
        }
        return edad;
    }
    //fin metodo calcularEdad()

    /*
• Agregar a la clase el método menorQue(int edad) que recibe como parámetro
otra edad y retorna true en caso de que el receptor tenga menor edad que la
persona que se recibe como parámetro, o false en caso contrario.
     */
    public boolean menorQue(int edad, Persona persona) {
        boolean esMenor = true;
        if(edad > calcularEdad(persona)){
            esMenor = false;
        }
        return esMenor;
    }

    /*
• Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior
     */
} //fin clase publica

