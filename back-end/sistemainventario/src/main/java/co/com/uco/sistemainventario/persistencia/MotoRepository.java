package co.com.uco.sistemainventario.persistencia;

import co.com.uco.sistemainventario.entidad.Moto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MotoRepository extends CrudRepository<Moto, Integer> {
}
