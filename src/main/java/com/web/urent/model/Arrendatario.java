package com.web.urent.model;

<<<<<<< HEAD
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "arrendatario")
public class Arrendatario {

    private int id_Arrendatario;
    private double calificacion;
    private String clave;
    private String correo;
    private String descripcion;
    private int estado;
    private String nombre;
    private String rut_Arrendatario;
    private String telefono;

    @Id
    public int getId_Arrendatario() {
        return id_Arrendatario;
    }

    public void setId_Arrendatario(int id_Arrendatario) {
        this.id_Arrendatario = id_Arrendatario;
    }

    @Column(name = "calificacion")
    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    @Column(name = "clave")
    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @Column(name = "correo")
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Column(name = "descripcion")
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Column(name = "estado")
    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Column(name = "nombre")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Column(name = "rut_Arrendatario")
    public String getRut_Arrendatario() {
        return rut_Arrendatario;
    }

    public void setRut_Arrendatario(String rut_Arrendatario) {
        this.rut_Arrendatario = rut_Arrendatario;
    }

    @Column(name = "telefono")
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
=======
import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the Arrendatario database table.
 * 
 */
@Entity
@NamedQuery(name="Arrendatario.findAll", query="SELECT a FROM Arrendatario a")
public class Arrendatario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id_Arrendatario;

	private double calificacion;

	private String clave;

	private String correo;

	private String descripcion;

	private int estado;

	private String nombre;

	private String rut_Arrendatario;

	private String telefono;

	//bi-directional many-to-one association to Arriendo
	@OneToMany(mappedBy="arrendatario")
	private List<Arriendo> arriendos;

	public Arrendatario() {
	}

	public int getId_Arrendatario() {
		return this.id_Arrendatario;
	}

	public void setId_Arrendatario(int id_Arrendatario) {
		this.id_Arrendatario = id_Arrendatario;
	}

	public double getCalificacion() {
		return this.calificacion;
	}

	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}

	public String getClave() {
		return this.clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getEstado() {
		return this.estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRut_Arrendatario() {
		return this.rut_Arrendatario;
	}

	public void setRut_Arrendatario(String rut_Arrendatario) {
		this.rut_Arrendatario = rut_Arrendatario;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public List<Arriendo> getArriendos() {
		return this.arriendos;
	}

	public void setArriendos(List<Arriendo> arriendos) {
		this.arriendos = arriendos;
	}

	public Arriendo addArriendo(Arriendo arriendo) {
		getArriendos().add(arriendo);
		arriendo.setArrendatario(this);

		return arriendo;
	}

	public Arriendo removeArriendo(Arriendo arriendo) {
		getArriendos().remove(arriendo);
		arriendo.setArrendatario(null);

		return arriendo;
	}

}
>>>>>>> 1f1063c62e8fcd0ceca738f40833a2c9f9a95b3f
