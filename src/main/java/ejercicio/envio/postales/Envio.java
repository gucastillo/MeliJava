package ejercicio.envio.postales;

import java.util.ArrayList;
import java.util.List;

public class Envio {

    private List<Paquete> paquetes;

    private double costo;

    private String direccionEntrega;

    private Vehiculo transporte;

    public Envio(String direccionEntrega, Vehiculo transporte, List<Paquete> paquetes, double costo) {
        this.direccionEntrega = direccionEntrega;
        this.transporte = transporte;
        this.costo = costo;
        this.paquetes = paquetes;
    }

    public List<Paquete> getPaquetes() {
        return paquetes;
    }

    public double getCosto() {
        return costo;
    }

    public String getDireccionEntrega() {
        return direccionEntrega;
    }

    public Vehiculo getTransporte() {
        return transporte;
    }
}
