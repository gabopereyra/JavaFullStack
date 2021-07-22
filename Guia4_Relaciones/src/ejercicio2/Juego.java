package ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Juego {
    Scanner read = new Scanner(System.in);
    
    private List<Jugador> jugadores;
    private Revolver r;

    public Juego(List<Jugador> jugadores, Revolver r) {
        this.jugadores = jugadores;
        this.r = r;
    }

    public Juego() {
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Revolver getR() {
        return r;
    }

    public void setR(Revolver r) {
        this.r = r;
    }
    
    /*• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los
jugadores y el revolver para guardarlos en los atributos del juego.*/
    public void llenarJuego(List<Jugador>jugadores, Revolver r){
        System.out.println("Indique la cantidad de jugadores: (ingrese entre 1 y 6)");
        Integer num = read.nextInt();
        if(num <1 || num >6){
            num = 6;
        }
        
        for (int i = 0; i < num; i++) {
            Jugador j = new Jugador(i+1);
            jugadores.add(j);
        }
        this.jugadores = jugadores;
        
        RevolverService.llenarRevolver(r);
        this.r = r;
        
    } //Fin llenar juego
    
    /*
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego,
sino se moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se
tiene que mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
 */
    public void ronda(Integer i){
        
        if(RevolverService.mojar(r)){
            System.out.println("El jugador mojado es: "+jugadores.get(i));
            return;
        } else{
            RevolverService.siguienteChorro(r);
            System.out.println("El "+jugadores.get(i)+" se ha salvado!");
           
            if(jugadores.get(i).getId() == jugadores.size()){
                ronda(0);
            } else{
                ronda(i+1);
            }
        }
    }//Fin ronda
    
    public static void jugar(){
        Juego game = new Juego();
        Revolver r = new Revolver();
        List<Jugador> jugadores = new ArrayList();
        game.llenarJuego(jugadores, r);
        System.out.println("-----ESTA LINEA ES SOLO PARA CONTROL: datos de arma: "+r+"-----");
        game.ronda(0);
    }
            
}
