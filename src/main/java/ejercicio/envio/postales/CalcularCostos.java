package ejercicio.envio.postales;

public class CalcularCostos {


    public static double calcularPorCantidadDePaquetes(int cantidaPaquetes){

        return calcularPorCantidadDePaquetes(cantidaPaquetes, false);
    }

    public static double calcularPorCantidadDePaquetes(int cantidaPaquetes , boolean aplicaDescuento){


        double costoTotal = 0;

        if( cantidaPaquetes < 5)
            costoTotal = 50;

        if( cantidaPaquetes < 10)
            costoTotal = 80;

        if( cantidaPaquetes >10)
            costoTotal = 80 + (15 * (cantidaPaquetes - 10));

        if(aplicaDescuento)
            costoTotal = costoTotal * 0.90;

        return costoTotal;
    }
}
