package co.com.uco.sistemainventario.servicio.moto.consulta.impl;

import co.com.uco.sistemainventario.entidad.Moto;
import co.com.uco.sistemainventario.persistencia.MotoRepository;
import co.com.uco.sistemainventario.servicio.moto.consulta.ConsultaServicioMoto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsultaServicioMotoImpl implements ConsultaServicioMoto {
    @Autowired
    private MotoRepository motoRepository;

    @Override
    public Iterable<Moto> findAll() {
        return motoRepository.findAll();
    }
}
