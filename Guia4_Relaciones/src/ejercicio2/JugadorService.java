/*
disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a true y el método
devuelve true, sino false
 */
package ejercicio2;

public class JugadorService {
    
    public static boolean disparo(Revolver r, Jugador j){
        if(RevolverService.mojar(r)){
            j.setMojado(true);
            return true;
        } else{
            RevolverService.siguienteChorro(r);
            return false;
        }
    }//End disparo
    
    
    
}
