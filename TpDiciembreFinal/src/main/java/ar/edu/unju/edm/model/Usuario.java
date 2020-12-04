package ar.edu.unju.edm.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Usuario")
public class Usuario implements Serializable{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//,generator = "native"
    /* @GenericGenerator(name = "native",strategy = "native")*/
    @Column(name="IDUSER", nullable = false)
    private long idUser;

    @Column(name="NAME", nullable = false)
    private String nameUser;

    @Column(name="PASSWORD", nullable = false)
    private String password;

    @Column(name="TN", nullable = false)
    private String trueName;

    @Column(name="TS", nullable = false)
    private String trueSurname;

    @Column(name="TU", nullable = false)
    private int tipeUser;

    public Usuario(){
        
    }


    public Usuario(long idUser, String nameUser, String password, String trueName, String trueSurname, int tipeUser) {
        this.idUser = idUser;
        this.nameUser = nameUser;
        this.password = password;
        this.trueName = trueName;
        this.trueSurname = trueSurname;
        this.tipeUser = tipeUser;
    }

    public long getIdUser() {
        return this.idUser;
    }

    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }

    public String getNameUser() {
        return this.nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTrueName() {
        return this.trueName;
    }

    public void setTrueName(String trueName) {
        this.trueName = trueName;
    }

    public String getTrueSurname() {
        return this.trueSurname;
    }

    public void setTrueSurname(String trueSurname) {
        this.trueSurname = trueSurname;
    }

    public int getTipeUser() {
        return this.tipeUser;
    }

    public void setTipeUser(int tipeUser) {
        this.tipeUser = tipeUser;
    }

    @Override
    public String toString() {
        return "{" +
            " idUser='" + getIdUser() + "'" +
            ", nameUser='" + getNameUser() + "'" +
            ", password='" + getPassword() + "'" +
            ", trueName='" + getTrueName() + "'" +
            ", trueSurname='" + getTrueSurname() + "'" +
            ", tipeUser='" + getTipeUser() + "'" +
            "}";
    }

}