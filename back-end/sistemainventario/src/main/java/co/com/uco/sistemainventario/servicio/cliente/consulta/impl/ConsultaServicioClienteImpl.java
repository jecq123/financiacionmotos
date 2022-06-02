package co.com.uco.sistemainventario.servicio.cliente.consulta.impl;

import co.com.uco.sistemainventario.entidad.Cliente;
import co.com.uco.sistemainventario.persistencia.ClienteRepository;
import co.com.uco.sistemainventario.servicio.cliente.consulta.ConsultaServicioCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsultaServicioClienteImpl implements ConsultaServicioCliente{

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Iterable<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente findByIdentificacion(String identificacion) {
        return clienteRepository.findByIdentificacion(identificacion);
    }
}
