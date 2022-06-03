package co.com.uco.sistemainventario.converter;

import co.com.uco.sistemainventario.comando.ComandoCliente;
import co.com.uco.sistemainventario.entidad.Cliente;
import co.com.uco.sistemainventario.validador.ValidadorArgumento;
import org.springframework.stereotype.Component;

@Component
public class ClienteConverter {

    public static final String EL_ID_DE_UNA_PERSONA_ES_OBLIGATORIO = "El id de una persona es obligatorio";
    public static final String EL_CORREO_ES_OBLIGATORIO = "El correo es obligatorio";
    public static final String UNA_DIRECCION_ES_OBLIGATORIA = "Una dirección es obligatoria";
    public static final String EL_ID_DEL_CLIENTE_ES_OBLIGATORIO = "El id del cliente es obligatorio";
    public static final String EL_ID_DEL_CLIENTE_NO_ES_VALIDO = "El id del cliente no es válido";
    public static final String LA_IDENTIFICACION_DEL_CLIENTE_ES_OBLIGATORIA = "La identificacion del cliente es obligatoria";
    public static final String EL_NOMBRE_DEL_CLIENTE_ES_OBLIGATORIO = "El nombre del cliente es obligatorio";
    public static final String EL_CONTACTO_DEL_CLIENTE_ES_OBLIGATORIO = "El contacto del cliente es obligatorio";

    public Cliente crear(ComandoCliente comandoCliente) {
        Cliente cliente = new Cliente();
        ValidadorArgumento.validarObligatorio(comandoCliente.getIdentificacion(), LA_IDENTIFICACION_DEL_CLIENTE_ES_OBLIGATORIA);
        ValidadorArgumento.validarObligatorio(comandoCliente.getNombreCompleto(), EL_NOMBRE_DEL_CLIENTE_ES_OBLIGATORIO);
        ValidadorArgumento.validarObligatorio(comandoCliente.getContacto(), EL_CONTACTO_DEL_CLIENTE_ES_OBLIGATORIO);
        ValidadorArgumento.validarObligatorio(comandoCliente.getCorreo(), EL_CORREO_ES_OBLIGATORIO);
        ValidadorArgumento.validarObligatorio(comandoCliente.getResidencia(), UNA_DIRECCION_ES_OBLIGATORIA);
        cliente.setIdentificacion(comandoCliente.getIdentificacion());
        cliente.setNombreCompleto(comandoCliente.getNombreCompleto());
        cliente.setContacto(comandoCliente.getContacto());
        cliente.setCorreo(comandoCliente.getCorreo());
        cliente.setResidencia(comandoCliente.getResidencia());
        return cliente;
    }

    public Cliente editar(ComandoCliente comandoCliente) {
        Cliente cliente = new Cliente();
        ValidadorArgumento.validarObligatorio(comandoCliente.getIdCliente(), EL_ID_DEL_CLIENTE_ES_OBLIGATORIO);
        ValidadorArgumento.validarObligatorio(comandoCliente.getIdentificacion(), LA_IDENTIFICACION_DEL_CLIENTE_ES_OBLIGATORIA);
        ValidadorArgumento.validarObligatorio(comandoCliente.getNombreCompleto(), EL_NOMBRE_DEL_CLIENTE_ES_OBLIGATORIO);
        ValidadorArgumento.validarObligatorio(comandoCliente.getContacto(), EL_CONTACTO_DEL_CLIENTE_ES_OBLIGATORIO);
        ValidadorArgumento.validarObligatorio(comandoCliente.getCorreo(), EL_CORREO_ES_OBLIGATORIO);
        ValidadorArgumento.validarObligatorio(comandoCliente.getResidencia(), UNA_DIRECCION_ES_OBLIGATORIA);
        cliente.setIdentificacion(comandoCliente.getIdentificacion());
        cliente.setNombreCompleto(comandoCliente.getNombreCompleto());
        cliente.setContacto(comandoCliente.getContacto());
        cliente.setCorreo(comandoCliente.getCorreo());
        cliente.setResidencia(comandoCliente.getResidencia());
        return cliente;
    }

    public Cliente borrar(Integer idCliente) {
        ValidadorArgumento.validarObligatorio(idCliente, EL_ID_DEL_CLIENTE_ES_OBLIGATORIO);
        ValidadorArgumento.validarPositivo(idCliente, EL_ID_DEL_CLIENTE_NO_ES_VALIDO);
        Cliente cliente = new Cliente();
        cliente.setIdCliente(idCliente);
        return cliente;
    }
}
