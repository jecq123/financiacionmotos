package co.com.uco.sistemainventario.servicio.moto.creacion.impl;

import co.com.uco.sistemainventario.entidad.Moto;
import co.com.uco.sistemainventario.persistencia.MotoRepository;
import co.com.uco.sistemainventario.servicio.moto.creacion.CreacionServicioMoto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreacionServicioMotoImpl implements CreacionServicioMoto {

    @Autowired
    private MotoRepository motoRepository;

    @Override
    public Integer ejecutar(Moto moto) {
        motoRepository.save(moto);
        return moto.getIdMoto();
    }
}
