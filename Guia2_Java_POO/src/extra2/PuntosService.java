package extra2;

import java.util.Scanner;

public class PuntosService {

    Scanner read = new Scanner(System.in);

    /*Generar un objeto puntos usando un método crearPuntos() que le pide al usuario los dos números y los ingresa
en los atributos del objeto. */
    public Puntos crearPuntos() {
        Puntos coordenadas = new Puntos();
        System.out.println("Ingrese el valor de la coordenada X1");
        coordenadas.setX1(read.nextDouble());
        System.out.println("Ingrese el valor de la coordenada Y1");
        coordenadas.setY1(read.nextDouble());
        System.out.println("Ingrese el valor de la coordenada X2");
        coordenadas.setX2(read.nextDouble());
        System.out.println("Ingrese el valor de la coordenada Y2");
        coordenadas.setY2(read.nextDouble());

        return coordenadas;
    }
    //FIN metodo crear puntos

    /*
    Después, a través de otro método calcular y devolver la distancia que existe entre 
    los dos puntos que existen en la clase Puntos. Para conocer como calcular la 
    distancia entre dos puntos consulte el siguiente link: http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html.
     */
    public double calcularDistancia(Puntos coordenadas){
        double distancia;
        distancia = Math.sqrt(Math.pow(coordenadas.getX2()-coordenadas.getX1(),2)+Math.pow(coordenadas.getY2()-coordenadas.getY1(),2));
        return distancia;
    }
    
    //FIN metodo calcular distancia
}
