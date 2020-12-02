package ar.edu.unju.edm.repository;

import org.springframework.stereotype.Repository;

import ar.edu.unju.edm.modelo.Habitacion;
// import ar.edu.unju.edm.modelo.Usuario;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface IHabitacionRepository extends CrudRepository<Habitacion, Integer> {
    // CrudRepository<Habitacion,Integer>
}
