package co.com.uco.sistemainventario.servicio.moto.consulta;

import co.com.uco.sistemainventario.entidad.Moto;

public interface ConsultaServicioMoto {
    Iterable<Moto> findAll();
}
