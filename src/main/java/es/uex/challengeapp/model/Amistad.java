package es.uex.challengeapp.model;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
public class Amistad implements Serializable {
    @Id
    @ManyToOne // Un usuario puede tener muchas amistades
    @JoinColumn(name = "usuario_id1")
    private Usuario usuario1; //

    @Id
    @ManyToOne // Un
    @JoinColumn(name = "usuario_id2")
    private Usuario usuario2; // Usuario con el que se ha establecido la amistad

    public Usuario getUsuario1() {
        return usuario1;
    }

    public void setUsuario1(Usuario usuario1) {
        this.usuario1 = usuario1;
    }

    public Usuario getUsuario2() {
        return usuario2;
    }

    public void setUsuario2(Usuario usuario2) {
        this.usuario2 = usuario2;
    }
}
