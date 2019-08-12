package ejercicio.motores;


public class Motor {

    private double Potencia = 0;

    private double Temperatura = 0;



    public double getPotencia() {
        return Potencia;
    }

    public void setPotencia(double potencia) {
        Potencia = potencia;
    }

    public double getTemperatura() {
        return Temperatura;
    }

    public void setTemperatura(double temperatura) {
        Temperatura = temperatura;
    }

    public void subirPotencia(double potencia){
        this.Potencia = potencia;
        this.Temperatura = calcularTemperatura(potencia);
    }

    public void bajarPotencia(double potencia){
        this.Potencia = this.Potencia - potencia;

        if(this.Potencia < 0)
            this.Potencia = 0;

        this.Temperatura = calcularTemperatura(this.Potencia);
    }

    private double  calcularTemperatura(double potencia){
        return  potencia * 0.5;
    }

}
