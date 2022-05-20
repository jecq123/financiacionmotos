package co.com.uco.sistemainventario.converter;

import co.com.uco.sistemainventario.comando.ComandoVendedor;
import co.com.uco.sistemainventario.entidad.Vendedor;
import co.com.uco.sistemainventario.validador.ValidadorArgumento;
import org.springframework.stereotype.Component;

@Component
public class VendedorConverter {

    public static final String EL_ID_DE_UNA_PERSONA_ES_OBLIGATORIO = "El id de una persona es obligatorio";
    public static final String EL_ID_DEL_VENDEDOR_ES_OBLIGATORIO = "El id del vendedor es obligatorio";
    public static final String EL_ID_DEL_VENDEDOR_NO_ES_VALIDO = "El id del vendedor no es válido";

    public Vendedor crear(ComandoVendedor comandoVendedor) {
        Vendedor vendedor = new Vendedor();
        ValidadorArgumento.validarObligatorio(comandoVendedor.getIdPersona(), EL_ID_DE_UNA_PERSONA_ES_OBLIGATORIO);
        vendedor.getPersona().setIdPersona(comandoVendedor.getIdPersona());
        return vendedor;
    }

    public Vendedor editar(ComandoVendedor comandoVendedor) {
        Vendedor vendedor = new Vendedor();
        ValidadorArgumento.validarObligatorio(comandoVendedor.getIdVendedor(), EL_ID_DEL_VENDEDOR_ES_OBLIGATORIO);
        ValidadorArgumento.validarObligatorio(comandoVendedor.getIdPersona(), EL_ID_DE_UNA_PERSONA_ES_OBLIGATORIO);
        vendedor.getPersona().setIdPersona(comandoVendedor.getIdPersona());
        vendedor.setIdVendedor(comandoVendedor.getIdVendedor());
        return vendedor;
    }

    public Vendedor borrar(Integer idVendedor) {
        ValidadorArgumento.validarObligatorio(idVendedor, EL_ID_DEL_VENDEDOR_ES_OBLIGATORIO);
        ValidadorArgumento.validarPositivo((idVendedor, EL_ID_DEL_VENDEDOR_NO_ES_VALIDO);
        Vendedor vendedor = new Vendedor();
        vendedor.setIdVendedor(idVendedor);
        return vendedor;
    }
}
