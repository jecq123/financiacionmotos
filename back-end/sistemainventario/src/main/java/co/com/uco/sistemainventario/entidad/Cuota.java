package co.com.uco.sistemainventario.entidad;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "cuota")
@Getter
@Setter
public class Cuota {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "idcuota")
    private Integer idCuota;

    @Column(name = "idcredito")
    private Integer idCredito;

    @Column(name = "numero")
    private int numero;

    @Column(name = "valor")
    private double valor;

    @Column(name = "fechaPago")
    private LocalDateTime fechaPago;
}
