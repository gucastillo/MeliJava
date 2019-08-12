package ejercicio.estacionamiento;

public class Carga {

    private double peso;

    private boolean asignado = false;

    public Carga (double peso){
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public boolean isAsignado() {
        return asignado;
    }

    public void setAsignado(boolean asignado) {
        this.asignado = asignado;
    }
}
