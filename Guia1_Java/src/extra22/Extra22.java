/*
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida que el usuario 
las va ingresando, construya una “sopa de letras para niños” de tamaño de 20 x 20 caracteres. 
Las palabras se ubicarán todas en orden horizontal en una fila que será seleccionada de manera 
aleatoria. Una vez concluida la ubicación de las palabras, rellene los espacios no utilizados con un 
número aleatorio del 0 al 9. Finalmente imprima por pantalla la sopa de letras creada. 

Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes 
funciones de Java substring(), Length() y Math.random().
 */
package extra22;

import java.util.Scanner;

public class Extra22 {

    public static void main(String[] args) {
        doSoup();
    } //End Main

    private static void doSoup() {
        String[][] soup = new String[20][20];
        for (int i = 0; i < 5; i++) {
            putNewWord(soup);
        }
        complete(soup);
        showSoup(soup);
    } //End doSoup

    private static void showSoup(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
    } //end show matriz

    private static String[][] putNewWord(String[][] matriz) {
        Scanner read = new Scanner(System.in);
        String word;
        boolean isFree = true;
        int rowRandom;
        int colRandom;

        System.out.println("Ingrese una palabra cuya longitud sea de 3 a 5 caracteres inclusive.");
        word = read.next();
        while (word.length() < 3 || word.length() > 5) {
            System.out.println("La longitud es incorrecta, intente nuevamente");
            word = read.next();
        }

        do {
            rowRandom = (int) (Math.random() * 20);
            for (int i = 0; i < 20 && isFree; i++) {
                if (matriz[rowRandom][i] != null) {
                    isFree = false;
                }
            }
        } while (!isFree); //Mientras la fila ya tenga una palabra sigue buscando

        colRandom = (int) (Math.random() * (20 - word.length()));

        for (int i = 0; i < word.length(); i++) {
            matriz[rowRandom][colRandom + i] = word.substring(i, i+1);
        }

        return matriz;
    } //End put word

    private static String[][] complete(String[][] matriz) {
        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] == null) {
                    int aux = (int) (Math.random()*10);
                    matriz[i][j] = String.valueOf(aux);
                }
            }
        }
        return matriz;
    } //End Complete matriz

} //End public Class
