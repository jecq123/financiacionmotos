package co.com.uco.sistemainventario.servicio.credito.consulta.impl;

import co.com.uco.sistemainventario.entidad.Credito;
import co.com.uco.sistemainventario.persistencia.CreditoRepository;
import co.com.uco.sistemainventario.servicio.credito.consulta.ConsultaServicioCredito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsultaServicioCreditoImpl implements ConsultaServicioCredito {

    @Autowired
    private CreditoRepository creditoRepository;

    @Override
    public Iterable<Credito> findAll() {
        return creditoRepository.findAll();
    }
}
