package co.com.uco.sistemainventario.comando;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class ComandoCredito {
    private Integer idCredito;
    private Integer idCliente;
    private Integer idVendedor;
    private Integer idMoto;
    private double valorMoto;
    private double valorCuotaInicial;
    private int numeroCuotas;
    private LocalDateTime fecha;
}
