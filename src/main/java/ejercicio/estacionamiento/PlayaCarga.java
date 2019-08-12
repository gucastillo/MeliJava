package ejercicio.estacionamiento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PlayaCarga {

    private List<Carga> cargas = new ArrayList<Carga>();

    private PlayaCarga(){}

    private static PlayaCarga instancia = new PlayaCarga();


    public static PlayaCarga getInstance() {
        return instancia;
    }

    public List<Carga> getCargas() {
        return cargas;
    }

    public void setCargas(List<Carga> cargas) {
        this.cargas = cargas;
    }

    public void ingresarUtilitario(Utilitario utilitario){

       List<Carga> cargasConPesoPermitido = cargas.stream().filter( x -> x.getPeso() >= utilitario.getPesoMaximo()).collect(Collectors.toList());

       if(!cargasConPesoPermitido.isEmpty()){
            utilitario.ingresarCarga(cargasConPesoPermitido.get(0));
            utilitario.getCarga().setAsignado(true);
       }
    }


     public long obtenerCargasDespachadas(){
        return cargas.stream().filter(Carga::isAsignado).count();
     }


}
