package ejercicio6;

public class Ejercicio6 {

    public static void main(String[] args) {
        Cafetera nuevaCafetera;
        CafeteraService servicio = new CafeteraService();
        
        //Create Cafetera
        nuevaCafetera = servicio.createCafetera();

        // Fill Cafetera
        servicio.llenarCafetera(nuevaCafetera);

        //Get quantity (to check if preview function has worked)
        System.out.println(nuevaCafetera.getCantidadActual());

        //Make a coffee (to check function work)
        servicio.servirTaza(nuevaCafetera);

        //Get quantity (to check if preview function has worked)
        System.out.println(nuevaCafetera.getCantidadActual());

    }

}
