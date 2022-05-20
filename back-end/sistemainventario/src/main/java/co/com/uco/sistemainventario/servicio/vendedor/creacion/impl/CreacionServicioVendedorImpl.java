package co.com.uco.sistemainventario.servicio.vendedor.creacion.impl;

import co.com.uco.sistemainventario.entidad.Vendedor;
import co.com.uco.sistemainventario.persistencia.VendedorRepository;
import co.com.uco.sistemainventario.servicio.vendedor.creacion.CreacionServicioVendedor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreacionServicioVendedorImpl implements CreacionServicioVendedor {

    @Autowired
    private VendedorRepository vendedorRepository;

    @Override
    public Integer ejecutar(Vendedor vendedor) {
        vendedorRepository.save(vendedor);
        return vendedor.getIdVendedor();
    }
}
