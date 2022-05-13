package co.com.uco.sistemainventario.entidad;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
@Getter
@Setter
public class Cliente {
    private Integer idCliente;
    private Persona persona;
    private String correo;
    private String residencia;
}
