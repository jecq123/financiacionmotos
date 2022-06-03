package co.com.uco.sistemainventario.entidad;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "vendedor")
@Getter
@Setter
public class Vendedor {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "idvendedor")
    private Integer idVendedor;

    @Column(name = "identificacion")
    private String identificacion;

    @Column(name = "nombrecompleto")
    private String nombreCompleto;

    @Column(name = "contacto")
    private String contacto;
}
