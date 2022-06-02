package co.com.uco.sistemainventario.converter;


import co.com.uco.sistemainventario.comando.ComandoCredito;
import co.com.uco.sistemainventario.entidad.Credito;
import co.com.uco.sistemainventario.validador.ValidadorArgumento;
import org.springframework.stereotype.Component;

@Component
public class CreditoConverter {

    public static final String EL_ID_DEL_CLIENTE_ES_OBLIGATORIO = "El id del cliente es obligatorio";
    public static final String EL_ID_DEL_VENDEDOR_ES_OBLIGATORIO = "El id del vendedor es obligatorio";
    public static final String EL_ID_DE_LA_MOTO_ES_OBLIGATORIO = "El id de la moto es obligatorio";

    public static final String EL_VALOR_DE_LA_MOTO_ES_OBLIGATORIO = "El valor de la moto es obligatorio";
    public static final String EL_VALOR_DE_LA_CUOTA_INICIAL_ES_OBLIGATORIO = "El valor de la cuota inicial es obligatorio";
    public static final String SE_REQUIERE_EL_NUMERO_DE_CUOTAS = "Se requiere el número de cuotas";
    public static final String LA_FECHA_DEL_CREDITO_ES_OBLIGATORIA = "La fecha del crédito es obligatoria";
    public static final String EL_ID_DEL_CREDITO_ES_OBLIGATORIO = "El id del crédito es obligatorio";
    public static final String EL_ID_DEL_CREDITO_ES_INVALIDO = "El id del crédito es inválido";

    public Credito crear(ComandoCredito comandoCredito) {
        Credito credito = new Credito();
        ValidadorArgumento.validarObligatorio(comandoCredito.getIdCliente(), EL_ID_DEL_CLIENTE_ES_OBLIGATORIO);
        ValidadorArgumento.validarObligatorio(comandoCredito.getIdVendedor(), EL_ID_DEL_VENDEDOR_ES_OBLIGATORIO);
        ValidadorArgumento.validarObligatorio(comandoCredito.getIdMoto(), EL_ID_DE_LA_MOTO_ES_OBLIGATORIO);
        ValidadorArgumento.validarObligatorio(comandoCredito.getValorMoto(), EL_VALOR_DE_LA_MOTO_ES_OBLIGATORIO);
        ValidadorArgumento.validarObligatorio(comandoCredito.getValorCuotaInicial(), EL_VALOR_DE_LA_CUOTA_INICIAL_ES_OBLIGATORIO);
        ValidadorArgumento.validarObligatorio(comandoCredito.getNumeroCuotas(), SE_REQUIERE_EL_NUMERO_DE_CUOTAS);
        ValidadorArgumento.validarObligatorio(comandoCredito.getFecha(), LA_FECHA_DEL_CREDITO_ES_OBLIGATORIA);
        credito.getCliente().setIdCliente(comandoCredito.getIdCliente());
        credito.getVendedor().setIdVendedor(comandoCredito.getIdVendedor());
        credito.getMoto().setIdMoto(comandoCredito.getIdMoto());
        credito.setValorMoto(comandoCredito.getValorMoto());
        credito.setValorCuotaInicial(comandoCredito.getValorCuotaInicial());
        credito.setNumeroCuotas(comandoCredito.getNumeroCuotas());
        credito.setValorCuota(comandoCredito.getValorCuota());
        credito.setFecha(comandoCredito.getFecha());
        return credito;
    }

    public Credito editar(ComandoCredito comandoCredito) {
        Credito credito = new Credito();
        ValidadorArgumento.validarObligatorio(comandoCredito.getIdCredito(), EL_ID_DEL_CREDITO_ES_OBLIGATORIO);
        ValidadorArgumento.validarObligatorio(comandoCredito.getIdCliente(), EL_ID_DEL_CLIENTE_ES_OBLIGATORIO);
        ValidadorArgumento.validarObligatorio(comandoCredito.getIdVendedor(), EL_ID_DEL_VENDEDOR_ES_OBLIGATORIO);
        ValidadorArgumento.validarObligatorio(comandoCredito.getIdMoto(), EL_ID_DE_LA_MOTO_ES_OBLIGATORIO);
        ValidadorArgumento.validarObligatorio(comandoCredito.getValorMoto(), EL_VALOR_DE_LA_MOTO_ES_OBLIGATORIO);
        ValidadorArgumento.validarObligatorio(comandoCredito.getValorCuotaInicial(), EL_VALOR_DE_LA_CUOTA_INICIAL_ES_OBLIGATORIO);
        ValidadorArgumento.validarObligatorio(comandoCredito.getNumeroCuotas(), SE_REQUIERE_EL_NUMERO_DE_CUOTAS);
        ValidadorArgumento.validarObligatorio(comandoCredito.getFecha(), LA_FECHA_DEL_CREDITO_ES_OBLIGATORIA);
        credito.setIdCredito(comandoCredito.getIdCredito());
        credito.getCliente().setIdCliente(comandoCredito.getIdCliente());
        credito.getVendedor().setIdVendedor(comandoCredito.getIdVendedor());
        credito.getMoto().setIdMoto(comandoCredito.getIdMoto());
        credito.setValorMoto(comandoCredito.getValorMoto());
        credito.setValorCuotaInicial(comandoCredito.getValorCuotaInicial());
        credito.setNumeroCuotas(comandoCredito.getNumeroCuotas());
        credito.setFecha(comandoCredito.getFecha());
        return credito;
    }

    public Credito borrar(Integer idCredito) {
        ValidadorArgumento.validarObligatorio(idCredito, EL_ID_DEL_CREDITO_ES_OBLIGATORIO);
        ValidadorArgumento.validarPositivo(idCredito, EL_ID_DEL_CREDITO_ES_INVALIDO);
        Credito credito = new Credito();
        credito.setIdCredito(idCredito);
        return credito;
    }
}
