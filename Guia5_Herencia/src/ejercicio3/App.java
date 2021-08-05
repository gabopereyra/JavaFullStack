package ejercicio3;

import ejercicio2.*;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<Electrodomestico> listado = new ArrayList();
        for (int i = 0; i < 4; i++) {
            System.out.println("-A CONTINUACION INGRESE DATOS DEL ELECTRODOMESTICO ("+ (1+i) +")-");
            Lavadora nueva = new Lavadora();
            nueva.crearLavadora();
            listado.add(nueva);
            System.out.println("----------------------------------\n");
        }
        
        double precio = 0.0;
        for (Electrodomestico equipo : listado) {
            precio += equipo.getPrecio();
        }
        System.out.println("La suma del valor de los electrodomesticos es: $"+precio);
    }
    
}
