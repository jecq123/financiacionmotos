package co.com.uco.sistemainventario.servicio.cuota.consulta.impl;

import co.com.uco.sistemainventario.entidad.Cuota;
import co.com.uco.sistemainventario.persistencia.CuotaRepository;
import co.com.uco.sistemainventario.servicio.cuota.consulta.ConsultaServicioCuota;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsultaServicioCuotaImpl implements ConsultaServicioCuota {

    @Autowired
    private CuotaRepository cuotaRepository;

    @Override
    public Iterable<Cuota> findAll() {
        return cuotaRepository.findAll();
    }
}
