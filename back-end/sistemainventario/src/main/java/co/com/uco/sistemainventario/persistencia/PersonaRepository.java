package co.com.uco.sistemainventario.persistencia;

import co.com.uco.sistemainventario.entidad.Persona;
import co.com.uco.sistemainventario.entidad.Producto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PersonaRepository extends CrudRepository<Persona, Integer> {
    Persona findByIdentificacion(String identificacion);
}
