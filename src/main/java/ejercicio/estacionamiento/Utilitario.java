package ejercicio.estacionamiento;

public abstract class Utilitario extends Vehiculo {

    private double pesoMaximo;

    private Carga carga;

    public Utilitario(double pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }

    public double getPesoMaximo() {
        return pesoMaximo;
    }

    public Carga getCarga() {
        return carga;
    }


    public void ingresarCarga (Carga carga){
        if (carga.getPeso() <= pesoMaximo)
            this.carga = carga;
    }
}
