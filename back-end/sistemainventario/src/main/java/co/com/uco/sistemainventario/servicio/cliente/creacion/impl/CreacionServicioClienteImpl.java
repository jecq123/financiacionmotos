package co.com.uco.sistemainventario.servicio.cliente.creacion.impl;

import co.com.uco.sistemainventario.entidad.Cliente;
import co.com.uco.sistemainventario.entidad.Inventario;
import co.com.uco.sistemainventario.entidad.Persona;
import co.com.uco.sistemainventario.persistencia.ClienteRepository;
import co.com.uco.sistemainventario.persistencia.PersonaRepository;
import co.com.uco.sistemainventario.servicio.cliente.creacion.CreacionServicioCliente;
import co.com.uco.sistemainventario.validador.excepcion.ExcepcionDuplicidad;
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
        clienteRepository.save(cliente);
        return cliente.getIdCliente();
    }

    private Cliente buscarCliente(Cliente cliente) {
        return clienteRepository.findByIdentificacion(cliente.getIdentificacion()).orElseThrow(() -> new ExcepcionDuplicidad("Ya existe un cliente con esa identificacion"));
    }

}
