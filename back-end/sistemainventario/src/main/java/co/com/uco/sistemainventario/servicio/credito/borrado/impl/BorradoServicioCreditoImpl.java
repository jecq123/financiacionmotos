package co.com.uco.sistemainventario.servicio.credito.borrado.impl;

import co.com.uco.sistemainventario.entidad.Cliente;
import co.com.uco.sistemainventario.entidad.Credito;
import co.com.uco.sistemainventario.persistencia.CreditoRepository;
import co.com.uco.sistemainventario.servicio.credito.borrado.BorradoServicioCredito;
import co.com.uco.sistemainventario.validador.excepcion.ExcepcionNoExisteRegistro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BorradoServicioCreditoImpl implements BorradoServicioCredito {

    @Autowired
    private CreditoRepository creditoRepository;

    @Override
    public Integer ejecutar(Credito credito) {
        buscarCredito(credito);
        creditoRepository.deleteById(credito.getIdCredito());
        return credito.getIdCredito();
    }

    private Credito buscarCredito(Credito credito) {
        return creditoRepository.findById(credito.getIdCredito())
                .orElseThrow(() -> new ExcepcionNoExisteRegistro("No existe el credito"));
    }
}
