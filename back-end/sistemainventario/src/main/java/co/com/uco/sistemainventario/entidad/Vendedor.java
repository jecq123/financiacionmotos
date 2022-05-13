package co.com.uco.sistemainventario.entidad;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "vendedor")
@Getter
@Setter
public class Vendedor {
    private Integer idVendedor;
    private Persona persona;
}
