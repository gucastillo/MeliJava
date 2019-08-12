package ejercicio.estacionamiento;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class estacionamientoTest {

    private PlayaEstacionamiento playaEstacionamiento = null;
    private PlayaCarga playaCarga = null;

    @Before
    public void before(){

        playaEstacionamiento = PlayaEstacionamiento.getInstance();
        playaCarga = PlayaCarga.getInstance();

        List<Vehiculo> vehiculos = new ArrayList<>();

        agregarVehiculos(vehiculos);

        List<Carga> cargas = new ArrayList<>();

        agregarCargas(cargas);

        playaEstacionamiento.setVehiculos(vehiculos);
        playaCarga.setCargas(cargas);
    }

    @Test
    public void ingresaUtilitarioYSeCargaPermitida(){

       // final Utilitario utilitario = playaEstacionamiento.getVehiculos().get(2);

    }




    private void agregarCargas(List<Carga> cargas) {
        cargas.add(new Carga(50));
        cargas.add(new Carga(75));
        cargas.add(new Carga(500));
        cargas.add(new Carga(450));
        cargas.add(new Carga(100));
        cargas.add(new Carga(20));
    }

    private void agregarVehiculos(List<Vehiculo> vehiculos) {
        vehiculos.add(new Auto());
        vehiculos.add(new Auto());
        vehiculos.add(new Camion(100));
        vehiculos.add(new Camion(250));
        vehiculos.add(new Camioneta(50));
        vehiculos.add(new Camioneta(75));
    }

}
