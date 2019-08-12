package ejercicio.envio.postales;

import java.util.ArrayList;
import java.util.List;

public class Despachador {

    private List<Envio> enviosRealizados = new ArrayList<>();

    public Envio generarEnvio(List<Paquete> paquetes, String direccionEntrega){

        double pesoTotal = paquetes.stream().mapToDouble(Paquete::getPeso).sum();

        Vehiculo vehiculoDisponible = AsignadorVehiculos.obtenerVehiculoPorPeso(pesoTotal);

        if (vehiculoDisponible == null) return null;

        double costoEnvio;

        if (enviosRealizados.size() <= 10) {
            costoEnvio = CalcularCostos.calcularPorCantidadDePaquetes(paquetes.size(), true);
        }
        else {
            costoEnvio = CalcularCostos.calcularPorCantidadDePaquetes(paquetes.size());
        }

        Envio envio = new Envio(direccionEntrega, vehiculoDisponible, paquetes, costoEnvio);

        enviosRealizados.add(envio);

        return envio;

    }
}
