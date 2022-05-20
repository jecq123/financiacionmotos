package co.com.uco.sistemainventario.servicio.vendedor.borrado.impl;

import co.com.uco.sistemainventario.entidad.Cuota;
import co.com.uco.sistemainventario.entidad.Vendedor;
import co.com.uco.sistemainventario.persistencia.VendedorRepository;
import co.com.uco.sistemainventario.servicio.vendedor.borrado.BorradoServicioVendedor;
import co.com.uco.sistemainventario.validador.excepcion.ExcepcionNoExisteRegistro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BorradoServicioVendedorImpl implements BorradoServicioVendedor {

    @Autowired
    private VendedorRepository vendedorRepository;

    @Override
    public Integer ejecutar(Vendedor vendedor) {
        buscarVendedor(vendedor);
        vendedorRepository.deleteById(vendedor.getIdVendedor());
        return vendedor.getIdVendedor();
    }
    private Vendedor buscarVendedor(Vendedor vendedor) {
        return vendedorRepository.findById(vendedor.getIdVendedor())
                .orElseThrow(() -> new ExcepcionNoExisteRegistro("No existe el vendedor"));
    }
}
