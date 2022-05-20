package co.com.uco.sistemainventario.entidad;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "credito")
@Getter
@Setter
public class Credito {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "idcredito")
    private Integer idCredito;

    @ManyToOne
    @JoinColumn(name = "idcliente")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "idvendedor")
    private Vendedor vendedor;

    @ManyToOne
    @JoinColumn(name = "idmoto")
    private Moto moto;

    @Column(name = "valorMoto")
    private double valorMoto;

    @Column(name = "valorCuotaInicial")
    private double valorCuotaInicial;

    @OneToMany
    @JoinColumn(name = "idcuota")
    private List<Cuota> cuotas;

    @Column(name = "fecha")
    private LocalDateTime fecha;
}
