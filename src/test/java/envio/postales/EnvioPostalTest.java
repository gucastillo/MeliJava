package envio.postales;

import ejercicio.envio.postales.AsignadorVehiculos;
import ejercicio.envio.postales.Despachador;
import ejercicio.envio.postales.Envio;
import ejercicio.envio.postales.Paquete;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class EnvioPostalTest {

    @Test
    public void asignadorVehiculoPesoPermitidoEnAlMenosAlgunVehiculo () {

        Assertions.assertThat(AsignadorVehiculos.obtenerVehiculoPorPeso(10)).isNotNull();

        Assertions.assertThat(AsignadorVehiculos.obtenerVehiculoPorPeso(50)).isNotNull();

        Assertions.assertThat(AsignadorVehiculos.obtenerVehiculoPorPeso(140)).isNotNull();
    }

    @Test
    public void asignadorVehiculoPesoNoPermitido () {
        Assertions.assertThat(AsignadorVehiculos.obtenerVehiculoPorPeso(160)).isNull();
    }

    @Test
    public void generarUnEnvioCorrectamente() {

        Despachador despachador = new Despachador();
        List<Paquete> paquetes = new ArrayList<>();

        Paquete paquete1 = new paqueteMock(2);
        Paquete paquete2 = mock(Paquete.class);
        Paquete paquete3 = mock(Paquete.class);

       // when(paquete1.getPeso()).thenReturn(3.4);
        when(paquete2.getPeso()).thenReturn(51.0);
        when(paquete3.getPeso()).thenReturn(100.0);


        Envio envioGenerado = despachador.generarEnvio(paquetes,"Posta 4700");

        Assertions.assertThat(envioGenerado).isNotNull();

        Assertions.assertThat(envioGenerado.getTransporte()).isNotNull();

        Assertions.assertThat(envioGenerado.getCosto()).isGreaterThan(0);

        Assertions.assertThat(envioGenerado.getCosto()).isGreaterThan(0);

        Assertions.assertThat(envioGenerado.getCosto()).isGreaterThan(0);

        //Nuevas Pruebas

        Assertions.assertThat(envioGenerado.getCosto()).isGreaterThan(0);

        Assertions.assertThat(envioGenerado.getCosto()).isGreaterThan(0);

    }

    public class paqueteMock extends Paquete {

        public paqueteMock(double peso) {
            super(peso);
        }

        @Override
        public double getPeso() {
            return  5.0;
        }
    }

}
