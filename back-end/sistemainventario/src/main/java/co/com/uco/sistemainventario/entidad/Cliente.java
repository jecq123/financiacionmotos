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

    @OneToOne
    @JoinColumn(name = "idpersona")
    private Persona persona;

    @Column(name = "correo")
    private String correo;

    @Column(name = "residencia")
    private String residencia;
}
