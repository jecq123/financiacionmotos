package co.com.uco.sistemainventario.comando;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ComandoMoto {
    private Integer idMoto;
    private String referencia;
    private String marca;
    private int modelo;
    private int cilindraje;
    private double precio;
}
