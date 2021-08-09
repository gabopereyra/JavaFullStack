package ejercicio4;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {
        Barco velero = new Velero("velero", 1.78, 2021, 2);
        Barco motor = new BarcoMotor("motor", 1, 2021, 10);
        Barco yate = new Yate("yate", 1, 2021, 10, 2);
        
        Alquiler vel = new Alquiler("Gabo", 344522252, LocalDate.of(2021, 8, 1), LocalDate.of(2021, 8, 4), 1, velero);
        Alquiler mot = new Alquiler("Gabo", 344522252, LocalDate.of(2021, 8, 1), LocalDate.of(2021, 8, 11), 1, motor);
        Alquiler yat = new Alquiler("Gabo", 344522252, LocalDate.of(2021, 8, 1), LocalDate.of(2021, 8, 11), 1, yate);
        
        System.out.println("Alquiler del velero: $"+vel.calcularAlquiler()+"\n");
        
        System.out.println("Alquiler del barco a motor: $"+mot.calcularAlquiler()+"\n");
                
        System.out.println("Alquiler del yate: $"+ yat.calcularAlquiler()+"\n");
    }

}
