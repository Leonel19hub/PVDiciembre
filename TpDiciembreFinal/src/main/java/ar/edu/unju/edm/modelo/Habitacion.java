package ar.edu.unju.edm.modelo;

import java.io.Serializable;
import java.time.LocalDate;

public class Habitacion implements Serializable{

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private int idRoom;
    private int tipeRoom; // simple y dobles
    private LocalDate fechaRoom;
    

    public Habitacion() {
    }

    public Habitacion(int idRoom, int tipeRoom, LocalDate fechaRoom) {
        this.idRoom = idRoom;
        this.tipeRoom = tipeRoom;
        this.fechaRoom = fechaRoom;
    }

    public int getIdRoom() {
        return this.idRoom;
    }

    public void setIdRoom(int idRoom) {
        this.idRoom = idRoom;
    }

    public int getTipeRoom() {
        return this.tipeRoom;
    }

    public void setTipeRoom(int tipeRoom) {
        this.tipeRoom = tipeRoom;
    }

    public LocalDate getFechaRoom() {
        return this.fechaRoom;
    }

    public void setFechaRoom(LocalDate fechaRoom) {
        this.fechaRoom = fechaRoom;
    }

    @Override
    public String toString() {
        return "{" +
            " idRoom='" + getIdRoom() + "'" +
            ", tipeRoom='" + getTipeRoom() + "'" +
            ", fechaRoom='" + getFechaRoom() + "'" +
            "}";
    }


}
