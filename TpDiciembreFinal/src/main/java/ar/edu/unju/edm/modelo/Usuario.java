package ar.edu.unju.edm.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Usuario implements Serializable{

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "native")
    @GenericGenerator(name = "native",strategy = "native")
    private int idUser;
    @Column
    private String nombre;
    @Column
    private String apellido;
    @Column
    private int dni;
    @Column
    private int tipeUser;


    public Usuario() {
    }
    

    public Usuario(int idUser, String nombre, String apellido, int dni, int tipeUser) {
        this.idUser = idUser;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.tipeUser = tipeUser;
    }

    public int getIdUser() {
        return this.idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return this.dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getTipeUser() {
        return tipeUser;
    }

    public void setTipeUser(int tipeUser) {
        this.tipeUser = tipeUser;
    }

    @Override
    public String toString() {
        return "{" +
            " idUser='" + getIdUser() + "'" +
            ", nombre='" + getNombre() + "'" +
            ", apellido='" + getApellido() + "'" +
            ", dni='" + getDni() + "'" +
            "}";
    }
    
}
