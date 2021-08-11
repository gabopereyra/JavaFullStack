package ejercicio5;

public class App {

    public static void main(String[] args) {
        Circulo circ = new Circulo(3);
        Rectangulo rec = new Rectangulo(1, 2);

        System.out.println("circulo area: " + circ.obtenerArea());
        System.out.println("circulo peri: " + circ.obtenerPerimetro());
        System.out.println("rectangulo area: " + rec.obtenerArea());
        System.out.println("rectangulo peri: " + rec.obtenerPerimetro());
    }

}
