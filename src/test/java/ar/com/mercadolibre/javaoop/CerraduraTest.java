package ar.com.mercadolibre.javaoop;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.Callable;

public class CerraduraTest {

    @Test
    public void crearCerradura(){

        Cerradura cerradura = new Cerradura();
        Assertions.assertThat(cerradura).isNotNull();

    }

    @Test
    public void crearCerraduraConClave(){

        Cerradura cerradura = new Cerradura(1234);
        Assertions.assertThat(cerradura).isNotNull();

    }

    @Test
    public void crearCerraduraConClaveyGuarde(){

        Cerradura cerradura = new Cerradura(1235);
        Assertions.assertThat(cerradura).isNotNull();
        Assertions.assertThat(cerradura.clave).isEqualTo(1235);

    }

    @Test
    public void unaCerraduraSeCreaCerrada(){

        Cerradura cerradura = new Cerradura(1235);
        Assertions.assertThat(cerradura.estaCerrada()).isTrue();

    }

    @Test
    public void abrirCerradura(){

        // Crear  Cerradura
        Cerradura cerradura = new Cerradura(1235);
        // Veo que este cerrada
        Assertions.assertThat(cerradura.estaCerrada()).isTrue();
        // La intento Abrir
        cerradura.abrir(12345);
        // Verifico que este Abierta
//        Assertions.assertThat(cerradura.estaCerrada()).isFalse();
    }
}
