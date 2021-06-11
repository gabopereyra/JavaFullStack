package ejercicio8;

import java.util.Scanner;

public class CadenaService {

    Scanner read = new Scanner(System.in);

    public Cadena crearCadena() {
        Cadena nuevaCadena = new Cadena();

        System.out.println("Ingrese la frase:");

        String aux = read.nextLine();
        nuevaCadena.setFrase(aux);

        nuevaCadena.setLongitud(aux.length());

        return nuevaCadena;
    } //Fin crear cadena
    

    /*Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
    frase ingresada.*/
    public void mostrarVocales(Cadena cadena) {
        int contador = 0;
        String aux = cadena.getFrase();
        for (int i = 0; i < cadena.getLongitud(); i++) {
            switch (aux.substring(i, i + 1).toUpperCase()) {
                case "A":
                case "E":
                case "I":
                case "O":
                case "U":
                    contador++;
                    break;
            }
        }
        System.out.println("La frase ingresada contiene "+contador+" vocales.");
    } //Fin metodo mostrarVocales

    /*• Método invertirFrase(), deberá invertir la frase ingresada y mostrar la frase invertida
por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".*/
    public void invertirFrase(Cadena cadena) {
        String fraseInvertida = "";
        String aux = cadena.getFrase();
        for (int i = cadena.getLongitud() - 1; i >= 0; i--) {
            fraseInvertida += aux.substring(i, i + 1);
        }
        System.out.println(fraseInvertida);
    }
    //Fin invertir frase

    /*• Método vecesRepetido(String letra), deberá recibir por parámetro un carácter
    ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la
    frase, por ejemplo:*/
    public void vecesRepetido(String letra, Cadena frase) {
        int contador = 0;
        for (int i = 0; i < frase.getLongitud(); i++) {
            if (frase.getFrase().charAt(i) == letra.charAt(0)) {
                contador++;
            }
        }
        System.out.println("El elemento a buscar (" + letra + ") se ha encontrado: " + contador + " veces.");
    }
    //Fin vecesRepetido

    /*
    • Método compararLongitud(String frase), deberá comparar la longitud de la frase
    que compone la clase con otra nueva frase ingresada por el usuario.*/
    public void compararLongitud(String frase, Cadena cadena) {
        if (frase.length() == cadena.getLongitud()) {
            System.out.println("Las longitudes son las mismas");
        } else {
            System.out.println("Las longitudes son diferentes");
        }
    }
    //Fin compararLongitud

    /*• Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.*/
    public void unirFrases(String frase, Cadena cadena) {
        String fraseFinal;
        fraseFinal = cadena.getFrase().concat(frase);
        System.out.println(fraseFinal);
    }
    //fin unirFrases

    /*
• Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y
mostrar la frase resultante.
     */
    public String reemplazar(Cadena cadena, String letra) {
        String reemplazo = cadena.getFrase();

        reemplazo = reemplazo.replace('a', letra.charAt(0));

        return reemplazo;
    }
    //Fin metodo reemplazar
    
    /*
    • Método contiene(String letra), deberá comprobar si la frase contiene una letra que
    ingresa el usuario y devuelve verdadero si la contiene y falso si no  
     */
    public boolean contiene (String letra, Cadena cadena){            
        return cadena.getFrase().contains(letra);
    }
    //Fin metodo contiene
}
