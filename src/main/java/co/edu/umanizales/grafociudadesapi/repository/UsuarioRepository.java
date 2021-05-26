package co.edu.umanizales.grafociudadesapi.repository;

import co.edu.umanizales.grafociudadesapi.domain.entities.UsuarioEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<UsuarioEntity,Integer> {

    @Query("SELECT usuario FROM UsuarioEntity usuario WHERE usuario.correo=?1")
    UsuarioEntity findUsuarioByCorreo(String correo);
}
