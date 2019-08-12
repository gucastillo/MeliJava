package ar.com.mercadolibre.javaoop;

public class Cerradura {

    public Integer clave = 1234;

    private Boolean cerrada = true;

    public Cerradura(){

    }

    public Cerradura( Integer clave ){
        this.clave = clave;
    }

    public boolean estaCerrada (){
        return  cerrada;
    }

    public void abrir (Integer clave){
        if(this.clave == clave){
            this.cerrada = false;
        }

    }
}
