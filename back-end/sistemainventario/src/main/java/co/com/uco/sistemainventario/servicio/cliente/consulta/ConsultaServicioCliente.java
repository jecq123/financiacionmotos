package co.com.uco.sistemainventario.servicio.cliente.consulta;

import co.com.uco.sistemainventario.entidad.Cliente;

public interface ConsultaServicioCliente {
    Iterable<Cliente> findAll();

    Cliente findByIdentificacion(String identificacion);
}
