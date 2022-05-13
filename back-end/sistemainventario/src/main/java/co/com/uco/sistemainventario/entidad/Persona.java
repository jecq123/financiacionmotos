package co.com.uco.sistemainventario.entidad;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "persona")
@Getter
@Setter
public class Persona {
    private Integer idPersona;
    private String identificacion;
    private String nombreCompleto;
    private String contacto;
}
