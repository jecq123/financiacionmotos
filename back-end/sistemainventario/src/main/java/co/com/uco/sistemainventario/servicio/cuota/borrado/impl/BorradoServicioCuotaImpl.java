package co.com.uco.sistemainventario.servicio.cuota.borrado.impl;

import co.com.uco.sistemainventario.entidad.Credito;
import co.com.uco.sistemainventario.entidad.Cuota;
import co.com.uco.sistemainventario.persistencia.CuotaRepository;
import co.com.uco.sistemainventario.servicio.cuota.borrado.BorradoServicioCuota;
import co.com.uco.sistemainventario.validador.excepcion.ExcepcionNoExisteRegistro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BorradoServicioCuotaImpl implements BorradoServicioCuota {

    @Autowired
    private CuotaRepository cuotaRepository;

    @Override
    public Integer ejecutar(Cuota cuota) {
        buscarCuota(cuota);
        cuotaRepository.deleteById(cuota.getIdCuota());
        return cuota.getIdCuota();
    }

    private Cuota buscarCuota(Cuota cuota) {
        return cuotaRepository.findById(cuota.getIdCuota())
                .orElseThrow(() -> new ExcepcionNoExisteRegistro("No existe la cuota"));
    }
}
