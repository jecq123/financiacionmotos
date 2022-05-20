package co.com.uco.sistemainventario.controlador.credito;

import co.com.uco.sistemainventario.comando.ComandoCredito;
import co.com.uco.sistemainventario.comando.ComandoProducto;
import co.com.uco.sistemainventario.manejador.credito.ManejadorCreacionCredito;
import co.com.uco.sistemainventario.manejador.credito.ManejadorEdicionCredito;
import co.com.uco.sistemainventario.manejador.producto.ManejadorBorradoProducto;
import co.com.uco.sistemainventario.manejador.producto.ManejadorCreacionProducto;
import co.com.uco.sistemainventario.manejador.producto.ManejadorEdicionProducto;
import co.com.uco.sistemainventario.respuesta.ComandoRespuesta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/credito")
public class ComandoControladorCredito {
    @Autowired
    private ManejadorCreacionCredito manejadorCreacionCredito;

    @Autowired
    private ManejadorEdicionCredito manejadorEdicionCredito;


    @PostMapping
    public ComandoRespuesta<Integer> crear(@RequestBody ComandoCredito comandoCredito){
        return manejadorCreacionCredito.ejecutar(comandoCredito);
    }

    @PutMapping("/{idCredito}")
    public ComandoRespuesta<Integer> actualizar(@PathVariable Integer idCredito, @RequestBody ComandoCredito comandoCredito) {
        comandoCredito.setIdCredito(idCredito);
        return manejadorEdicionCredito.ejecutar(comandoCredito);
    }
}
