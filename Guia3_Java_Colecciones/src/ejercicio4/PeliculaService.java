package ejercicio4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class PeliculaService {

    Scanner read = new Scanner(System.in).useDelimiter("\n");

    List<Pelicula> listaPeliculas = new ArrayList();

    public boolean crearPeli() {
        System.out.println("----------------------------------------");
        System.out.println("Ingrese el titulo de la pelicula:");
        String titulo = read.next();
        System.out.println("Ingrese el director de la pelicula:");
        String director = read.next();
        System.out.println("Ingrese la duración en minutos:");
        Integer minutos = read.nextInt();

        Pelicula peli = new Pelicula(titulo, director, minutos);

        listaPeliculas.add(peli);
        
        return question();
    }

    //• Mostrar en pantalla todas las películas.
    public void showAll() {
        System.out.println("El listado de todas las peliculas es el siguiente:");
        for (Pelicula listaPelicula : listaPeliculas) {
            System.out.println(listaPelicula);
        }
        System.out.println("");
        System.out.println("----------------------------------------\n");
    }
    //Fin mostrar todo

    //• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
    public void duration() {
        System.out.println("Las peliculas de duracion mayor a una hora son:");

        for (Pelicula listaPelicula : listaPeliculas) {
            if (listaPelicula.getDuracion() > 60) {
                System.out.println(listaPelicula);
            }
        }
        System.out.println("----------------------------------------\n");
    }
    //Fin metodo mayor a una hora

    //• Ordenar las películas de acuerdo a su duración (de mayor a menor)
    public void orderTimeMayor() {
        List<Pelicula> ordenadaPorTiempo = new ArrayList(listaPeliculas);
        ordenadaPorTiempo.sort(ordenarDuracionMayor);

        System.out.println("Las peliculas ordenadas por tiempo (de mayor a menor) son:");
        for (Pelicula listaPelicula : ordenadaPorTiempo) {
            System.out.println(listaPelicula);
        }
        System.out.println("----------------------------------------\n");
    }
    //Fin orden mayor a menor

    //• Ordenar las películas de acuerdo a su duración (de menor a mayor)
    public void orderTimeMenor() {
        List<Pelicula> ordenadaPorTiempo = new ArrayList(listaPeliculas);
        ordenadaPorTiempo.sort(ordenarDuracionMenor);

        System.out.println("Las peliculas ordenadas por tiempo (de mayor a menor) son:");
        for (Pelicula listaPelicula : ordenadaPorTiempo) {
            System.out.println(listaPelicula);
        }
        System.out.println("----------------------------------------\n");
    }
    //Fin orden menor a mayor

    //• Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.
    public void orderTitle() {
        List<Pelicula> ordenadaPorTiempo = new ArrayList(listaPeliculas);
        ordenadaPorTiempo.sort(ordenarTitulo);

        System.out.println("Las peliculas ordenadas alfabéticamente por titulo:");
        for (Pelicula listaPelicula : ordenadaPorTiempo) {
            System.out.println(listaPelicula);
        }
        System.out.println("----------------------------------------\n");
    }
    // FIn orden por titulo

    /* • Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla. */
    public void orderDirector() {
        List<Pelicula> ordenadaPorTiempo = new ArrayList(listaPeliculas);
        ordenadaPorTiempo.sort(ordenarDirector);

        System.out.println("Las peliculas ordenadas alfabéticamente por director:");
        for (Pelicula listaPelicula : ordenadaPorTiempo) {
            System.out.println(listaPelicula);
        }
        System.out.println("");
        System.out.println("----------------------------------------\n");
    }
    //FIn orden por director

    private boolean question() {
        System.out.println("\nDesea agregar una nueva pelicula? (S/N)");
        String ans = read.next().toUpperCase();
        while (!ans.equals("S") && !ans.equals("N")) {
            System.out.println("El valor indicado es incorrecto, intente nuevamente:");
            ans = read.next().toUpperCase();
        }
        System.out.println("----------------------------------------\n");
        return ans.equals("S");
    } //Fin metodo pregunta

    //Comparadores
    private static Comparator<Pelicula> ordenarDuracionMayor = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p2.getDuracion().compareTo(p1.getDuracion());
        }
    }; //Fin ordenar tiempo mayor a menor
    private static Comparator<Pelicula> ordenarDuracionMenor = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p1.getDuracion().compareTo(p2.getDuracion());
        }
    }; //Fin ordenar tiempo menor a mayor
    private static Comparator<Pelicula> ordenarTitulo = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p1.getTitulo().compareTo(p2.getTitulo());
        }
    }; //Fin ordenar titulo

    private static Comparator<Pelicula> ordenarDirector = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p1.getDirector().compareTo(p2.getDirector());
        }
    }; //Fin ordenar titulo

}
