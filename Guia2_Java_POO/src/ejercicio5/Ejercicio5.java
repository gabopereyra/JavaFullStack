package ejercicio5;

public class Ejercicio5 {

    public static void main(String[] args) {
        Cuenta cuenta;
        CuentaServicio cuentaServ = new CuentaServicio();

        cuenta = cuentaServ.createCuenta();

        cuentaServ.consultarSaldo(cuenta);
        cuentaServ.consultarDatos(cuenta);
    }

}
