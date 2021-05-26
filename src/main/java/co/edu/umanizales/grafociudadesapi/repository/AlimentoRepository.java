package co.edu.umanizales.grafociudadesapi.repository;

import co.edu.umanizales.grafociudadesapi.domain.entities.AlimentosEntity
        ;
import org.springframework.data.repository.CrudRepository;

public interface AlimentoRepository extends CrudRepository<AlimentosEntity,Integer> {
}
