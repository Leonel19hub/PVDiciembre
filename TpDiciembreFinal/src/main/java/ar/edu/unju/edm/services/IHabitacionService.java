package ar.edu.unju.edm.services;

// import java.util.List;

import org.springframework.stereotype.Service;

import ar.edu.unju.edm.modelo.Habitacion;

@Service
public interface IHabitacionService {
    
    //i not sure for this
    public void saveRoom(Habitacion room);
    public Habitacion searchRoom();//tendria que ser con localdate
    public Iterable<Habitacion> searchAllRooms();
}
