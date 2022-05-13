package co.com.uco.sistemainventario.comando;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ComandoPersona {
    private Integer idPersona;
    private String identificacion;
    private String nombreCompleto;
    private String contacto;
}
