package ejercicio.motores;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class EngineTest {

    @Test
    public void potenciaDeMotorCombustibleFueSubida(){
        Motor motorcombustible = new MotorCombustible();

        Assertions.assertThat(motorcombustible.getPotencia()).isEqualTo(0);

        motorcombustible.subirPotencia(20);

        Assertions.assertThat(motorcombustible.getPotencia()).isEqualTo(20);
    }

    @Test
    public void potenciaDeMotorCombustibleFueBajada(){

        Motor motorcombustible = new MotorCombustible();

        motorcombustible.subirPotencia(20);

        motorcombustible.bajarPotencia(10);

        Assertions.assertThat(motorcombustible.getPotencia()).isEqualTo(10);
    }

    @Test
    public void temperaturaDeMotorCombustibleFueBajada(){

        Motor motorcombustible = new MotorCombustible();

        motorcombustible.subirPotencia(30);

        double temperaturaPostSubida = motorcombustible.getTemperatura();

        motorcombustible.bajarPotencia(15);

        Assertions.assertThat(motorcombustible.getTemperatura() < temperaturaPostSubida).isTrue();

    }

    @Test
    public void temperaturaDeMotorCombustibleFueSubida(){

        Motor motorcombustible = new MotorCombustible();

        double temperaturaPreSubida = motorcombustible.getTemperatura();

        motorcombustible.subirPotencia(30);

        Assertions.assertThat(motorcombustible.getTemperatura() > temperaturaPreSubida).isTrue();

    }

    @Test
    public void potenciaDeMotorNuclearFueSubida(){
        Motor motorNuclear = new MotorNuclear();

        Assertions.assertThat(motorNuclear.getPotencia()).isEqualTo(0);

        motorNuclear.subirPotencia(20);

        Assertions.assertThat(motorNuclear.getPotencia()).isEqualTo(20);
    }


}
