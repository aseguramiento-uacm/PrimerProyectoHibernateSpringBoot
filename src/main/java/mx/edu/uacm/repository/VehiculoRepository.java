package mx.edu.uacm.repository;
/**
 * Interface
 */
import org.springframework.data.repository.CrudRepository;

import mx.edu.uacm.domain.Vehiculo;

public interface VehiculoRepository extends CrudRepository<Vehiculo, Long> {

}
