package co.com.uco.sistemainventario.consulta.credito;

import co.com.uco.sistemainventario.comando.ComandoCredito;
import co.com.uco.sistemainventario.entidad.Credito;
import co.com.uco.sistemainventario.servicio.credito.consulta.ConsultaServicioCredito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/credito")
public class ControladorConsultaCredito {

    @Autowired
    private ConsultaServicioCredito consultaServicioCredito;

    @Secured({"ROLE_ADMIN"})
    @PostMapping("/cuota")
    double consultarValorCuota(@RequestBody ComandoCredito comandoCredito) {
        return consultaServicioCredito.consultarValorCuota(comandoCredito);
    }

    @GetMapping
    Iterable<Credito> consultarTodos() {
        return consultaServicioCredito.findAll();
    }
}
