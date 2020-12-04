package ar.edu.unju.edm.repository;

import org.springframework.stereotype.Repository;

// import antlr.collections.List;
import ar.edu.unju.edm.model.Habitacion;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface IHabitacionRepository extends CrudRepository<Habitacion, Integer> {
    // CrudRepository<Habitacion,Integer>
    @Query("from room e order by e.iduser")
    public Habitacion findByIduser(int numRoom);
    public List<Habitacion> buscarHabitacion();
    
}
