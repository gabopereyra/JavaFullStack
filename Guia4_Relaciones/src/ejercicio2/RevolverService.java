package ejercicio2;

import java.util.concurrent.ThreadLocalRandom;

public class RevolverService {
    /*LlenarRevolver(): le pone los valores de posición actual y de posición del agua. Los
valores deben ser aleatorios.*/
    public static void llenarRevolver(Revolver revolver){
        revolver.setPosicionActual(ThreadLocalRandom.current().nextInt(1, 6 + 1));
        revolver.setPosicionAgua(ThreadLocalRandom.current().nextInt(1, 6 + 1));
    }
    /*• mojar(): devuelve true si la posición del agua coincide con la posición actual*/
    public static boolean mojar(Revolver revolver){
        return revolver.getPosicionActual() == revolver.getPosicionAgua();
    }
    
    /*• siguienteChorro(): cambia a la siguiente posición del tambor*/
    public static void siguienteChorro(Revolver revolver){
        if(revolver.getPosicionActual() == 6){
            revolver.setPosicionActual(1);
        } else{
            revolver.setPosicionActual(revolver.getPosicionActual()+1);
        }
    }
            
}
