package co.com.uco.sistemainventario;

import co.com.uco.sistemainventario.comando.ComandoCredito;
import co.com.uco.sistemainventario.converter.CreditoConverter;
import co.com.uco.sistemainventario.validador.excepcion.ExcepcionValorObligatorio;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;

class CreditoConverterTest {

    @Test
    void deberiaCrearCreditoExitosamente() {

        var creditoConverter = new CreditoConverter();
        var comandoCredito = new ComandoCredito();

        comandoCredito.setIdCredito(1);
        comandoCredito.setIdCliente(1);
        comandoCredito.setIdVendedor(1);
        comandoCredito.setIdMoto(1);
        comandoCredito.setValorMoto(14290000);
        comandoCredito.setValorCuotaInicial(8000000);
        comandoCredito.setNumeroCuotas(10);
        comandoCredito.setFecha(LocalDateTime.now());
        var credito = creditoConverter.crear(comandoCredito);

        assertEquals(1, credito.getCliente().getIdCliente());
        assertEquals(1, credito.getMoto().getIdMoto());
        assertEquals(1, credito.getVendedor().getIdVendedor());
        assertEquals(14290000, credito.getValorMoto());
        assertEquals(8000000, credito.getValorCuotaInicial());
        assertEquals(10, credito.getNumeroCuotas());
        //assertEquals(LocalDateTime.now(), credito.getFecha());
    }

    @Test
    void crearSinClienteDeberiaLanzarError() {

        var creditoConverter = new CreditoConverter();
        var comandoCredito = new ComandoCredito();

        comandoCredito.setIdCredito(1);
        comandoCredito.setIdVendedor(1);
        comandoCredito.setIdMoto(1);
        comandoCredito.setValorMoto(14290000);
        comandoCredito.setValorCuotaInicial(8000000);
        comandoCredito.setNumeroCuotas(10);
        comandoCredito.setFecha(LocalDateTime.now());

        try {
            creditoConverter.crear(comandoCredito);
        } catch (ExcepcionValorObligatorio e){
            assertEquals("El id del cliente es obligatorio", e.getMessage());
        }
    }


    @Test
    void crearSinVendedorDeberiaLanzarError() {

        var creditoConverter = new CreditoConverter();
        var comandoCredito = new ComandoCredito();

        comandoCredito.setIdCredito(1);
        comandoCredito.setIdCliente(1);
        comandoCredito.setIdMoto(1);
        comandoCredito.setValorMoto(14290000);
        comandoCredito.setValorCuotaInicial(8000000);
        comandoCredito.setNumeroCuotas(10);
        comandoCredito.setFecha(LocalDateTime.now());

        try {
            creditoConverter.crear(comandoCredito);
        } catch (ExcepcionValorObligatorio e){
            assertEquals("El id del vendedor es obligatorio", e.getMessage());
        }
    }

    @Test
    void crearSinMotoDeberiaLanzarError() {

        var creditoConverter = new CreditoConverter();
        var comandoCredito = new ComandoCredito();

        comandoCredito.setIdCredito(1);
        comandoCredito.setIdCliente(1);
        comandoCredito.setIdVendedor(1);
        comandoCredito.setValorMoto(14290000);
        comandoCredito.setValorCuotaInicial(8000000);
        comandoCredito.setNumeroCuotas(10);
        comandoCredito.setFecha(LocalDateTime.now());

        try {
            creditoConverter.crear(comandoCredito);
        } catch (ExcepcionValorObligatorio e){
            assertEquals("El id de la moto es obligatorio", e.getMessage());
        }
    }

    @Test
    void crearSinValorMotoDeberiaLanzarError() {

        var creditoConverter = new CreditoConverter();
        var comandoCredito = new ComandoCredito();

        comandoCredito.setIdCredito(1);
        comandoCredito.setIdCliente(1);
        comandoCredito.setIdVendedor(1);
        comandoCredito.setIdMoto(1);
        comandoCredito.setValorCuotaInicial(8000000);
        comandoCredito.setNumeroCuotas(10);
        comandoCredito.setFecha(LocalDateTime.now());

        try {
            creditoConverter.crear(comandoCredito);
        } catch (ExcepcionValorObligatorio e){
            assertEquals("El valor de la moto es obligatorio", e.getMessage());
        }
    }

    @Test
    void crearSinValorCuotaInicialDeberiaLanzarError() {

        var creditoConverter = new CreditoConverter();
        var comandoCredito = new ComandoCredito();

        comandoCredito.setIdCredito(1);
        comandoCredito.setIdCliente(1);
        comandoCredito.setIdVendedor(1);
        comandoCredito.setIdMoto(1);
        comandoCredito.setValorMoto(14290000);
        comandoCredito.setNumeroCuotas(10);
        comandoCredito.setFecha(LocalDateTime.now());

        try {
            creditoConverter.crear(comandoCredito);
        } catch (ExcepcionValorObligatorio e){
            assertEquals("El valor de la cuota inicial es obligatorio", e.getMessage());
        }
    }

    @Test
    void crearSinNumeroCuotasDeberiaLanzarError() {

        var creditoConverter = new CreditoConverter();
        var comandoCredito = new ComandoCredito();

        comandoCredito.setIdCredito(1);
        comandoCredito.setIdCliente(1);
        comandoCredito.setIdVendedor(1);
        comandoCredito.setIdMoto(1);
        comandoCredito.setValorMoto(14290000);
        comandoCredito.setValorCuotaInicial(8000000);
        comandoCredito.setFecha(LocalDateTime.now());

        try {
            creditoConverter.crear(comandoCredito);
        } catch (ExcepcionValorObligatorio e){
            assertEquals("Se requiere el número de cuotas", e.getMessage());
        }
    }

    @Test
    void crearSinFechaDeberiaLanzarError() {

        var creditoConverter = new CreditoConverter();
        var comandoCredito = new ComandoCredito();

        comandoCredito.setIdCredito(1);
        comandoCredito.setIdCliente(1);
        comandoCredito.setIdVendedor(1);
        comandoCredito.setIdMoto(1);
        comandoCredito.setValorMoto(14290000);
        comandoCredito.setValorCuotaInicial(8000000);
        comandoCredito.setNumeroCuotas(10);

        try {
            creditoConverter.crear(comandoCredito);
        } catch (ExcepcionValorObligatorio e){
            assertEquals("La fecha del crédito es obligatoria", e.getMessage());
        }
    }

 }
