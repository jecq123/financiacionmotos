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

    @Column(name = "valormoto")
    private double valorMoto;

    @Column(name = "valorCuotaInicial")
    private double valorCuotaInicial;

    @Column(name = "numerocuotas")
    private int numeroCuotas;

    @Column(name = "valorcuota")
    private double valorCuota;

    @Column(name = "fecha")
    private LocalDateTime fecha;

    @OneToMany
    @JoinColumn(name = "idcredito")
    private List<Cuota> listaCuotas;

    public Cliente getCliente() {
        return cliente == null ? new Cliente() : cliente;
    }

    public Vendedor getVendedor() {
        return vendedor == null ? new Vendedor() : vendedor;
    }

    public Moto getMoto() {
        return moto == null ? new Moto() : moto;
    }
}
