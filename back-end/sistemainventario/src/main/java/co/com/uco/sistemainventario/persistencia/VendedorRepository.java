package co.com.uco.sistemainventario.persistencia;

import co.com.uco.sistemainventario.entidad.Vendedor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendedorRepository extends CrudRepository<Vendedor, Integer> {
}
