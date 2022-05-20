package co.com.uco.sistemainventario.converter;


import co.com.uco.sistemainventario.comando.ComandoPersona;
import co.com.uco.sistemainventario.entidad.Persona;
import co.com.uco.sistemainventario.validador.ValidadorArgumento;
import org.springframework.stereotype.Component;

@Component
public class PersonaConverter {

    public static final String LA_IDENTIFICACION_NO_ES_VALIDA = "La identificación no es válida";
    public static final String EL_NOMBRE_COMPLETO_ES_OBLIGATORIO = "El nombre completo es obligatorio";
    public static final String EL_CONTACTO_ES_OBLIGATORIO = "El contacto es obligatorio";
    public static final String EL_ID_DE_LA_PERSONA_NO_ES_VALIDO = "El id de la persona no es válido";
    public static final String EL_ID_DE_LA_PERSONA_ES_OBLIGATORIO = "El id de la persona es obligatorio";

    public Persona crear(ComandoPersona comandoPersona) {
        Persona persona = new Persona();
        ValidadorArgumento.validarObligatorio(comandoPersona.getIdentificacion(), LA_IDENTIFICACION_NO_ES_VALIDA);
        ValidadorArgumento.validarObligatorio(comandoPersona.getNombreCompleto(), EL_NOMBRE_COMPLETO_ES_OBLIGATORIO);
        ValidadorArgumento.validarObligatorio(comandoPersona.getContacto(), EL_CONTACTO_ES_OBLIGATORIO);
        persona.setIdentificacion(comandoPersona.getIdentificacion());
        persona.setNombreCompleto(comandoPersona.getNombreCompleto());
        persona.setContacto(comandoPersona.getContacto());
        return persona;
    }

    public Persona editar(ComandoPersona comandoPersona) {
        Persona persona = new Persona();
        ValidadorArgumento.validarObligatorio(comandoPersona.getIdPersona(), EL_ID_DE_LA_PERSONA_NO_ES_VALIDO);
        ValidadorArgumento.validarObligatorio(comandoPersona.getIdentificacion(), LA_IDENTIFICACION_NO_ES_VALIDA);
        ValidadorArgumento.validarObligatorio(comandoPersona.getNombreCompleto(), EL_NOMBRE_COMPLETO_ES_OBLIGATORIO);
        ValidadorArgumento.validarObligatorio(comandoPersona.getContacto, EL_CONTACTO_ES_OBLIGATORIO);
        persona.setIdPersona(comandoPersona.getIdPersona());
        persona.setIdentificacion(comandoPersona.getIdentificacion());
        persona.setNombreCompleto(comandoPersona.getNombreCompleto());
        persona.setContacto(comandoPersona.getContacto());
        return persona;
    }

    public Persona borrar(Integer idPersona) {
        ValidadorArgumento.validarObligatorio(idPersona, EL_ID_DE_LA_PERSONA_ES_OBLIGATORIO);
        ValidadorArgumento.validarPositivo(idPersona, EL_ID_DE_LA_PERSONA_NO_ES_VALIDO);
        Persona persona = new Persona();
        persona.setIdPersona(idPersona);
        return persona;
    }
}
