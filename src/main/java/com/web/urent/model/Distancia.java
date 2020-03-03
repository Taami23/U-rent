package com.web.urent.model;

<<<<<<< HEAD

import javax.persistence.*;

@Entity
@Table(name = "distancias")
public class Distancia {
    private Integer idDistancia;
    private Inmueble idInmueble;
    private Sede idSede;
    private Integer kilometros;
    private Integer estado;

    @Id
    public Integer getIdDistancia() {
        return idDistancia;
    }

    public void setIdDistancia(Integer idDistancia) {
        this.idDistancia = idDistancia;
    }

    @ManyToOne()
    @JoinColumn(name = "id_Inmueble")
    public Inmueble getIdInmueble() {
        return idInmueble;
    }

    public void setIdInmueble(Inmueble idInmueble) {
        this.idInmueble = idInmueble;
    }

    @ManyToOne()
    @JoinColumn(name = "id_Sede")
    public Sede getIdSede() {
        return idSede;
    }

    public void setIdSede(Sede idSede) {
        this.idSede = idSede;
    }

    @Column(name = "kilometros")
    public Integer getKilometros() {
        return kilometros;
    }

    public void setKilometros(Integer kilometros) {
        this.kilometros = kilometros;
    }

    @Column(name = "estado")
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


/**
 * The persistent class for the Distancias database table.
 * 
 */
@Entity
@Table(name="Distancias")
@NamedQuery(name="Distancia.findAll", query="SELECT d FROM Distancia d")
public class Distancia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id_Distancia;

	private int estado;

	private double kilometros;

	//bi-directional many-to-one association to Inmueble
	@ManyToOne
	@JoinColumn(name="id_Inmueble")
	private Inmueble inmueble;

	//bi-directional many-to-one association to Sede
	@ManyToOne
	@JoinColumn(name="id_Sede")
	private Sede sede;

	public Distancia() {
	}

	public int getId_Distancia() {
		return this.id_Distancia;
	}

	public void setId_Distancia(int id_Distancia) {
		this.id_Distancia = id_Distancia;
	}

	public int getEstado() {
		return this.estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public double getKilometros() {
		return this.kilometros;
	}

	public void setKilometros(double kilometros) {
		this.kilometros = kilometros;
	}

	public Inmueble getInmueble() {
		return this.inmueble;
	}

	public void setInmueble(Inmueble inmueble) {
		this.inmueble = inmueble;
	}

	public Sede getSede() {
		return this.sede;
	}

	public void setSede(Sede sede) {
		this.sede = sede;
	}

}
>>>>>>> 1f1063c62e8fcd0ceca738f40833a2c9f9a95b3f
