package co.com.uco.sistemainventario.persistencia;

import co.com.uco.sistemainventario.entidad.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Integer> {
    Cliente findByIdentificacion(String identificacion);
}
