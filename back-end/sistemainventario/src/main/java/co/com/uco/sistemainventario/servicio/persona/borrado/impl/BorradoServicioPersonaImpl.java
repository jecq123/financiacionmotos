package co.com.uco.sistemainventario.servicio.persona.borrado.impl;

import co.com.uco.sistemainventario.entidad.Cuota;
import co.com.uco.sistemainventario.entidad.Persona;
import co.com.uco.sistemainventario.persistencia.PersonaRepository;
import co.com.uco.sistemainventario.servicio.persona.borrado.BorradoServicioPersona;
import co.com.uco.sistemainventario.validador.excepcion.ExcepcionNoExisteRegistro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BorradoServicioPersonaImpl implements BorradoServicioPersona {

    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public Integer ejecutar(Persona persona) {
        buscarPersona(persona);
        personaRepository.deleteById(persona.getIdPersona());
        return persona.getIdPersona();
    }

    private Persona buscarPersona(Persona persona) {
        return personaRepository.findById(persona.getIdPersona())
                .orElseThrow(() -> new ExcepcionNoExisteRegistro("No existe la persona"));
    }
}
