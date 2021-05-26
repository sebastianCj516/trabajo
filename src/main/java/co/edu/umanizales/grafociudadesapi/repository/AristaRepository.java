package co.edu.umanizales.grafociudadesapi.repository;

import co.edu.umanizales.grafociudadesapi.domain.entities.AristaEntity;
import co.edu.umanizales.grafociudadesapi.domain.entities.AristaEntityPK;
import org.springframework.data.repository.CrudRepository;

public interface AristaRepository extends CrudRepository<AristaEntity, AristaEntityPK> {
}
