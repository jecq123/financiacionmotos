package co.com.uco.sistemainventario.entidad;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "persona")
@Getter
@Setter
public class Persona {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "idpersona")
    private Integer idPersona;

    @Column(name = "identificacion")
    private String identificacion;

    @Column(name = "nombreCompleto")
    private String nombreCompleto;

    @Column(name = "contacto")
    private String contacto;
}
