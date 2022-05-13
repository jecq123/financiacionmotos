package co.com.uco.sistemainventario.entidad;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "cuota")
@Getter
@Setter
public class Cuota {
    private Integer idCuota;
    private int numero;
    private double valor;
    private LocalDateTime fechaPago;
}
