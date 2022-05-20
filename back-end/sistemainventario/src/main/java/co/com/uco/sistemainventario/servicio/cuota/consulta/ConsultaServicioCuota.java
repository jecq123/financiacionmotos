package co.com.uco.sistemainventario.servicio.cuota.consulta;

import co.com.uco.sistemainventario.entidad.Cuota;

public interface ConsultaServicioCuota {
    Iterable<Cuota> findAll();
}
