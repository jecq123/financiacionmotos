package co.com.uco.sistemainventario.converter;

import co.com.uco.sistemainventario.comando.ComandoCuota;
import co.com.uco.sistemainventario.entidad.Cuota;
import co.com.uco.sistemainventario.validador.ValidadorArgumento;
import org.springframework.stereotype.Component;

@Component
public class CuotaConverter {

    public static final String EL_NUMERO_DE_LA_CUOTA_ES_OBLIGATORIO = "El número de la cuota es obligatorio";
    public static final String EL_VALOR_DE_LA_CUOTA_ES_OBLIGATORIO = "El valor de la cuota es obligatorio";
    public static final String LA_FECHA_ES_REQUERIDA = "La fecha es requerida";
    public static final String EL_ID_DE_LA_CUOTA_NO_ES_VALIDO = "El id de la cuota no es válido";

    public Cuota crear(ComandoCuota comandoCuota) {
        Cuota cuota = new Cuota();
        ValidadorArgumento.validarObligatorio(comandoCuota.getNumero(), EL_NUMERO_DE_LA_CUOTA_ES_OBLIGATORIO);
        ValidadorArgumento.validarObligatorio(comandoCuota.getValor(), EL_VALOR_DE_LA_CUOTA_ES_OBLIGATORIO);
        ValidadorArgumento.validarObligatorio(comandoCuota.getFechaPago(), LA_FECHA_ES_REQUERIDA);
        cuota.setNumero(comandoCuota.getNumero);
        cuota.setValor(comandoCuota.getValor);
        cuota.setFechaPago(comandoCuota.getFechaPago);
        return cuota;
    }

    public Cuota editar(ComandoCuota comandoCuota) {
        Cuota cuota = new Cuota();
        ValidadorArgumento.validarObligatorio(comandoCuota.getIdCuota(), EL_ID_DE_LA_CUOTA_NO_ES_VALIDO);
        ValidadorArgumento.validarObligatorio(comandoCuota.getNumero(), EL_NUMERO_DE_LA_CUOTA_ES_OBLIGATORIO);
        ValidadorArgumento.validarObligatorio(comandoCuota.getValor(), EL_VALOR_DE_LA_CUOTA_ES_OBLIGATORIO);
        ValidadorArgumento.validarObligatorio(comandoCuota.getFechaPago(), LA_FECHA_ES_REQUERIDA);
        cuota.setIdCuota(comandoCuota.getIdCuota);
        cuota.setNumero(comandoCuota.getNumero);
        cuota.setValor(comandoCuota.getValor);
        cuota.setFechaPago(comandoCuota.getFechaPago);
        return cuota;
    }

    public Cuota borrar(Integer idCuota) {
        ValidadorArgumento.validarObligatorio(idCuota, EL_ID_DE_LA_CUOTA_NO_ES_VALIDO);
        ValidadorArgumento.validarPositivo(idCuota, EL_ID_DE_LA_CUOTA_NO_ES_VALIDO);
        Cuota cuota = new Cuota();
        cuota.setIdCuota(idCuota);
        return cuota;
    }
}
