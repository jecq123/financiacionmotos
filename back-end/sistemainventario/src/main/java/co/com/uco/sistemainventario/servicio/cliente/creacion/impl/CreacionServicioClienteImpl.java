package co.com.uco.sistemainventario.servicio.cliente.creacion.impl;

import co.com.uco.sistemainventario.entidad.Cliente;
import co.com.uco.sistemainventario.entidad.Inventario;
import co.com.uco.sistemainventario.entidad.Persona;
import co.com.uco.sistemainventario.persistencia.ClienteRepository;
import co.com.uco.sistemainventario.persistencia.PersonaRepository;
import co.com.uco.sistemainventario.servicio.cliente.creacion.CreacionServicioCliente;
import co.com.uco.sistemainventario.validador.excepcion.ExcepcionNoExisteRegistro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreacionServicioClienteImpl implements CreacionServicioCliente {
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public Integer ejecutar(Cliente cliente) {
        Persona persona= buscarPersona(cliente);
        cliente.setPersona(persona);
        clienteRepository.save(cliente);
        return cliente.getIdCliente();
    }

    private Persona buscarPersona(Cliente cliente) {
        return personaRepository.findById(cliente.getPersona().getIdPersona())
                .orElseThrow(() -> new ExcepcionNoExisteRegistro("No existe la persona"));
    }
}
