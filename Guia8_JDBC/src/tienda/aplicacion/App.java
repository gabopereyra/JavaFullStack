package tienda.aplicacion;

import java.util.InputMismatchException;
import tienda.excepcion.MiExcepcion;
import tienda.servicios.ProductoServicio;
import tienda.servicios.FabricanteServicio;
import java.util.Scanner;
import tienda.persistencia.ProductoDAO;

public class App {

    public static void main(String[] args) throws MiExcepcion {
        System.out.println("---BIENVENIDO---");
        int ans;
        do {
            ans = menu();
        } while (ans != 9);
        
    }

    public static int menu() throws MiExcepcion {
        FabricanteServicio fabricanteServicio = new FabricanteServicio();
        ProductoServicio productoServicio = new ProductoServicio();
        int ans = 0;
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        
        try {
            System.out.println("-----------------------\nIngrese la opción deseada:");
            System.out.println("1) Lista el nombre de todos los productos que hay en la tabla producto. \n"
                    + "2) Lista los nombres y los precios de todos los productos de la tabla producto. \n"
                    + "3) Listar aquellos productos que su precio esté entre 120 y 202. \n"
                    + "4) Buscar y listar todos los Portátiles de la tabla producto. \n"
                    + "5) Listar el nombre y el precio del producto más barato. \n"
                    + "6) Ingresar un producto a la base de datos.\n"
                    + "7) Ingresar un fabricante a la base de datos\n"
                    + "8) Editar un producto con datos a elección\n"
                    + "9) PARA SALIR\n-----------------------");

            ans = read.nextInt();

            switch (ans) {
                case 1:
                    productoServicio.imprimirNombres();
                    break;
                case 2:
                    productoServicio.imprimirNombresYPrecios();
                    break;
                case 3:
                    productoServicio.rangoPrecios();
                    break;
                case 4:
                    productoServicio.imprimirPortatiles();
                    break;
                case 5:
                    productoServicio.productoMasBarato();
                    break;
                case 6:
                    productoServicio.ingresarProducto();
                    productoServicio.mostrarListado();
                    break;
                case 7:
                    fabricanteServicio.crearFabricante();
                    fabricanteServicio.mostrarListado();
                    break;
                case 8:
                    productoServicio.editarProducto();
                    productoServicio.mostrarListado();
                    break;
                case 9:
                    System.out.println("---FIN DE SESION---");
                    break;
                default:
                    System.out.println("La opción elegida es inválida");
            }
        } catch (InputMismatchException e) {
            System.out.println("No se admiten caracteres");
            read.next();
        } catch (MiExcepcion e) {
            System.out.println(e.getMessage());
        }

        return ans;
    }
}
