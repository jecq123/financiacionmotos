package co.com.uco.sistemainventario.servicio.vendedor.consulta.impl;

import co.com.uco.sistemainventario.entidad.Vendedor;
import co.com.uco.sistemainventario.persistencia.VendedorRepository;
import co.com.uco.sistemainventario.servicio.vendedor.consulta.ConsultaServicioVendedor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsultaServicioVendedorImpl implements ConsultaServicioVendedor {

    @Autowired
    private VendedorRepository vendedorRepository;

    @Override
    public Iterable<Vendedor> findAll() {
        return vendedorRepository.findAll();
    }
}
