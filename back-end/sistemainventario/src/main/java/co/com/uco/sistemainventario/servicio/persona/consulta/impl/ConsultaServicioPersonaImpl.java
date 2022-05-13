package co.com.uco.sistemainventario.servicio.persona.consulta.impl;

import co.com.uco.sistemainventario.entidad.Persona;
import co.com.uco.sistemainventario.persistencia.PersonaRepository;
import co.com.uco.sistemainventario.servicio.persona.consulta.ConsultaServicioPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsultaServicioPersonaImpl implements ConsultaServicioPersona {

    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public Iterable<Persona> findAll() {
        return personaRepository.findAll();
    }
}
