package tienda.servicios;

import java.util.List;
import java.util.Scanner;
import tienda.entidades.Producto;
import tienda.persistencia.ProductoDAO;
import tienda.excepcion.MiExcepcion;

public class ProductoServicio {

    Scanner read = new Scanner(System.in).useDelimiter("\n");
    private ProductoDAO productoDAO;

    public ProductoServicio() {
        productoDAO = new ProductoDAO();
    }

    public void imprimirNombres() throws MiExcepcion {

        try {
            // Se obtiene la información de los usuarios registrados
            List<String> listado = productoDAO.obtenerProductos();

            if (listado.isEmpty()) {
                throw new MiExcepcion("No existen productos");
            } else {
                // En caso de que tenga información, se procede a imprimir en consola la información
                System.out.println("LISTADO DE PRODUCTOS:");
                for (String producto : listado) {
                    System.out.println(producto);
                }
            }
        } catch (MiExcepcion e) {
            throw e; // Se lanza la excepción al método main
        }
    } //Fin imprimir nombres

    public void imprimirNombresYPrecios() throws MiExcepcion {

        try {
            // Se obtiene la información de los usuarios registrados
            List<String> listado = productoDAO.obtenerNombresYPrecios();

            if (listado.isEmpty()) {
                throw new MiExcepcion("No existen productos");
            } else {
                // En caso de que tenga información, se procede a imprimir en consola la información
                System.out.println("LISTADO DE PRODUCTOS:");
                for (String producto : listado) {
                    System.out.println(producto);
                }
            }
        } catch (MiExcepcion e) {
            throw e; // Se lanza la excepción al método main
        }
    } //Fin imprimir nombres y precios

    public void rangoPrecios() throws MiExcepcion {

        try {
            // Se obtiene la información de los usuarios registrados
            List<String> listado = productoDAO.productosRangoPrecio();

            if (listado.isEmpty()) {
                throw new MiExcepcion("No existen productos en el rango de precios");
            } else {
                // En caso de que tenga información, se procede a imprimir en consola la información
                System.out.println("LISTADO DE PRODUCTOS:");
                for (String producto : listado) {
                    System.out.println(producto);
                }
            }
        } catch (MiExcepcion e) {
            throw e; // Se lanza la excepción al método main
        }
    } //Fin imprimir nombres

    public void imprimirPortatiles() throws MiExcepcion {

        try {
            // Se obtiene la información de los usuarios registrados
            List<String> listado = productoDAO.obtenerPortatiles();

            if (listado.isEmpty()) {
                throw new MiExcepcion("No existen productos");
            } else {
                // En caso de que tenga información, se procede a imprimir en consola la información
                System.out.println("LISTADO DE PRODUCTOS:");
                for (String producto : listado) {
                    System.out.println(producto);
                }
            }
        } catch (MiExcepcion e) {
            throw e; // Se lanza la excepción al método main
        }
    } //Fin imprimir Portatiles

    public void productoMasBarato() throws MiExcepcion {
        try {
            String producto = productoDAO.productoMasBarato();

            if (producto == null || producto.equals("")) {
                System.out.println("No existe ningun producto.");
            } else {
                System.out.println("El producto mas barato es: " + producto);
            }

        } catch (MiExcepcion e) {
            throw e;// Se lanza la excepción al método main
        }
    }

    public void ingresarProducto() throws MiExcepcion {

        System.out.println("Ingrese el nombre del producto:");
        String nombre = read.nextLine();
        System.out.println("Ingrese el precio del producto:");
        double precio = read.nextDouble();
        System.out.println("Ingrese el codigo del fabricante:");
        int codigoFabricante = read.nextInt();

        try {
            productoDAO.insertarProducto(nombre, precio, codigoFabricante);
        } catch (MiExcepcion e) {
            e.printStackTrace();
            throw e;
        }
    }

    public void mostrarListado() throws MiExcepcion {
        List<Producto> listado = productoDAO.mostrarProductos();

        for (Producto producto : listado) {
            System.out.println(producto);
        }
    }

    public void editarProducto() throws MiExcepcion {
        try {
            System.out.println("Ingrese el ID del producto a modificar:");
            int codigo = read.nextInt();
            read.nextLine();

            if (!productoDAO.existeProducto(codigo)) {
                System.out.println("El producto no existe.");
            } else {
                System.out.println("Ingrese el nombre del producto:");
                String nombre = read.nextLine();
                System.out.println("Ingrese el precio del producto:");
                double precio = read.nextDouble();
                System.out.println("Ingrese el codigo del fabricante:");
                int codigoFabricante = read.nextInt();

                try {
                    productoDAO.editarProducto(nombre, precio, codigoFabricante, codigo);
                } catch (MiExcepcion e) {
                    e.printStackTrace();
                    throw e;
                }

            }

        } catch (MiExcepcion e) {
            throw e;
        }
    }

}
