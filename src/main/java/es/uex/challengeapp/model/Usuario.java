package es.uex.challengeapp.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String correo;
    private String contrasena;
    private String perfilInfo;
    private String ubicacion;
    
    @OneToMany(mappedBy = "usuario")
    private List<Punto> puntos;

    @OneToMany(mappedBy = "creador")
    private List<Reto> retosCreados;

    @OneToMany(mappedBy = "usuario")
    private List<Estadistica> estadisticas;

    @OneToMany(mappedBy = "usuario")
    private List<Notificacion> notificaciones;

    @OneToMany(mappedBy = "usuario")
    private List<Comentario> comentarios;

    @OneToMany(mappedBy = "usuario")
    private List<Recompensa> recompensas;

    @OneToMany(mappedBy = "usuario")
    private List<ProgresoReto> progresoRetos;

    public Usuario(String nombre, String correo, String contrasena, String ubicacion) {
        this.nombre = nombre;
        this.correo = correo;
        this.contrasena = contrasena;
        this.ubicacion = ubicacion;
        puntos=new ArrayList<Punto>();
        retosCreados = new ArrayList<>();
        estadisticas = new ArrayList<>();
        notificaciones = new ArrayList<>();
        comentarios = new ArrayList<>();
        recompensas = new ArrayList<>();
        progresoRetos = new ArrayList<>();
        amigos = new ArrayList<>();
    }

    @ManyToMany
    @JoinTable(
            name = "Amistad",
            joinColumns = @JoinColumn(name = "usuario_id1"),
            inverseJoinColumns = @JoinColumn(name = "usuario_id2")
    )
    private List<Usuario> amigos;

    public Usuario() {
        nombre = "";
        correo = "";
        contrasena = "";
        perfilInfo = "";
        ubicacion = "";
        puntos=new ArrayList<Punto>();
        retosCreados = new ArrayList<>();
        estadisticas = new ArrayList<>();
        notificaciones = new ArrayList<>();
        comentarios = new ArrayList<>();
        recompensas = new ArrayList<>();
        progresoRetos = new ArrayList<>();
        amigos = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getPerfilInfo() {
        return perfilInfo;
    }

    public void setPerfilInfo(String perfilInfo) {
        this.perfilInfo = perfilInfo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

	public List<Punto> getPuntos() {
		return puntos;
	}

	public void setPuntos(List<Punto> puntos) {
		this.puntos = puntos;
	}

	public List<Reto> getRetosCreados() {
        return retosCreados;
    }

    public void setRetosCreados(List<Reto> retosCreados) {
        this.retosCreados = retosCreados;
    }

    public List<Estadistica> getEstadisticas() {
        return estadisticas;
    }

    public void setEstadisticas(List<Estadistica> estadisticas) {
        this.estadisticas = estadisticas;
    }

    public List<Notificacion> getNotificaciones() {
        return notificaciones;
    }

    public void setNotificaciones(List<Notificacion> notificaciones) {
        this.notificaciones = notificaciones;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

    public List<Recompensa> getRecompensas() {
        return recompensas;
    }

    public void setRecompensas(List<Recompensa> recompensas) {
        this.recompensas = recompensas;
    }

    public List<ProgresoReto> getProgresoRetos() {
        return progresoRetos;
    }

    public void setProgresoRetos(List<ProgresoReto> progresoRetos) {
        this.progresoRetos = progresoRetos;
    }

    public List<Usuario> getAmigos() {
        return amigos;
    }

    public void setAmigos(List<Usuario> amigos) {
        this.amigos = amigos;
    }
}
