/*
Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener
como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y
la cantidad jugadas máximas que puede realizar el usuario. Definir los siguientes
métodos con los parámetros que sean necesarios:
• Constructores, tanto el vacío como el parametrizado.
 */
package extra6;

public class Ahorcado {
   private String palabra[];
   private int cantJugadas;
   private int cantidadLetras;

   //CONSTRUCTORES
    public Ahorcado(String[] palabra, int cantJugadas, int cantidadLetras) {
        this.palabra = palabra;
        this.cantJugadas = cantJugadas;
        this.cantidadLetras = cantidadLetras;
    }

    public Ahorcado() {
    }
   //FIN CONSTRUCTORES
   
   //GET && SET
    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getCantJugadas() {
        return cantJugadas;
    }

    public void setCantJugadas(int cantJugadas) {
        this.cantJugadas = cantJugadas;
    }

    public int getCantidadLetras() {
        return cantidadLetras;
    }

    public void setCantidadLetras(int cantidadLetras) {
        this.cantidadLetras = cantidadLetras;
    }
   ////END GET && SET
   
}
