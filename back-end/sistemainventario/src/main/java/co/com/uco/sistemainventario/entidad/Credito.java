package co.com.uco.sistemainventario.entidad;

import java.time.LocalDateTime;
import java.util.List;

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
