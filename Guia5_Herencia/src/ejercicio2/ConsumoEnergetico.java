package ejercicio2;

public enum ConsumoEnergetico {
    A(1000.0), B(800.0), C(600.0), D(500.0), E(300.0), F(100.0);
   
    private Double precio;
    
    ConsumoEnergetico(Double precio){
        this.precio = precio;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

}
