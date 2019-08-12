package ejercicio.motores;

public class MotorNuclear extends Motor {

    private boolean tieneRefrigerante = false;

    public boolean isTieneRefrigerante() {
        return tieneRefrigerante;
    }

    public void setTieneRefrigerante(boolean tieneRefrigerante) {
        this.tieneRefrigerante = tieneRefrigerante;
    }

    public void subirPotencia(double potencia, boolean refrigerante){
        super.subirPotencia(potencia);
    }
}
