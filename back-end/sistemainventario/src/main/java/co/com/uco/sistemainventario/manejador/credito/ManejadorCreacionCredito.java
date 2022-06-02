package co.com.uco.sistemainventario.manejador.credito;

import co.com.uco.sistemainventario.comando.ComandoCredito;
import co.com.uco.sistemainventario.comando.ComandoProducto;
import co.com.uco.sistemainventario.converter.CreditoConverter;
import co.com.uco.sistemainventario.converter.ProductoConverter;
import co.com.uco.sistemainventario.respuesta.ComandoRespuesta;
import co.com.uco.sistemainventario.respuesta.impl.ManejadorComandoRespuesta;
import co.com.uco.sistemainventario.servicio.credito.creacion.CreacionServicioCredito;
import co.com.uco.sistemainventario.servicio.producto.creacion.CreacionServicioProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ManejadorCreacionCredito implements ManejadorComandoRespuesta<ComandoCredito, ComandoRespuesta<Integer>> {

    @Autowired
    private CreacionServicioCredito creacionServicioCredito;

    @Autowired
    private CreditoConverter creditoConverter;

    @Override
    public ComandoRespuesta<Integer> ejecutar(ComandoCredito comandoCredito) {
        return new ComandoRespuesta<Integer>(creacionServicioCredito.ejecutar(creditoConverter.crear(comandoCredito)));
    }

}