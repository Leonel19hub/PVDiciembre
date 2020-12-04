package ar.edu.unju.edm.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

public class Habitacion implements Serializable{

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDROOM", nullable = false)
    private int idRoom;

    @Column(name = "TR", nullable = false)
    private int tipeRoom; // simple y dobles

    @Column(name = "NR", nullable = false)
    private int numRoom;

    @Column(name = "FR", nullable = false)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDateTime fechaReserva;
    

    public Habitacion() {
    }

    public Habitacion(int idRoom, int tipeRoom, int numRoom, LocalDateTime fechaReserva) {
        this.idRoom = idRoom;
        this.tipeRoom = tipeRoom;
        this.numRoom = numRoom;
        this.fechaReserva = fechaReserva;
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

    public int getNumRoom() {
        return this.numRoom;
    }

    public void setNumRoom(int numRoom) {
        this.numRoom = numRoom;
    }

    public LocalDateTime getFechaReserva() {
        return this.fechaReserva;
    }

    public void setFechaReserva(LocalDateTime fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public Habitacion idRoom(int idRoom) {
        this.idRoom = idRoom;
        return this;
    }

    public Habitacion tipeRoom(int tipeRoom) {
        this.tipeRoom = tipeRoom;
        return this;
    }

    public Habitacion numRoom(int numRoom) {
        this.numRoom = numRoom;
        return this;
    }

    public Habitacion fechaReserva(LocalDateTime fechaReserva) {
        this.fechaReserva = fechaReserva;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Habitacion)) {
            return false;
        }
        Habitacion habitacion = (Habitacion) o;
        return idRoom == habitacion.idRoom && tipeRoom == habitacion.tipeRoom && numRoom == habitacion.numRoom && Objects.equals(fechaReserva, habitacion.fechaReserva);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idRoom, tipeRoom, numRoom, fechaReserva);
    }

    @Override
    public String toString() {
        return "{" +
            " idRoom='" + getIdRoom() + "'" +
            ", tipeRoom='" + getTipeRoom() + "'" +
            ", numRoom='" + getNumRoom() + "'" +
            ", fechaReserva='" + getFechaReserva() + "'" +
            "}";
    }

	public Habitacion orElseThrow() {
		return null;
	}

	public Habitacion orElseThrow(Object object) {
		return null;
	}


}
