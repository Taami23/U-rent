package com.web.urent.model;

<<<<<<< HEAD
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "universidad")
public class Universidad {
    private Integer idUniversidad;
    private String nombre;
    private Integer estado;

    @Id
    //@GeneratedValue(strategy= GenerationType.IDENTITY)
    public Integer getIdUniversidad() {
        return idUniversidad;
    }

    public void setIdUniversidad(Integer idUniversidad) {
        this.idUniversidad = idUniversidad;
    }

    @Column(name="nombre")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Column(name="estado")
    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

}
=======
import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the Universidad database table.
 * 
 */
@Entity
@NamedQuery(name="Universidad.findAll", query="SELECT u FROM Universidad u")
public class Universidad implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id_Universidad;

	private int estado;

	private String nombre;

	//bi-directional many-to-one association to Sede
	@OneToMany(mappedBy="universidad")
	private List<Sede> sedes;

	public Universidad() {
	}

	public int getId_Universidad() {
		return this.id_Universidad;
	}

	public void setId_Universidad(int id_Universidad) {
		this.id_Universidad = id_Universidad;
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

	public List<Sede> getSedes() {
		return this.sedes;
	}

	public void setSedes(List<Sede> sedes) {
		this.sedes = sedes;
	}

	public Sede addSede(Sede sede) {
		getSedes().add(sede);
		sede.setUniversidad(this);

		return sede;
	}

	public Sede removeSede(Sede sede) {
		getSedes().remove(sede);
		sede.setUniversidad(null);

		return sede;
	}

}
>>>>>>> 1f1063c62e8fcd0ceca738f40833a2c9f9a95b3f
