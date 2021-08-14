/*
Por ultimo, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe
contener dos polideportivos y dos edificios de oficinas. Luego, recorrer este array
y ejecutar los métodos calcularSuperficie y calcularVolumen en cada Edificio. Se
deberá mostrar la superficie y el volumen de cada edificio
 */
package extra1;

import java.util.List;
import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        List<Edificio> listado = new ArrayList<Edificio>();

        listado.add(new Polideportivo("Uno", true, 10d, 5d, 10d));
        listado.add(new Polideportivo("Dos", false, 10d, 5d, 10d));
        listado.add(new EdificioDeOficinas(10, 10, 10d, 100d, 10d));
        listado.add(new EdificioDeOficinas(5, 5, 10d, 100d, 10d));

//        for (Edificio edificio : listado) {
//            System.out.println(edificio.calcularSuperficie());
//            System.out.println(edificio.calcularVolumen());
//            System.out.println("");
//        }
        int esTechado = 0;
        for (Edificio edificio : listado) {
            if (edificio instanceof Polideportivo) {
                Polideportivo aux = (Polideportivo) edificio;
                if (aux.isEsTechado()) {
                    esTechado++;
                }
            }
        }//fin for each
        System.out.println("La cantidad de polideportivos techados son: " + esTechado+"\n");

        for (Edificio edificio : listado) {
            if (edificio instanceof EdificioDeOficinas) {
                EdificioDeOficinas aux = (EdificioDeOficinas) edificio;
                aux.cantPersonas();
            }
        }//fin for each

    } //Fin main

}
