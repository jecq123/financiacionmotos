package co.com.uco.sistemainventario.servicio.cuota.creacion.impl;

import co.com.uco.sistemainventario.entidad.Cuota;
import co.com.uco.sistemainventario.persistencia.CuotaRepository;
import co.com.uco.sistemainventario.servicio.cuota.creacion.CreacionServicioCuota;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreacionServicioCuotaImpl implements CreacionServicioCuota {

    @Autowired
    private CuotaRepository cuotaRepository;

    @Override
    public Integer ejecutar(Cuota cuota) {
        cuotaRepository.save(cuota);
        return cuota.getIdCuota();
    }
}
