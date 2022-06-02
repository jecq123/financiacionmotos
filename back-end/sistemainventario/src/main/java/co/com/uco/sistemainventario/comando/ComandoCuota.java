package co.com.uco.sistemainventario.comando;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ComandoCuota {
    private Integer idCuota;
    private Integer idCredito;
    private int numero;
    private double valor;
    private LocalDateTime fechaPago;
}
