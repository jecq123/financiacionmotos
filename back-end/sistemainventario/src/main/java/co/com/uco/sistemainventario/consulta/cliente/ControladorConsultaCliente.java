package co.com.uco.sistemainventario.consulta.cliente;

import co.com.uco.sistemainventario.entidad.Cliente;
import co.com.uco.sistemainventario.servicio.cliente.consulta.ConsultaServicioCliente;
import co.com.uco.sistemainventario.servicio.moto.consulta.ConsultaServicioMoto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/cliente")
public class ControladorConsultaCliente{

    @Autowired
    private ConsultaServicioCliente consultaServicioCliente;

    @GetMapping
    Iterable<Cliente> findAll() {
        return consultaServicioCliente.findAll();
    }

}