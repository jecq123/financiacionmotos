package co.com.uco.sistemainventario.manejador.cliente;

import co.com.uco.sistemainventario.comando.ComandoCliente;
import co.com.uco.sistemainventario.comando.ComandoCredito;
import co.com.uco.sistemainventario.converter.ClienteConverter;
import co.com.uco.sistemainventario.converter.CreditoConverter;
import co.com.uco.sistemainventario.respuesta.ComandoRespuesta;
import co.com.uco.sistemainventario.respuesta.impl.ManejadorComandoRespuesta;
import co.com.uco.sistemainventario.servicio.cliente.creacion.CreacionServicioCliente;
import co.com.uco.sistemainventario.servicio.credito.creacion.CreacionServicioCredito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ManejadorCreacionCliente implements ManejadorComandoRespuesta<ComandoCliente, ComandoRespuesta<Integer>> {


    @Autowired
    private CreacionServicioCliente creacionServicioCliente;

    @Autowired
    private ClienteConverter clienteConverter;

    @Override
    public ComandoRespuesta<Integer> ejecutar(ComandoCliente comando) {
        return new ComandoRespuesta<Integer>(creacionServicioCliente.ejecutar(clienteConverter.crear(comando)));
    }
}