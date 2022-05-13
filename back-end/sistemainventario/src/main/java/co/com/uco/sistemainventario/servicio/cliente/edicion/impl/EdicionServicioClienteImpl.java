package co.com.uco.sistemainventario.servicio.cliente.edicion.impl;

import co.com.uco.sistemainventario.entidad.Cliente;
import co.com.uco.sistemainventario.persistencia.ClienteRepository;
import co.com.uco.sistemainventario.servicio.cliente.edicion.EdicionServicioCliente;
import co.com.uco.sistemainventario.validador.excepcion.ExcepcionNoExisteRegistro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EdicionServicioClienteImpl implements EdicionServicioCliente {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Integer ejecutar(Cliente cliente) {
        Cliente clienteAnterior= buscarCliente(cliente);
        clienteAnterior.setPersona(cliente.getPersona());
        clienteAnterior.setCorreo(cliente.getCorreo());
        clienteAnterior.setResidencia(cliente.getResidencia());
        clienteRepository.save(clienteAnterior);
        return clienteAnterior.getIdCliente();
    }

    private Cliente buscarCliente(Cliente cliente) {
        return clienteRepository.findById(cliente.getIdCliente())
                .orElseThrow(() -> new ExcepcionNoExisteRegistro("No existe el cliente"));
    }
}
