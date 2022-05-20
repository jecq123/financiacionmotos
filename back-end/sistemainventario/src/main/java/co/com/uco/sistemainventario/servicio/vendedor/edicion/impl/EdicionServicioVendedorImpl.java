package co.com.uco.sistemainventario.servicio.vendedor.edicion.impl;

import co.com.uco.sistemainventario.entidad.Vendedor;
import co.com.uco.sistemainventario.persistencia.VendedorRepository;
import co.com.uco.sistemainventario.servicio.vendedor.edicion.EdicionServicioVendedor;
import co.com.uco.sistemainventario.validador.excepcion.ExcepcionNoExisteRegistro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EdicionServicioVendedorImpl implements EdicionServicioVendedor {

    @Autowired
    private VendedorRepository vendedorRepository;


    @Override
    public Integer ejecutar(Vendedor vendedor) {
        Vendedor vendedorAnterior = buscarVendedor(vendedor);
        vendedorAnterior.setPersona(vendedor.getPersona());
        vendedorRepository.save(vendedorAnterior);
        return vendedorAnterior.getIdVendedor();
    }

    private Vendedor buscarVendedor(Vendedor vendedor) {
        return vendedorRepository.findById(vendedor.getIdVendedor())
                .orElseThrow(() -> new ExcepcionNoExisteRegistro("No existe el vendedor"));
    }
}
