package ejercicio3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class CineService {

    private final Scanner read = new Scanner(System.in).useDelimiter("\n");

    public void iniciarSesion() {
        Cine nuevaSesion = new Cine();
        int maxEspectadores = 48;
        String sala[][] = new String[8][6];

        nuevaSesion.setPelicula(ingresarPelicula());

        System.out.println("Indique el valor de la entrada:");
        nuevaSesion.setPrecio(read.nextDouble());
        System.out.println("---------------------------------");

        nuevaSesion.setEspectadores(ingresarEspectadores(maxEspectadores, nuevaSesion.getPelicula(), nuevaSesion));

        sala = asignarEspectadores(nuevaSesion.getEspectadores());

        show(sala);

    } //Fin iniciar sesion

    private Pelicula ingresarPelicula() {
        Pelicula pelicula = new Pelicula();
        System.out.println("---------------------------------");
        System.out.println("Ingrese el titulo de la pelicula:");
        pelicula.setTitulo(read.nextLine());
        System.out.println("Ingrese el nombre del director:");
        pelicula.setDirector(read.nextLine());
        System.out.println("Ingrese la duracion (en minutos):");
        pelicula.setDuracion(read.nextInt());
        System.out.println("Ingrese la edad minina para asistir:");
        pelicula.setEdadMin(read.nextInt());

        return pelicula;
    } //Fin ingresar pelicula

    private List ingresarEspectadores(int i, Pelicula pelicula, Cine nuevaSesion) {
        List<Espectador> listado = new ArrayList();
        System.out.println("Indique la cantidad de espectadores: (max sala: " + i + ")");
        int espectadores = read.nextInt();
        while (espectadores > i || espectadores < 1) {
            System.out.println("El valon indicado es invalido, por favor intente nuevamente:");
            espectadores = read.nextInt();
        }
        for (int j = 0; j < espectadores; j++) {
            System.out.println("---------------------------------");
            Espectador nuevo = new Espectador();
            System.out.println("Ingrese el nombre de la persona: ");
            nuevo.setNombre(read.next());
            System.out.println("Ingrese la edad de la persona:");
            nuevo.setEdad(read.nextInt());
            System.out.println("Ingrese el monto de dinero que posee la persona:");
            nuevo.setDinero(read.nextDouble());

            if (nuevo.getEdad() >= pelicula.getEdadMin() && nuevo.getDinero() >= nuevaSesion.getPrecio()) {
                listado.add(nuevo);
                System.out.println("Que disfrutes la pelicula "+ nuevo.getNombre()+"!!");
            } else {
                System.out.println("El espectador no puede asistir (no posee dinero o edad suficiente).");
            }
            System.out.println("---------------------------------");
        }
        return listado;
    } //Fin crear espectadores

    private String[][] asignarEspectadores(List<Espectador> espectadores) {
        String sala[][] = new String[8][6];
        for (int i = 0; i < espectadores.size(); i++) {
            boolean isFree = false;
            do {
                int fila = ThreadLocalRandom.current().nextInt(0, 7 + 1);
                int columna = ThreadLocalRandom.current().nextInt(0, 5 + 1);
                if (sala[fila][columna] == null) {
                    sala[fila][columna] = "X";
                    isFree = true;
                }
            } while (!isFree);
        }
        return sala;
    } //FIN Asignar espectadores

    private void show(String[][] sala) {
        System.out.println("---------------------------------");
        System.out.println("La distribución de la sala es la siguiente:");
        for (int i = 0; i < sala.length; i++) {
            for (int j = 0; j < sala[i].length; j++) {
                if (sala[i][j] == null) {
                    System.out.print("[ ] ");
                } else {
                    System.out.print("[" + sala[i][j] + "] ");
                }
            }
            System.out.println("");
        }
        System.out.println("---------------------------------");
    } //Fin mostrar

}
