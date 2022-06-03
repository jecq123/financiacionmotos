package co.com.uco.sistemainventario.consulta.credito;

import co.com.uco.sistemainventario.comando.ComandoCredito;
import co.com.uco.sistemainventario.servicio.credito.consulta.ConsultaServicioCredito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/credito")
public class ControladorConsultaCredito {

    @Autowired
    private ConsultaServicioCredito consultaServicioCredito;

    @PostMapping
    double consultarValorCuota(@RequestBody ComandoCredito comandoCredito) {
        return consultaServicioCredito.consultarValorCuota(comandoCredito);
    }
}
