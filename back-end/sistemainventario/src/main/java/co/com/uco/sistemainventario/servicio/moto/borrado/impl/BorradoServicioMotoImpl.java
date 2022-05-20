package co.com.uco.sistemainventario.servicio.moto.borrado.impl;

import co.com.uco.sistemainventario.entidad.Cuota;
import co.com.uco.sistemainventario.entidad.Moto;
import co.com.uco.sistemainventario.persistencia.MotoRepository;
import co.com.uco.sistemainventario.servicio.moto.borrado.BorradoServicioMoto;
import co.com.uco.sistemainventario.validador.excepcion.ExcepcionNoExisteRegistro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BorradoServicioMotoImpl implements BorradoServicioMoto {

    @Autowired
    private MotoRepository motoRepository;

    @Override
    public Integer ejecutar(Moto moto) {
        buscarMoto(moto);
        motoRepository.deleteById(moto.getIdMoto());
        return moto.getIdMoto();
    }

    private Moto buscarMoto(Moto moto) {
        return motoRepository.findById(moto.getIdMoto())
                .orElseThrow(() -> new ExcepcionNoExisteRegistro("No existe la moto"));
    }
}
