package ejercicio5;

import java.util.Scanner;

public class CuentaServicio {

    Scanner read = new Scanner(System.in);

    //Crear cuenta
    // Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
    public Cuenta createCuenta() {
        Cuenta nuevaCuenta = new Cuenta();
        
        System.out.println("Ingrese el numero de cuenta");
        nuevaCuenta.setNumeroCuenta(read.nextInt());
        
        System.out.println("Ingrese el numero de DNI");
        nuevaCuenta.setDNI(read.nextLong());
        
        System.out.println("Ingrese el saldo actual");
        nuevaCuenta.setSaldoActual(read.nextDouble());

        return nuevaCuenta;
    } //Fin crear cuenta

    /*Método ingresar(double ingreso): el método recibe una cantidad de dinero a
    ingresar y se la sumara a saldo actual.*/
    public Cuenta ingresar(Cuenta cuentaModificar) {
        System.out.println("Ingreso el dinero a ingresar");
        double montoIngreso = read.nextDouble();

        cuentaModificar.setSaldoActual(cuentaModificar.getSaldoActual() + montoIngreso);
        return cuentaModificar;
    } // Fin ingreso double

        /* Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
    se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, 
    se pondrá el saldo actual en 0.*/
    public Cuenta retiro(Cuenta cuentaModificar) {
        System.out.println("Ingreso el dinero a retirar");
        double montoEgreso = read.nextDouble();

        if (montoEgreso > cuentaModificar.getSaldoActual()) {
            cuentaModificar.setSaldoActual(0);
        } else {
            cuentaModificar.setSaldoActual(cuentaModificar.getSaldoActual() - montoEgreso);
        }
        return cuentaModificar;
    }
    // Fin metodo retiro

    // Extracción rápida
    // Le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
    public Cuenta extraccionRapida(Cuenta cuentaModificar) {
        System.out.println("Ingreso el dinero a retirar");
        double montoEgreso = read.nextDouble();

        while (montoEgreso > (cuentaModificar.getSaldoActual() * 0.2)) {
            System.out.println("El saldo a extraer supera el 20% del saldo\nIntente nuevamente:");
            montoEgreso = read.nextDouble();
        }
        cuentaModificar.setSaldoActual(cuentaModificar.getSaldoActual() - montoEgreso);

        return cuentaModificar;
    }
    // Fin metodo extraccion rápida

    //Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
    public void consultarSaldo(Cuenta cuentaConsulta) {
        System.out.println("El saldo actual de la cuenta es: $"+cuentaConsulta.getSaldoActual());    
    }
    // Fin metodo consulta saldo
   
    // Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
    public void consultarDatos(Cuenta cuentaConsulta) {
        System.out.println("El nº de cuenta es: "+cuentaConsulta.getNumeroCuenta());
        System.out.println("El DNI de la cuenta es: "+cuentaConsulta.getDNI());
        System.out.println("El saldo actual de la cuenta es: $"+cuentaConsulta.getSaldoActual());

    }// Fin metodo consulta saldo

} //End Public Class
