package ejercicio4;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Baraja {

    private List<Carta> baraja = new ArrayList();
    private final List<Carta> retiradas = new ArrayList();
    private static final Scanner read = new Scanner(System.in);

    public void crearBajara() {
        /*entre 1 y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas)*/

        for (int i = 1; i < 13; i++) {
            if (i != 8 && i != 9) {
                Carta nueva = new Carta(i, "espada");
                baraja.add(nueva);
            }
        }//Fin crear espadas
        for (int i = 1; i < 13; i++) {
            if (i != 8 || i != 9) {
                Carta nueva = new Carta(i, "basto");
                baraja.add(nueva);
            }
        }//Fin crear basto
        for (int i = 1; i < 13; i++) {
            if (i != 8 || i != 9) {
                Carta nueva = new Carta(i, "oro");
                baraja.add(nueva);
            }
        }//Fin crear oro
        for (int i = 1; i < 13; i++) {
            if (i != 8 || i != 9) {
                Carta nueva = new Carta(i, "copa");
                baraja.add(nueva);
            }
        }//Fin crear copa

    } //Fin crear baraja

    /*• barajar(): cambia de posición todas las cartas aleatoriamente.*/
    public void barajar() {
        List<Carta> listaAux = new ArrayList();
        List<Integer> auxContador = new ArrayList();
        for (int i = 0; i < 40; i++) {
            int aux;
            boolean exist = false;
            do {
                aux = ThreadLocalRandom.current().nextInt(0, 39 + 1);
                if (!auxContador.contains(aux)) {
                    listaAux.add(baraja.get(aux));
                    exist = true;
                }
            } while (!exist);
        }
        baraja = listaAux;
        System.out.println("------------------\nSE HA MEZCLADO LA BARAJA!\n------------------");
    } //Fin barajar

    /*• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no 
    haya más o se haya llegado al final, se indica al usuario que no hay más cartas.  */
    public void siguienteCarta() {
        if (baraja.isEmpty()) {
            System.out.println("No existen más cartas disponibles");
        } else {
            System.out.println("------------------");
            System.out.println("La carta retirada es: " + baraja.get(0));
            retiradas.add(baraja.get(0));
            baraja.remove(0);
            System.out.println("------------------");
        }
    } //Fin siguiente carta

    /*• cartasDisponibles(): indica el número de cartas que aún se puede repartir.*/
    public void cartasDisponibles() {
        System.out.println("La cantidad de cartas disponibles es: " + baraja.size() + '.');
    }

    /*• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese 
    número  de  cartas.  En  caso  de  que  haya  menos  cartas  que  las  pedidas,  no 
    devolveremos nada, pero debemos indicárselo al usuario. 
     */
    public void darCartas() {
        System.out.println("------------------");
        System.out.println("Indique la cantidad de cartas a retirar:");
        int numero = read.nextInt();

        if (numero < 0 || numero > baraja.size()) {
            System.out.println("No es posible dar la cantidad de cartas indicadas");
        } else {
            for (int i = 0; i < numero; i++) {
                siguienteCarta();
            }
        }
        System.out.println("------------------");
    } //Fin dar cartas

    /*• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido 
    ninguna indicárselo al usuario */
    public void cartasMonton() {
        System.out.println("------------------");
        if (retiradas.isEmpty()) {
            System.out.println("Aún no se han retirado cartas.");
        } else {
            System.out.println("La(s) carta(s) retirada(s) es(son):");
            for (int i = 0; i < retiradas.size(); i++) {
                System.out.println(retiradas.get(i));
            }
        }
        System.out.println("------------------");
    } //Fin mostrar cartasMonton

    /*  
    • mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una 
    carta y luego se llama al método, este no mostrara esa primera carta.
     */
    public void mostrarBaraja() {
        System.out.println("------------------");
        if (baraja.isEmpty()) {
            System.out.println("La baraja está vacía");
        } else {
            for (int i = 0; i < baraja.size(); i++) {
                System.out.println(baraja.get(i));
            }
        }
        System.out.println("------------------");
    } //Fin mostrar baraja

}
