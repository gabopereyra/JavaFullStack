package ejercicio6;

import java.util.Scanner;

public class CafeteraService {

    Scanner read = new Scanner(System.in);

    // Metodo
    public Cafetera createCafetera() {
        Cafetera nuevaCafetera = new Cafetera();

        System.out.println("Ingrese la capacidad máxima:");
        nuevaCafetera.setCapacidadMaxima(read.nextDouble());

        System.out.println("Ingrese la capacidad actual:");
        nuevaCafetera.setCantidadActual(read.nextDouble());

        return nuevaCafetera;
    } //Fin

    /*• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
    máxima.*/
    public void llenarCafetera(Cafetera cafeteraModificar) {
        cafeteraModificar.setCantidadActual(cafeteraModificar.getCapacidadMaxima());
    }
    //Fin llenar cafetera();

    /*• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
    tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
    cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
    método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
    cuanto quedó la taza.*/
    public Cafetera servirTaza(Cafetera cafeteraModificar) {
        System.out.println("Ingrese volumen de la taza:");
        double tazaVol = read.nextDouble();

        if (tazaVol > cafeteraModificar.getCantidadActual()) {
            System.out.println("La cantidad actual no es suficiente");
            System.out.println("El volumen de la taza quedó en: " + cafeteraModificar.getCantidadActual());
            System.out.println("Lo que representa el " + cafeteraModificar.getCantidadActual() / tazaVol + "%");
            cafeteraModificar.setCantidadActual(0);
        } else{
            cafeteraModificar.setCantidadActual(cafeteraModificar.getCantidadActual()-tazaVol);
        }
        return cafeteraModificar;
    }
    //Fin servirTaza();
    
    /*Método vaciarCafetera(): pone la cantidad de café actual en cero.*/
    public Cafetera vaciarCafetera(Cafetera cafeteraModificar){
        cafeteraModificar.setCantidadActual(0);
        return cafeteraModificar;
    }
    //Fin metodo VaciarCafetera
    
    /* Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
    recibe y se añade a la cafetera la cantidad de café indicada.  */
        public Cafetera agregarCafe(Cafetera cafeteraModificar){
            
            System.out.println("Indique la cantidad de cafe a agregar: ");
            double volumenCafe= read.nextDouble();
            
            while(volumenCafe+cafeteraModificar.getCantidadActual() > cafeteraModificar.getCapacidadMaxima()){
                System.out.println("Con la cantidad indicada supera el maximo de la cafetera, indique un nuevo volumen");
                volumenCafe= read.nextDouble();
            }
            cafeteraModificar.setCantidadActual(cafeteraModificar.getCantidadActual()+volumenCafe);
            
        return cafeteraModificar;
    }
    
    
} //Fin clase publica
