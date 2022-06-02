package co.com.uco.sistemainventario.comando;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ComandoCliente {
    private Integer idCliente;
    private String identificacion;
    private String nombreCompleto;
    private String contacto;
    private String correo;
    private String residencia;
}
