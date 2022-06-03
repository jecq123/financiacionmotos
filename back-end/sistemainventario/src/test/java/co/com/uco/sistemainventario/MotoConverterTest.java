package co.com.uco.sistemainventario;

import co.com.uco.sistemainventario.comando.ComandoMoto;
import co.com.uco.sistemainventario.converter.MotoConverter;
import co.com.uco.sistemainventario.validador.excepcion.ExcepcionValorObligatorio;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MotoConverterTest {

    @Test
    void deberiaCrearMotoExitosamente() {

        var motoConverter = new MotoConverter();
        var comandoMoto = new ComandoMoto();

        comandoMoto.setIdMoto(1);
        comandoMoto.setReferencia("Gixxer 250");
        comandoMoto.setMarca("Suzuki");
        comandoMoto.setModelo(2022);
        comandoMoto.setCilindraje(249);
        comandoMoto.setPrecio(14290000);

        var moto = motoConverter.crear(comandoMoto);
        assertEquals("Gixxer 250", moto.getReferencia());
        assertEquals("Suzuki", moto.getMarca());
        assertEquals(2022, moto.getModelo());
        assertEquals(249, moto.getCilindraje());
        assertEquals(14290000, moto.getPrecio());
    }

    @Test
    void crearSinReferenciaDeberiaLanzarError() {
        var motoConverter = new MotoConverter();
        var comandoMoto = new ComandoMoto();

        comandoMoto.setIdMoto(1);
        comandoMoto.setMarca("Suzuki");
        comandoMoto.setModelo(2022);
        comandoMoto.setCilindraje(249);
        comandoMoto.setPrecio(14290000);

        try {
            motoConverter.crear(comandoMoto);
        } catch (ExcepcionValorObligatorio e) {
            assertEquals("La referencia de la moto es obligatoria", e.getMessage());
        }
    }

    @Test
    void crearSinMarcaDeberiaLanzarError() {
        var motoConverter = new MotoConverter();
        var comandoMoto = new ComandoMoto();

        comandoMoto.setIdMoto(1);
        comandoMoto.setReferencia("Gixxer 250");
        comandoMoto.setModelo(2022);
        comandoMoto.setCilindraje(249);
        comandoMoto.setPrecio(14290000);

        try {
            motoConverter.crear(comandoMoto);
        } catch (ExcepcionValorObligatorio e) {
            assertEquals("La marca de la moto es obligatoria", e.getMessage());
        }
    }

    @Test
    void crearSinModeloDeberiaLanzarError() {
        var motoConverter = new MotoConverter();
        var comandoMoto = new ComandoMoto();

        comandoMoto.setIdMoto(1);
        comandoMoto.setReferencia("Gixxer 250");
        comandoMoto.setMarca("Suzuki");
        comandoMoto.setCilindraje(249);
        comandoMoto.setPrecio(14290000);

        try {
            motoConverter.crear(comandoMoto);
        } catch (ExcepcionValorObligatorio e) {
            assertEquals("El modelo de la moto es obligatorio", e.getMessage());
        }
    }

    @Test
    void crearSinCilindrajeDeberiaLanzarError() {
        var motoConverter = new MotoConverter();
        var comandoMoto = new ComandoMoto();

        comandoMoto.setIdMoto(1);
        comandoMoto.setReferencia("Gixxer 250");
        comandoMoto.setMarca("Suzuki");
        comandoMoto.setModelo(2022);
        comandoMoto.setPrecio(14290000);

        try {
            motoConverter.crear(comandoMoto);
        } catch (ExcepcionValorObligatorio e) {
            assertEquals("El cilindraje de la moto es obligatorio", e.getMessage());
        }
    }

    @Test
    void crearSinPrecioDeberiaLanzarError() {
        var motoConverter = new MotoConverter();
        var comandoMoto = new ComandoMoto();

        comandoMoto.setIdMoto(1);
        comandoMoto.setReferencia("Gixxer 250");
        comandoMoto.setMarca("Suzuki");
        comandoMoto.setModelo(2022);
        comandoMoto.setCilindraje(249);

        try {
            motoConverter.crear(comandoMoto);
        } catch (ExcepcionValorObligatorio e) {
            assertEquals("El precio de la moto es obligatorio", e.getMessage());
        }
    }
}
