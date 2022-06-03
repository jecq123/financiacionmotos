package co.com.uco.sistemainventario.converter;

import co.com.uco.sistemainventario.comando.ComandoMoto;
import co.com.uco.sistemainventario.entidad.Moto;
import co.com.uco.sistemainventario.validador.ValidadorArgumento;
import org.springframework.stereotype.Component;

@Component
public class MotoConverter {

    public static final String LA_REFERENCIA_DE_LA_MOTO_ES_OBLIGATORIA = "La referencia de la moto es obligatoria";
    public static final String LA_MARCA_DE_LA_MOTO_ES_OBLIGATORIA = "La marca de la moto es obligatoria";
    public static final String EL_MODELO_DE_LA_MOTO_ES_OBLIGATORIO = "El modelo de la moto es obligatorio";
    public static final String EL_CILINDRAJE_DE_LA_MOTO_ES_OBLIGATORIO = "El cilindraje de la moto es obligatorio";
    public static final String EL_PRECIO_DE_LA_MOTO_ES_OBLIGATORIO = "El precio de la moto es obligatorio";
    public static final String EL_ID_DE_LA_MOTO_ES_OBLIGATORIO = "El id de la moto es obligatorio";
    public static final String EL_ID_DE_LA_MOTO_NO_ES_VALIDO = "El id de la moto no es válido";
    public static final String EL_PRECIO_DE_LA_MOTO_DEBE_SER_POSITIVO = "El precio de la moto debe ser positivo";

    public Moto crear(ComandoMoto comandoMoto) {
        Moto moto = new Moto();
        ValidadorArgumento.validarObligatorio(comandoMoto.getReferencia(), LA_REFERENCIA_DE_LA_MOTO_ES_OBLIGATORIA);
        ValidadorArgumento.validarObligatorio(comandoMoto.getMarca(), LA_MARCA_DE_LA_MOTO_ES_OBLIGATORIA);
        ValidadorArgumento.validarObligatorio(comandoMoto.getModelo(), EL_MODELO_DE_LA_MOTO_ES_OBLIGATORIO);
        ValidadorArgumento.validarObligatorio(comandoMoto.getCilindraje(), EL_CILINDRAJE_DE_LA_MOTO_ES_OBLIGATORIO);
        ValidadorArgumento.validarObligatorio(comandoMoto.getPrecio(), EL_PRECIO_DE_LA_MOTO_ES_OBLIGATORIO);
        ValidadorArgumento.validarPositivo(comandoMoto.getPrecio(), EL_PRECIO_DE_LA_MOTO_DEBE_SER_POSITIVO);
        moto.setReferencia(comandoMoto.getReferencia());
        moto.setMarca(comandoMoto.getMarca());
        moto.setModelo(comandoMoto.getModelo());
        moto.setCilindraje(comandoMoto.getCilindraje());
        moto.setPrecio(comandoMoto.getPrecio());
        return moto;
    }

    public Moto editar(ComandoMoto comandoMoto) {
        Moto moto = new Moto();
        ValidadorArgumento.validarObligatorio(comandoMoto.getIdMoto(), EL_ID_DE_LA_MOTO_ES_OBLIGATORIO);
        ValidadorArgumento.validarObligatorio(comandoMoto.getReferencia(), LA_REFERENCIA_DE_LA_MOTO_ES_OBLIGATORIA);
        ValidadorArgumento.validarObligatorio(comandoMoto.getMarca(), LA_MARCA_DE_LA_MOTO_ES_OBLIGATORIA);
        ValidadorArgumento.validarObligatorio(comandoMoto.getModelo(), EL_MODELO_DE_LA_MOTO_ES_OBLIGATORIO);
        ValidadorArgumento.validarObligatorio(comandoMoto.getCilindraje(), EL_CILINDRAJE_DE_LA_MOTO_ES_OBLIGATORIO);
        ValidadorArgumento.validarObligatorio(comandoMoto.getPrecio(), EL_PRECIO_DE_LA_MOTO_ES_OBLIGATORIO);
        ValidadorArgumento.validarPositivo(comandoMoto.getPrecio(), EL_PRECIO_DE_LA_MOTO_DEBE_SER_POSITIVO);
        moto.setIdMoto(comandoMoto.getIdMoto());
        moto.setReferencia(comandoMoto.getReferencia());
        moto.setMarca(comandoMoto.getMarca());
        moto.setModelo(comandoMoto.getModelo());
        moto.setCilindraje(comandoMoto.getCilindraje());
        moto.setPrecio(comandoMoto.getPrecio());
        return moto;
    }

    public Moto borrar(Integer idMoto) {
        ValidadorArgumento.validarObligatorio(idMoto, EL_ID_DE_LA_MOTO_ES_OBLIGATORIO);
        ValidadorArgumento.validarPositivo(idMoto, EL_ID_DE_LA_MOTO_NO_ES_VALIDO);
        Moto moto = new Moto();
        moto.setIdMoto(idMoto);
        return moto;
    }
}
