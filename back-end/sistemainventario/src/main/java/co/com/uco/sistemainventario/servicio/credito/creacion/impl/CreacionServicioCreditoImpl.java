package co.com.uco.sistemainventario.servicio.credito.creacion.impl;

import co.com.uco.sistemainventario.entidad.Credito;
import co.com.uco.sistemainventario.persistencia.CreditoRepository;
import co.com.uco.sistemainventario.servicio.credito.creacion.CreacionServicioCredito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreacionServicioCreditoImpl implements CreacionServicioCredito {

    @Autowired
    private CreditoRepository creditoRepository;

    @Override
    public Integer ejecutar(Credito credito) {
        creditoRepository.save(credito);
        return credito.getIdCredito();
    }
}
