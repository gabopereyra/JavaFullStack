package ejercicio2;

public class App {

    public static void main(String[] args) {
        Lavadora nueva = new Lavadora();

        nueva.crearLavadora();

        System.out.println("El valor de la lavadora es: $"+nueva.getPrecio());

        Televisor tele = new Televisor();
        tele.crearTelevisor();

        System.out.println("El valor del televisor es: $"+tele.getPrecio());

    }

}
