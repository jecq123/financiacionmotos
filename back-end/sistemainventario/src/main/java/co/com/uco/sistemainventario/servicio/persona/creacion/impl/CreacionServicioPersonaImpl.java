package co.com.uco.sistemainventario.servicio.persona.creacion.impl;

import co.com.uco.sistemainventario.entidad.Persona;
import co.com.uco.sistemainventario.persistencia.PersonaRepository;
import co.com.uco.sistemainventario.servicio.persona.creacion.CreacionServicioPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreacionServicioPersonaImpl implements CreacionServicioPersona {

    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public Integer ejecutar(Persona persona) {
        personaRepository.save(persona);
        return persona.getIdPersona();
    }
}
