package co.com.uco.sistemainventario.comando;

import java.time.LocalDateTime;
import java.util.List;

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
