/*
 Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y
tendrá como atributos el nombre y discoConMasVentas.
Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5
objetos de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de
cada cantante y su disco con más ventas por pantalla. 
Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el
usuario elija o de salir del programa. Al final se deberá mostrar la lista con todos los
cambios. 
 */
package extra2;

public class Extra2 {

    public static void main(String[] args) {
        CantanteFamosoService nuevo = new CantanteFamosoService();
        for (int i = 0; i < 5; i++) {
            nuevo.crear();
        }
        nuevo.menu();
    }
    
}
