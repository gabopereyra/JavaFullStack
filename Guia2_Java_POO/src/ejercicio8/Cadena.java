package ejercicio8;

public class Cadena {

    private String frase;
    private int longitud;
    
    //Constructores

    public Cadena(String frase, int longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }

    public Cadena() {
    }

    //Fin constructores

    //GET && SET
    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    //END GET && SET
    
}
