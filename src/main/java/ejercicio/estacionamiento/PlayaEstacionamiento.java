package ejercicio.estacionamiento;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PlayaEstacionamiento {

    private List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();

    private PlayaEstacionamiento(){}

    private static PlayaEstacionamiento instancia = new PlayaEstacionamiento();


    public static PlayaEstacionamiento getInstance() {
        return instancia;
    }


    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public Long cantidadCamionetasCargasVacias(){

        return  vehiculos.stream().filter( x ->
            {
                if(x instanceof Camioneta){
                   return  ((Camioneta) x).getCarga() != null;
                }
                return false;
            }
        ).count();

    }

    public List<Utilitario> obtenerUtilitarios(){

        List<Utilitario> utilitarios = new ArrayList<>();

        vehiculos.stream().forEach( x -> {
            if (x instanceof Utilitario)
                utilitarios.add((Utilitario) x);
        });

        return  utilitarios;
    }
}
