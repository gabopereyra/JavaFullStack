package utilidades;

import persistencia.*;
import java.util.regex.*;

public class Validaciones {

    public static boolean validarISBN(String ISBN) {
        Pattern patron = Pattern.compile("\\d{13}");
        Matcher match = patron.matcher(ISBN);
        boolean resultado = match.find() && ISBN.length() == 13;
        if (!resultado) {
            System.out.println("El dato es incorrecto, intente nuevamente.");
            return resultado;
        }
        
        if(validarRepeticionISBN(ISBN)){
            System.out.println("El ISBN indicado ya existe, por favor indique otro.");
            resultado = false;
        }
        return resultado;
    }
    
    public static boolean validarRepeticionISBN(String ISBN){
        LibroDAO libroDAO = new LibroDAO();
        
        return libroDAO.verificarExistenciaISBN(Long.valueOf(ISBN));
    }

    public static boolean validarAnio(String anio) {
        Pattern patron = Pattern.compile("\\d{4}");
        Matcher match = patron.matcher(anio);
        boolean resultado = match.find() && anio.length() == 4;
        if (!resultado) {
            System.out.println("El dato es incorrecto, intente nuevamente.");
        }
        return resultado;
    }

    public static boolean validarTitulo(String titulo) {
        String aux = titulo.trim();
        boolean resultado = !aux.equals("");
        if (!resultado) {
            System.out.println("No se puede ingresar un nombre vacío, intente nuevamente.");
        }
        return resultado;
    }

    public static boolean validarEjemplares(String ejemplares) {
        try {
            int cantidad = Integer.valueOf(ejemplares);
            if (cantidad < 1) {
                System.out.println("El dato debe ser un numero entero mayor a cero.");
                return false;
            }
            return true;
        } catch (NumberFormatException e) {
            System.out.println("El dato debe ser un numero entero mayor a cero.");
            return false;
        }
    }

    public static boolean validarNumero(String ejemplares, int tamanio) {
        try {
            int cantidad = Integer.valueOf(ejemplares);
            if (cantidad < 0 || cantidad > (tamanio)) {
                System.out.println("Elija una de las opciones indicadas.");
                return false;
            }
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Elija una de las opciones indicadas.");
            return false;
        }
    }

}
