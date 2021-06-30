package extra6;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class AhorcadoService {

    Scanner read = new Scanner(System.in);

    /*• Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
    Con la palabra del usuario, pone la longitud de la palabra, como la longitud del 
    vector. Después ingresa la palabra en el vector, letra por letra, quedando cada letra 
    de la palabra en un índice del vector. Y también, guarda en cantidad de jugadas 
    máximas, el valor que ingresó el usuario y encontradas en 0.    */
    public void crearJuego(Ahorcado juego) {
        System.out.println("Ingrese la palabra a adivinar: (tenga en cuenta que deberá ser sin tildes)");
        String palabra = read.nextLine().toLowerCase();
        String palabraGuardar[] = new String[palabra.length()];

        for (int i = 0; i < palabraGuardar.length; i++) {
            palabraGuardar[i] = palabra.substring(i, i + 1);
        }
        juego.setPalabra(palabraGuardar);

        System.out.println("Indique la cantidad de jugadas maximas: ");
        juego.setCantJugadas(read.nextInt());
    }
    //Fin crearJuego

    /*• Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
    buscar como se usa el vector.length.e*/
    public int longitud(Ahorcado juego) {
        return juego.getPalabra().length;
    }
    //FIN Metodo Longitud.

    /*• Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
    letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.*/
    public boolean buscar(String letra, Ahorcado juego) {

        if (Arrays.asList(juego.getPalabra()).contains(letra)) {
            //System.out.println("La letra SE encuentra!");
            return true;
        } else {
            // System.out.println("La letra NO se ha encontrado =(");
            return false;
        }
    }
    //Fin buscar()

    /*• Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
    cuantas letras han sido encontradas y cuantas le faltan. Este método además 
    deberá devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez 
    que se busque una letra que no esté, se le restará uno a sus oportunidades.*/
    public boolean encontradas(String letra, Ahorcado juego) {
        if (buscar(letra, juego)) {
            juego.setCantidadLetras(juego.getCantidadLetras() + (Collections.frequency(Arrays.asList(juego.getPalabra()), letra)));
            return true;
        } else {
            juego.setCantJugadas(juego.getCantJugadas() - 1);
            return false;
        }
    }
    // Fin metodoEncontradas

    /*• Método intentos(): para mostrar cuantas oportunidades le queda al jugador. */
    public int intentos(Ahorcado juego) {
        return juego.getCantJugadas();
    }
    //FIN METODO INTENTOS    

    /*• Método juego(): el método juego se encargará de llamar todos los métodos previamente 
    mencionados e informará cuando el usuario descubra toda la palabra o se quede sin intentos. 
    Este método se llamará en el main. */
    public void juego() {
        Ahorcado nuevoJuego = new Ahorcado();
        crearJuego(nuevoJuego);

        String auxiliar[] = new String[27];
        int contador = 0;

        String auxiliarVisual[] = new String[longitud(nuevoJuego)];
        for (int i = 0; i < auxiliarVisual.length; i++) {
            auxiliarVisual[i] = "_ ";
        }
                 
        mostrarAyuda(auxiliarVisual);
        System.out.println("Recuerda que tienes " + intentos(nuevoJuego) + " intentos.");
        while (nuevoJuego.getCantidadLetras() != longitud(nuevoJuego) && nuevoJuego.getCantJugadas() != 0) {

            System.out.println("Ingrese una letra: ");
            String letra = read.next();

            while (letra.length() != 1) {
                System.out.println("Debe indicar solo una letra, intente nuevamente:");
                letra = read.nextLine();
            }

            if (Arrays.asList(auxiliar).contains(letra)) {
                System.out.println("La letra indicada ya fue utilizada");
                mostrarAyuda(auxiliarVisual);
                continue;
            } else {
                auxiliar[contador] = letra;
                contador++;

                if (encontradas(letra, nuevoJuego)) {
                    if (nuevoJuego.getCantidadLetras() != longitud(nuevoJuego)) {
                        System.out.println("Has encontrado una letra!\nAun te restan: " + (longitud(nuevoJuego) - nuevoJuego.getCantidadLetras()) + " letras.");
                    } else {
                        System.out.println("ENHORABUENA!!! Has acertado la palabra!");
                    }
                    editarParcial(auxiliarVisual, nuevoJuego, letra);
                    mostrarAyuda(auxiliarVisual);
                } else {
                    if (nuevoJuego.getCantJugadas() != 0) {
                        System.out.println("Oh, esa letra no se encuentra, pero sigue intentando, quedan: " + intentos(nuevoJuego) + " intentos.");
                        mostrarAyuda(auxiliarVisual);
                    } else {
                        System.out.print("Que pena, has perdido =(\nLa palabra era: ");
                        mostrar(nuevoJuego);
                    }

                } //Bloque cuando la letra no se utilizo

            }
        } //FIN WHILE
    }
    //FIN metodo juego

    //METODOS AUXILIARES  
    private void mostrar(Ahorcado juego) {
        String palabra[] = juego.getPalabra();
        for (String palabra1 : palabra) {
            System.out.print(palabra1);
        }
        System.out.println("");
    }

    private void editarParcial(String[] auxiliar, Ahorcado juego, String letra) {
        for (int i = 0; i < longitud(juego); i++) {
            if (juego.getPalabra()[i].contains(letra)) {
                auxiliar[i] = letra + " ";
            }
        }
    } //fin mostrarParcial

    private void mostrarAyuda(String[] auxiliarVisual) {
        for (String elemento : auxiliarVisual) {
            System.out.print(elemento);
        }
        System.out.println("");
    }
    //FIN METODOS AUXILIARES 

} //fin clase servicio
