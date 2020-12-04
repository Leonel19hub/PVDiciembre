package ar.edu.unju.edm.services;

import java.util.List;

import org.springframework.stereotype.Service;

import ar.edu.unju.edm.model.Habitacion;

@Service
public interface IHabitacionService {
    
    public void guardarRoom(Habitacion room);
    public List<Habitacion> buscarAllRooms();
    public Habitacion conseguirRoom(Habitacion room);
    public void guardarEncontrado(Habitacion room);
    public Habitacion obtenerRoom(int numRoom) throws Exception;
    public long retornarId(Habitacion room);
    public void eliminarRoom();

}
