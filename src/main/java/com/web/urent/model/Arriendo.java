package com.web.urent.model;

<<<<<<< HEAD
import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "arriendo")
public class Arriendo {

    private Integer idArriendo;
    @JsonFormat(pattern="yyyy-MMM-dd")
    private Date fechaInicio;
    @JsonFormat(pattern="yyyy-MMM-dd")
    private Date fechaTermino;
    private Arrendador id_Arrendador;
    private Arrendatario id_Arrendatario;
    private Inmueble id_Inmueble;
    private Integer estado;

    @Id
    public Integer getIdArriendo() {
        return idArriendo;
    }

    public void setIdArriendo(Integer idArriendo) {
        this.idArriendo = idArriendo;
    }

    @Column(name = "fecha_Inicio")
    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    @Column(name = "fecha_Termino")
    public Date getFechaTermino() {
        return fechaTermino;
    }

    public void setFechaTermino(Date fechaTermino) {
        this.fechaTermino = fechaTermino;
    }

    @ManyToOne
    @JoinColumn(name = "id_Arrendador")
    public Arrendador getId_Arrendador() {
        return id_Arrendador;
    }

    public void setId_Arrendador(Arrendador id_Arrendador) {
        this.id_Arrendador = id_Arrendador;
    }

    @ManyToOne
    @JoinColumn(name = "id_Arrendatario")
    public Arrendatario getId_Arrendatario() {
        return id_Arrendatario;
    }

    public void setId_Arrendatario(Arrendatario id_Arrendatario) {
        this.id_Arrendatario = id_Arrendatario;
    }


    @ManyToOne
    @JoinColumn(name = "id_Inmueble")
    public Inmueble getId_Inmueble(){
        return id_Inmueble;
    }

    public void setId_Inmueble(Inmueble id_Inmueble) {
        this.id_Inmueble = id_Inmueble;
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


/**
 * The persistent class for the Arriendo database table.
 * 
 */
@Entity
@NamedQuery(name="Arriendo.findAll", query="SELECT a FROM Arriendo a")
public class Arriendo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id_Arriendo;

	private int estado;

	@Temporal(TemporalType.DATE)
	private Date fecha_Inicio;

	@Temporal(TemporalType.DATE)
	private Date fecha_Termino;

	//bi-directional many-to-one association to Arrendador
	@ManyToOne
	@JoinColumn(name="id_Arrendador")
	private Arrendador arrendador;

	//bi-directional many-to-one association to Arrendatario
	@ManyToOne
	@JoinColumn(name="id_Arrendatario")
	private Arrendatario arrendatario;

	//bi-directional many-to-one association to Inmueble
	@ManyToOne
	@JoinColumn(name="id_Inmueble")
	private Inmueble inmueble;

	public Arriendo() {
	}

	public int getId_Arriendo() {
		return this.id_Arriendo;
	}

	public void setId_Arriendo(int id_Arriendo) {
		this.id_Arriendo = id_Arriendo;
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

	public Arrendador getArrendador() {
		return this.arrendador;
	}

	public void setArrendador(Arrendador arrendador) {
		this.arrendador = arrendador;
	}

	public Arrendatario getArrendatario() {
		return this.arrendatario;
	}

	public void setArrendatario(Arrendatario arrendatario) {
		this.arrendatario = arrendatario;
	}

	public Inmueble getInmueble() {
		return this.inmueble;
	}

	public void setInmueble(Inmueble inmueble) {
		this.inmueble = inmueble;
	}

}
>>>>>>> 1f1063c62e8fcd0ceca738f40833a2c9f9a95b3f
