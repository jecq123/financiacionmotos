package co.com.uco.sistemainventario.servicio.vendedor.consulta;

import co.com.uco.sistemainventario.entidad.Vendedor;

public interface ConsultaServicioVendedor {
    Iterable<Vendedor> findAll();
}
