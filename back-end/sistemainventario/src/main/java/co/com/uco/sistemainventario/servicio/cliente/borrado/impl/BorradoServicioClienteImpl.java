package co.com.uco.sistemainventario.servicio.cliente.borrado.impl;

import co.com.uco.sistemainventario.entidad.Cliente;
import co.com.uco.sistemainventario.entidad.Producto;
import co.com.uco.sistemainventario.persistencia.ClienteRepository;
import co.com.uco.sistemainventario.servicio.cliente.borrado.BorradoServicioCliente;
import co.com.uco.sistemainventario.validador.excepcion.ExcepcionNoExisteRegistro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BorradoServicioClienteImpl implements BorradoServicioCliente {
    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Integer ejecutar(Cliente cliente) {
        buscarCliente(cliente);
        clienteRepository.deleteById(cliente.getIdCliente());
        return cliente.getIdCliente();
    }
    private Cliente buscarCliente(Cliente cliente) {
        return clienteRepository.findById(cliente.getIdCliente())
                .orElseThrow(() -> new ExcepcionNoExisteRegistro("No existe el cliente"));
    }

}
