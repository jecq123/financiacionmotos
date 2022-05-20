package co.com.uco.sistemainventario.servicio.persona.consulta;

import co.com.uco.sistemainventario.entidad.Persona;

public interface ConsultaServicioPersona {
    Iterable<Persona> findAll();
}
