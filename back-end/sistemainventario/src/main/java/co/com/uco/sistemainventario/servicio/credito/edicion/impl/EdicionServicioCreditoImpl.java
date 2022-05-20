package co.com.uco.sistemainventario.servicio.credito.edicion.impl;

import co.com.uco.sistemainventario.entidad.Credito;
import co.com.uco.sistemainventario.persistencia.CreditoRepository;
import co.com.uco.sistemainventario.servicio.credito.edicion.EdicionServicioCredito;
import co.com.uco.sistemainventario.validador.excepcion.ExcepcionNoExisteRegistro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EdicionServicioCreditoImpl implements EdicionServicioCredito {

    @Autowired
    private CreditoRepository creditoRepository;

    @Override
    public Integer ejecutar(Credito credito) {
        Credito creditoAnterior=buscarCredito(credito);
        creditoAnterior.setCliente(credito.getCliente());
        creditoAnterior.setNumeroCuotas(credito.getNumeroCuotas());
        creditoAnterior.setFecha(credito.getFecha());
        creditoAnterior.setValorCuotaInicial(credito.getValorCuotaInicial());
        creditoRepository.save(creditoAnterior);
        return credito.getIdCredito();
    }

    private Credito buscarCredito(Credito credito) {
        return creditoRepository.findById(credito.getIdCredito())
                .orElseThrow(() -> new ExcepcionNoExisteRegistro("No existe el credito"));
    }
}
