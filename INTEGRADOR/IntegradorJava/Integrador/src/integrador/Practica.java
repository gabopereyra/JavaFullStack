package integrador;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Practica {

    /**
     * El programa debera tomar un numero x y determinar si es capicua o no
     * **Contemplar que el num que llega puede ser null,en caso de que sea null,
     * retornar false, en caso que sea capicua retornar true.
     *
     * @param num
     * @return esPalindromo
     */
    public Boolean numeroCapicua(Integer num) {
        if (num == null) {
            return false;
        }

        if (num < 0) {
            num *= -1;
        }

        String auxiliar = String.valueOf(num);
        String auxDos = "";

        for (int i = auxiliar.length() - 1; i >= 0; i--) {
            auxDos = auxDos + auxiliar.charAt(i);
        }
        return auxiliar.equals(auxDos);
    }

    /**
     * Estamos en caramelolandia, donde estan los peores ladrones de dulces. Una
     * vez al mes, se sienta una n cantidad de ladrones en ronda, contemplando
     * al primer ladron que se sienta, como el ladron 0. A los ladrones se le
     * repartira una m cantidad de caramelos contemplando que se comenzaran a
     * repartir los caramelos desde el primer ladron (inicio). El ultimo
     * caramelo en repartirse estara podrido, determinar a que ladron, segun su
     * posicion en la ronda le tocara.
     *
     * @param inicio
     * @param cantidadCaramelos
     * @param cantidadLadrones
     * @return ladronQueLeTocoElCarameloPodrido
     */
    public int prisioneroDulce(int inicio, int cantidadCaramelos, int cantidadLadrones) {
        if (cantidadLadrones < 2) {
            return 0;
        }
        if (cantidadCaramelos < 2) {
            return inicio;
        }

        for (int i = 0; i < cantidadCaramelos; i++) {
            if (inicio == cantidadLadrones) {
                inicio = 0;
            }
            inicio++;
        }

        return (inicio - 1);
    }

    /**
     * En un universo paralelo, donde los habitantes son medias, existe un
     * crucero de medias donde se sube una lista de medias. Esta lista de
     * tripulantes del crucero es una Collection de letras, lo que se debera
     * hacer, es filtrar la lista de medias que se suben al crucero y retornar
     * una lista que contenga los grupos de medias que si tenian amigas. Esta
     * lista final de medias amigas se mostraran ordenadas de menor a mayor. A
     * continuacion un ejemplo:
     *
     * List de medias que llegan : A,B,A,B,C,A,F,Z,C,H **F,Z,H no tienen amigas
     * :(. List que se deberia retornar : A,B,C
     *
     *
     * @param pasajeros
     * @return mediasAmigas
     */
    public List<String> mediasAmigas(List<String> pasajeros) {
        HashSet<String> auxiliar = new HashSet();
        for (String pasajero : pasajeros) {
            if (Collections.frequency(pasajeros, pasajero) >= 2) {
                auxiliar.add(pasajero);
            }
        }
        List<String> resultado = new ArrayList(auxiliar);
        Collections.sort(resultado);
        return resultado;
    }
}
