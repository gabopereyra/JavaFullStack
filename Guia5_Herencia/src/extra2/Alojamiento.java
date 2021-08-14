/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra2;

/**
nombre, una dirección, una localidad y un gerente encargado
del lugar
 */
public abstract class Alojamiento {
    private String nombre;
    private String direccion;
    private String localidad;
    private String gerente;

    public Alojamiento(String nombre, String direccion, String localidad, String gerente) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.gerente = gerente;
    }
    public Alojamiento(){
        
    }
    
}
