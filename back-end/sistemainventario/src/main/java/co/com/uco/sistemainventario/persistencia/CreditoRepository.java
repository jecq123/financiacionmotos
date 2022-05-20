package co.com.uco.sistemainventario.persistencia;

import co.com.uco.sistemainventario.entidad.Credito;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditoRepository extends CrudRepository<Credito, Integer> {
}
