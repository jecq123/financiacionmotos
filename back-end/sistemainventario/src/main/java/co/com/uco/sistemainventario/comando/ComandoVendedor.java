package co.com.uco.sistemainventario.comando;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ComandoVendedor {
    private Integer idVendedor;
    private String identificacion;
    private String nombreCompleto;
    private String contacto;
}
