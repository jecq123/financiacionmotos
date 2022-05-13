package co.com.uco.sistemainventario.servicio.cuota.edicion.impl;

import co.com.uco.sistemainventario.entidad.Cuota;
import co.com.uco.sistemainventario.persistencia.CuotaRepository;
import co.com.uco.sistemainventario.servicio.cuota.edicion.EdicionServicioCuota;
import co.com.uco.sistemainventario.validador.excepcion.ExcepcionNoExisteRegistro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EdicionServicioCuotaImpl implements EdicionServicioCuota {

    @Autowired
    private CuotaRepository cuotaRepository;


    @Override
    public Integer ejecutar(Cuota cuota) {
        Cuota cuotaAnterior=buscarCuota(cuota);
        cuotaAnterior.setFechaPago(cuota.getFechaPago());
        cuotaAnterior.setNumero(cuota.getNumero());
        cuotaAnterior.setValor(cuota.getValor());
        cuotaRepository.save(cuotaAnterior);
        return cuotaAnterior.getIdCuota();
    }

    private Cuota buscarCuota(Cuota cuota) {
        return cuotaRepository.findById(cuota.getIdCuota())
                .orElseThrow(() -> new ExcepcionNoExisteRegistro("No existe la cuota"));
    }
}
