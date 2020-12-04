package ar.edu.unju.edm.servicemp;

import java.util.List;
// import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import ar.edu.unju.edm.model.Habitacion;
import ar.edu.unju.edm.repository.IHabitacionRepository;
import ar.edu.unju.edm.services.IHabitacionService;

public class IHabitacionServicemp implements IHabitacionService {

    private Habitacion auxroom = new Habitacion();
    @Autowired
    private IHabitacionRepository iHabitacionRepository;

    @Override
    public void guardarRoom(Habitacion room) {
        iHabitacionRepository.save(room);
        auxroom = room;
    }

    @Override
    public List<Habitacion> buscarAllRooms() {
        return iHabitacionRepository.buscarHabitacion();
    }

    @Override
    public Habitacion conseguirRoom(Habitacion room) {
        return auxroom;
    }

    @Override
    public void guardarEncontrado(Habitacion room) {
        auxroom = room;

    }

    @Override
    public Habitacion obtenerRoom(int numRoom) throws Exception {
        // BUSCAR SOLUCION
        // return iHabitacionRepository.findByIduser(numRoom).orElseThrow(()-> new Exception("La habitacion no existe"));
        return null;
    }

    @Override
    public long retornarId(Habitacion room) {
        return room.getIdRoom();
    }

    @Override
    public void eliminarRoom() {
        auxroom = new Habitacion();
    }
    
}
