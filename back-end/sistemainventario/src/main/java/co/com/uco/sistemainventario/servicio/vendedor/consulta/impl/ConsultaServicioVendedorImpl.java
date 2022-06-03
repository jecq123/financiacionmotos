package co.com.uco.sistemainventario.servicio.vendedor.consulta.impl;

import co.com.uco.sistemainventario.entidad.Vendedor;
import co.com.uco.sistemainventario.persistencia.VendedorRepository;
import co.com.uco.sistemainventario.servicio.vendedor.consulta.ConsultaServicioVendedor;
import co.com.uco.sistemainventario.validador.excepcion.ExcepcionNoExisteRegistro;
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

    @Override
    public Vendedor findByIdentificacion(String identificacion) {
        return vendedorRepository.findByIdentificacion(identificacion).orElseThrow(() -> new ExcepcionNoExisteRegistro("No existe el vendedor"));
    }
}
