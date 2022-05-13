package co.com.uco.sistemainventario.servicio.moto.edicion.impl;

import co.com.uco.sistemainventario.entidad.Moto;
import co.com.uco.sistemainventario.persistencia.MotoRepository;
import co.com.uco.sistemainventario.servicio.moto.edicion.EdicionServicioMoto;
import co.com.uco.sistemainventario.validador.excepcion.ExcepcionNoExisteRegistro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EdicionServicioMotoImpl implements EdicionServicioMoto {


    @Autowired
    private MotoRepository motoRepository;

    @Override
    public Integer ejecutar(Moto moto) {
        Moto motoAnterior= buscarMoto(moto);
        motoAnterior.setCilindraje(moto.getCilindraje());
        motoAnterior.setMarca(moto.getMarca());
        motoAnterior.setModelo(moto.getModelo());
        motoAnterior.setPrecio(moto.getPrecio());
        motoAnterior.setReferencia(moto.getReferencia());
        motoRepository.save(motoAnterior);
        return motoAnterior.getIdMoto();
    }

    private Moto buscarMoto(Moto moto) {
        return motoRepository.findById(moto.getIdMoto())
                .orElseThrow(() -> new ExcepcionNoExisteRegistro("No existe la moto"));
    }
}
