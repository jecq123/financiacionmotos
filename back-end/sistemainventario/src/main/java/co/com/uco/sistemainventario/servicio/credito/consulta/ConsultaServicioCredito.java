package co.com.uco.sistemainventario.servicio.credito.consulta;

import co.com.uco.sistemainventario.comando.ComandoCredito;
import co.com.uco.sistemainventario.entidad.Credito;

public interface ConsultaServicioCredito {
    Iterable<Credito> findAll();

    double consultarValorCuota(ComandoCredito comandoCredito);
}
