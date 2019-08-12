package ejercicio.envio.postales;

import java.util.ArrayList;
import java.util.List;

public class AsignadorVehiculos {


    public static Vehiculo obtenerVehiculoPorPeso(double pesoTotal){

        if(pesoTotal <= 5){
            return new Bicicleta();
        }else if ( pesoTotal <= 50){
            return new Auto();
        }else  if ( pesoTotal <= 150){
            return  new Camioneta();
        }else {
            return  null;
        }

    }

}
