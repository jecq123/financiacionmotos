package co.com.uco.sistemainventario.entidad;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "cliente")
@Getter
@Setter
public class Cliente {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "idcliente")
    private Integer idCliente;

    @Column(name = "identificacion")
    private String identificacion;

    @Column(name = "nombreCompleto")
    private String nombreCompleto;

    @Column(name = "contacto")
    private String contacto;

    @Column(name = "correo")
    private String correo;

    @Column(name = "residencia")
    private String residencia;
}
