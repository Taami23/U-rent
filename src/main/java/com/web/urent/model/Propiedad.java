package com.web.urent.model;

<<<<<<< HEAD
import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "propiedad")
public class Propiedad {

    private Integer id_Propiedad;
    @JsonFormat(pattern="yyyy-MMM-dd")
    private Date fecha_Inicio;
    @JsonFormat(pattern="yyyy-MMM-dd")
    private Date fecha_Termino;
    private Arrendador id_Arrendador;
    private Integer estado;

    @Id
    public Integer getId_Propiedad() {
        return id_Propiedad;
    }

    public void setId_Propiedad(Integer id_Propiedad) {
        this.id_Propiedad = id_Propiedad;
    }

    @Column(name = "fecha_Inicio")
    public Date getFecha_Inicio() {
        return fecha_Inicio;
    }

    public void setFecha_Inicio(Date fecha_Inicio) {
        this.fecha_Inicio = fecha_Inicio;
    }

    @Column(name = "fecha_Termino")
    public Date getFecha_Termino() {
        return fecha_Termino;
    }

    public void setFecha_Termino(Date fecha_Termino) {
        this.fecha_Termino = fecha_Termino;
    }

    @ManyToOne
    @JoinColumn(name = "id_Arrendador")
    public Arrendador getId_Arrendador() {
        return id_Arrendador;
    }

    public void setId_Arrendador(Arrendador id_Arrendador) {
        this.id_Arrendador = id_Arrendador;
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
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the propiedad database table.
 * 
 */
@Entity
@NamedQuery(name="Propiedad.findAll", query="SELECT p FROM Propiedad p")
public class Propiedad implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id_Propiedad;

	private int estado;

	@Temporal(TemporalType.DATE)
	private Date fecha_Inicio;

	@Temporal(TemporalType.DATE)
	private Date fecha_Termino;

	//bi-directional many-to-one association to Inmueble
	@OneToMany(mappedBy="propiedad")
	private List<Inmueble> inmuebles;

	//bi-directional many-to-one association to Arrendador
	@ManyToOne
	@JoinColumn(name="id_Arrendador")
	private Arrendador arrendador;

	public Propiedad() {
	}

	public int getId_Propiedad() {
		return this.id_Propiedad;
	}

	public void setId_Propiedad(int id_Propiedad) {
		this.id_Propiedad = id_Propiedad;
	}

	public int getEstado() {
		return this.estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public Date getFecha_Inicio() {
		return this.fecha_Inicio;
	}

	public void setFecha_Inicio(Date fecha_Inicio) {
		this.fecha_Inicio = fecha_Inicio;
	}

	public Date getFecha_Termino() {
		return this.fecha_Termino;
	}

	public void setFecha_Termino(Date fecha_Termino) {
		this.fecha_Termino = fecha_Termino;
	}

	public List<Inmueble> getInmuebles() {
		return this.inmuebles;
	}

	public void setInmuebles(List<Inmueble> inmuebles) {
		this.inmuebles = inmuebles;
	}

	public Inmueble addInmueble(Inmueble inmueble) {
		getInmuebles().add(inmueble);
		inmueble.setPropiedad(this);

		return inmueble;
	}

	public Inmueble removeInmueble(Inmueble inmueble) {
		getInmuebles().remove(inmueble);
		inmueble.setPropiedad(null);

		return inmueble;
	}

	public Arrendador getArrendador() {
		return this.arrendador;
	}

	public void setArrendador(Arrendador arrendador) {
		this.arrendador = arrendador;
	}

}
>>>>>>> 1f1063c62e8fcd0ceca738f40833a2c9f9a95b3f
