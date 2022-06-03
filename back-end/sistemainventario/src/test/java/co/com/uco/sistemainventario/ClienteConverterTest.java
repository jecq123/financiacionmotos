package co.com.uco.sistemainventario;

import co.com.uco.sistemainventario.comando.ComandoCliente;
import co.com.uco.sistemainventario.converter.ClienteConverter;
import co.com.uco.sistemainventario.validador.excepcion.ExcepcionValorObligatorio;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ClienteConverterTest {

    @Test
    void deberiaCrearClienteExitosamente() {

        var clienteConverter = new ClienteConverter();
        var comandoCliente = new ComandoCliente();

        comandoCliente.setIdCliente(1);
        comandoCliente.setIdentificacion("1001");
        comandoCliente.setNombreCompleto("Juan Perez");
        comandoCliente.setContacto("310000");
        comandoCliente.setCorreo("juan@hotmail.com");
        comandoCliente.setResidencia("Marinilla");

        var cliente = clienteConverter.crear(comandoCliente);
        assertEquals("1001", cliente.getIdentificacion());
        assertEquals("Juan Perez", cliente.getNombreCompleto());
        assertEquals("310000", cliente.getContacto());
        assertEquals("juan@hotmail.com", cliente.getCorreo());
        assertEquals("Marinilla", cliente.getResidencia());
    }

    @Test
    void crearSinNombreDeberiaLanzarError() {
        var clienteConverter = new ClienteConverter();
        var comandoCliente = new ComandoCliente();

        comandoCliente.setIdCliente(1);
        comandoCliente.setIdentificacion("1001");
        comandoCliente.setContacto("310000");
        comandoCliente.setCorreo("juan@hotmail.com");
        comandoCliente.setResidencia("Marinilla");

        try {
            clienteConverter.crear(comandoCliente);
        } catch (ExcepcionValorObligatorio e) {
            assertEquals("El nombre del cliente es obligatorio", e.getMessage());
        }
    }

    @Test
    void crearSinContactoDeberiaLanzarError() {
        var clienteConverter = new ClienteConverter();
        var comandoCliente = new ComandoCliente();

        comandoCliente.setIdCliente(1);
        comandoCliente.setIdentificacion("1001");
        comandoCliente.setNombreCompleto("Juan Perez");
        comandoCliente.setCorreo("juan@hotmail.com");
        comandoCliente.setResidencia("Marinilla");

        try {
            clienteConverter.crear(comandoCliente);
        } catch (ExcepcionValorObligatorio e) {
            assertEquals("El contacto del cliente es obligatorio", e.getMessage());
        }
    }

    @Test
    void crearSinCorreoDeberiaLanzarError() {
        var clienteConverter = new ClienteConverter();
        var comandoCliente = new ComandoCliente();

        comandoCliente.setIdCliente(1);
        comandoCliente.setIdentificacion("1001");
        comandoCliente.setNombreCompleto("Juan Perez");
        comandoCliente.setContacto("310000");
        comandoCliente.setResidencia("Marinilla");

        try {
            clienteConverter.crear(comandoCliente);
        } catch (ExcepcionValorObligatorio e) {
            assertEquals("El correo es obligatorio", e.getMessage());
        }
    }

    @Test
    void crearSinResidenciaDeberiaLanzarError() {
        var clienteConverter = new ClienteConverter();
        var comandoCliente = new ComandoCliente();

        comandoCliente.setIdCliente(1);
        comandoCliente.setIdentificacion("1001");
        comandoCliente.setNombreCompleto("Juan Perez");
        comandoCliente.setContacto("310000");
        comandoCliente.setCorreo("juan@hotmail.com");

        try {
            clienteConverter.crear(comandoCliente);
        } catch (ExcepcionValorObligatorio e) {
            assertEquals("Una dirección es obligatoria", e.getMessage());
        }
    }
}
