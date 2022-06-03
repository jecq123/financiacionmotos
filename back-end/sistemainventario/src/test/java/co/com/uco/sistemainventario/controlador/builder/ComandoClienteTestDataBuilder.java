package co.com.uco.sistemainventario.controlador.builder;

import co.com.uco.sistemainventario.comando.ComandoCliente;

public class ComandoClienteTestDataBuilder {
    private Integer idCliente;
    private String identificacion;
    private String nombreCompleto;
    private String contacto;
    private String correo;
    private String residencia;

    public ComandoClienteTestDataBuilder() {
        this.idCliente = 1;
        this.identificacion = "identificacion";
        this.nombreCompleto = "nombreCompleto";
        this.contacto = "contacto";
        this.correo = "correo";
        this.residencia = "residencia";
    }

    public ComandoClienteTestDataBuilder setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
        return this;
    }

    public ComandoClienteTestDataBuilder setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
        return this;
    }

    public ComandoClienteTestDataBuilder setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
        return this;
    }

    public ComandoClienteTestDataBuilder setContacto(String contacto) {
        this.contacto = contacto;
        return this;
    }

    public ComandoClienteTestDataBuilder setCorreo(String correo) {
        this.correo = correo;
        return this;
    }

    public ComandoClienteTestDataBuilder setResidencia(String residencia) {
        this.residencia = residencia;
        return this;
    }

    public ComandoCliente build() {
        ComandoCliente comandoCliente= new ComandoCliente();
        comandoCliente.setIdentificacion(identificacion);
        comandoCliente.setNombreCompleto(nombreCompleto);
        comandoCliente.setContacto(contacto);
        comandoCliente.setCorreo(correo);
        comandoCliente.setResidencia(residencia);
        return comandoCliente;
    }
}
