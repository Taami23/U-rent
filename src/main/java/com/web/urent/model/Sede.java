package com.web.urent.model;

<<<<<<< HEAD
import javax.persistence.*;

@Entity
@Table(name = "sede")
public class Sede {
    private Integer idSede;
    private String nombre;
    private String direccion;
    private Universidad idUniversidad;
    private Integer estado;

    @Id
    // @GeneratedValue(strategy= GenerationType.IDENTITY)
    public Integer getIdSede() {
        return idSede;
    }

    public void setIdSede(Integer idSede) {
        this.idSede = idSede;
    }

    @Column(name="nombre")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Column(name="direccion")
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @ManyToOne
    @JoinColumn(name="id_Universidad")
    public Universidad getIdUniversidad() {
        return idUniversidad;
    }

    public void setIdUniversidad(Universidad idUniversidad) {
        this.idUniversidad = idUniversidad;
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
 * The persistent class for the Sede database table.
 * 
 */
@Entity
@NamedQuery(name="Sede.findAll", query="SELECT s FROM Sede s")
public class Sede implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id_Sede;

	private String direccion;

	private int estado;

	private String nombre;

	//bi-directional many-to-one association to Distancia
	@OneToMany(mappedBy="sede")
	private List<Distancia> distancias;

	//bi-directional many-to-one association to Universidad
	@ManyToOne
	@JoinColumn(name="id_Universidad")
	private Universidad universidad;

	public Sede() {
	}

	public int getId_Sede() {
		return this.id_Sede;
	}

	public void setId_Sede(int id_Sede) {
		this.id_Sede = id_Sede;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
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

	public List<Distancia> getDistancias() {
		return this.distancias;
	}

	public void setDistancias(List<Distancia> distancias) {
		this.distancias = distancias;
	}

	public Distancia addDistancia(Distancia distancia) {
		getDistancias().add(distancia);
		distancia.setSede(this);

		return distancia;
	}

	public Distancia removeDistancia(Distancia distancia) {
		getDistancias().remove(distancia);
		distancia.setSede(null);

		return distancia;
	}

	public Universidad getUniversidad() {
		return this.universidad;
	}

	public void setUniversidad(Universidad universidad) {
		this.universidad = universidad;
	}

}
>>>>>>> 1f1063c62e8fcd0ceca738f40833a2c9f9a95b3f
