package co.com.uco.sistemainventario.consulta.vendedor;

import co.com.uco.sistemainventario.entidad.Cliente;
import co.com.uco.sistemainventario.entidad.Vendedor;
import co.com.uco.sistemainventario.servicio.producto.consulta.ConsultaServicioProducto;
import co.com.uco.sistemainventario.servicio.vendedor.consulta.ConsultaServicioVendedor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/vendedor")
public class ControladorConsultaVendedor {

    @Autowired
    private ConsultaServicioVendedor consultaServicioVendedor;

    @GetMapping("/{identificacion}")
    Vendedor findByIdentificacion(@PathVariable String identificacion){
        return consultaServicioVendedor.findByIdentificacion(identificacion);
    }

}
