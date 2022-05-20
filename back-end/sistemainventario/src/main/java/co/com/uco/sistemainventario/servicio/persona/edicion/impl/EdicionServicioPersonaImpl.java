package co.com.uco.sistemainventario.servicio.persona.edicion.impl;

import co.com.uco.sistemainventario.entidad.Persona;
import co.com.uco.sistemainventario.persistencia.PersonaRepository;
import co.com.uco.sistemainventario.servicio.persona.edicion.EdicionServicioPersona;
import co.com.uco.sistemainventario.validador.excepcion.ExcepcionNoExisteRegistro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EdicionServicioPersonaImpl implements EdicionServicioPersona {

    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public Integer ejecutar(Persona persona) {
        Persona personaAnterior = buscarPersona(persona);
        personaAnterior.setContacto(persona.getContacto());
        personaAnterior.setIdentificacion(persona.getIdentificacion());
        personaAnterior.setNombreCompleto(persona.getNombreCompleto());
        personaRepository.save(personaAnterior);
        return personaAnterior.getIdPersona();
    }

    private Persona buscarPersona(Persona persona) {
        return personaRepository.findById(persona.getIdPersona())
                .orElseThrow(() -> new ExcepcionNoExisteRegistro("No existe la persona"));
    }
}
