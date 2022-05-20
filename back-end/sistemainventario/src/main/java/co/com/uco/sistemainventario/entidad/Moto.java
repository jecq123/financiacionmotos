package co.com.uco.sistemainventario.entidad;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "moto")
@Getter
@Setter
public class Moto {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "idmoto")
    private Integer idMoto;

    @Column(name = "referencia")
    private String referencia;

    @Column(name = "marca")
    private String marca;

    @Column(name = "modelo")
    private int modelo;

    @Column(name = "cilindraje")
    private int cilindraje;

    @Column(name = "precio")
    private double precio;
}
