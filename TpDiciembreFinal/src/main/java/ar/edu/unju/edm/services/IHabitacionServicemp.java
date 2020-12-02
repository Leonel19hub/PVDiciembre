package ar.edu.unju.edm.services;

// import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.edm.modelo.Habitacion;
import ar.edu.unju.edm.repository.IHabitacionRepository;

@Service
public class IHabitacionServicemp implements IHabitacionService {

    @Autowired
    IHabitacionRepository IHabitacionRepository;

    @Override
    public void saveRoom(Habitacion room) {
        IHabitacionRepository.save(room);
    }

    @Override
    public Habitacion searchRoom() {
        return null;
    }

    @Override
    public Iterable<Habitacion> searchAllRooms() {
        return IHabitacionRepository.findAll();
        // return null;
    }
    
}
