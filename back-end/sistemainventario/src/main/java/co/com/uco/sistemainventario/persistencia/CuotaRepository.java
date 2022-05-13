package co.com.uco.sistemainventario.persistencia;

import co.com.uco.sistemainventario.entidad.Cuota;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CuotaRepository extends CrudRepository<Cuota, Integer> {
}
