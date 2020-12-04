package ar.edu.unju.edm.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// import antlr.collections.List;
import ar.edu.unju.edm.model.Usuario;

@Repository
public interface IUsuarioRepository extends CrudRepository<Usuario,Long>{
    @Query("from Usuario e order by e.iduser")
    public Optional<Usuario> findNombreUsuario(String nombre);
    public List<Usuario> obtenerUsuario();
}
