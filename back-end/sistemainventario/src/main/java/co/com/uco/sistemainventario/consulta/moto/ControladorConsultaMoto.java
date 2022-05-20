package co.com.uco.sistemainventario.consulta.moto;

import co.com.uco.sistemainventario.entidad.Moto;
import co.com.uco.sistemainventario.servicio.inventario.consulta.ConsultaServicioInventario;
import co.com.uco.sistemainventario.servicio.moto.consulta.ConsultaServicioMoto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/moto")
public class ControladorConsultaMoto {

    @Autowired
    private ConsultaServicioMoto consultaServicioMoto;

    @GetMapping
    Iterable<Moto> findAll() {
        return consultaServicioMoto.findAll();
    }

}