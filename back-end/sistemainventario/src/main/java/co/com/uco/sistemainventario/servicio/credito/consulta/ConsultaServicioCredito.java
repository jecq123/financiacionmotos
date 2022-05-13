package co.com.uco.sistemainventario.servicio.credito.consulta;

import co.com.uco.sistemainventario.entidad.Credito;

public interface ConsultaServicioCredito {
    Iterable<Credito> findAll();
}
