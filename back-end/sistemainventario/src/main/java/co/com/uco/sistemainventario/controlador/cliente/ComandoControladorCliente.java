package co.com.uco.sistemainventario.controlador.cliente;

import co.com.uco.sistemainventario.comando.ComandoCliente;
import co.com.uco.sistemainventario.comando.ComandoCredito;
import co.com.uco.sistemainventario.manejador.cliente.ManejadorCreacionCliente;
import co.com.uco.sistemainventario.respuesta.ComandoRespuesta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/cliente")
public class ComandoControladorCliente {

    @Autowired
    private ManejadorCreacionCliente manejadorCreacionCliente;

    @PostMapping
    public ComandoRespuesta<Integer> crear(@RequestBody ComandoCliente comandoCliente){
        return manejadorCreacionCliente.ejecutar(comandoCliente);
    }

}
