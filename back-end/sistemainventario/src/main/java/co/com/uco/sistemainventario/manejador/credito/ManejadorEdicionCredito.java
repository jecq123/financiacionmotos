package co.com.uco.sistemainventario.manejador.credito;

import co.com.uco.sistemainventario.comando.ComandoCredito;
import co.com.uco.sistemainventario.comando.ComandoProducto;
import co.com.uco.sistemainventario.converter.CreditoConverter;
import co.com.uco.sistemainventario.converter.ProductoConverter;
import co.com.uco.sistemainventario.respuesta.ComandoRespuesta;
import co.com.uco.sistemainventario.respuesta.impl.ManejadorComandoRespuesta;
import co.com.uco.sistemainventario.servicio.credito.edicion.EdicionServicioCredito;
import co.com.uco.sistemainventario.servicio.producto.edicion.EdicionServicioProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ManejadorEdicionCredito implements ManejadorComandoRespuesta<ComandoCredito, ComandoRespuesta<Integer>> {

    @Autowired
    private EdicionServicioCredito edicionServicioCredito;

    @Autowired
    private CreditoConverter creditoConverter;

    @Override
    public ComandoRespuesta<Integer> ejecutar(ComandoCredito comandoCredito) {
        return new ComandoRespuesta<Integer>(edicionServicioCredito.ejecutar(creditoConverter.editar(comandoCredito)));
    }

}

