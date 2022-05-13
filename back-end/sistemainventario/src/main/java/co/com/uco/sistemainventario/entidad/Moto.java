package co.com.uco.sistemainventario.entidad;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "moto")
@Getter
@Setter
public class Moto {
    private Integer idMoto;
    private String referencia;
    private String marca;
    private int modelo;
    private int cilindraje;
    private double precio;
}
