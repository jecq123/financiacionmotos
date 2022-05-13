package co.com.uco.sistemainventario.entidad;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "credito")
@Getter
@Setter
public class Credito {
    private Integer idCredito;
    private Cliente cliente;
    private Vendedor vendedor;
    private Moto moto;
    private double valorMoto;
    private double valorCuotaInicial;
    private List<Cuota> cuotas;
    private LocalDateTime fecha;
}
