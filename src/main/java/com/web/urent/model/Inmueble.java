package com.web.urent.model;

<<<<<<< HEAD
import javax.persistence.*;

@Entity
@Table(name = "inmueble")
public class Inmueble {

    private Integer id_Inmueble;
    private Integer nroHabitaciones;
    private Integer nroBanos;
    private Integer wifi;
    private Integer luz;
    private Integer agua;
    private Integer gas;
    private Integer cocina;
    private Integer precioMensual;
    private String descripcion;
    private Integer estacionamiento;
    private Integer disponibilidad;
    private String direccion;
    private Propiedad id_Propiedad;
    private Integer estado;


    @Id
    // @GeneratedValue(strategy= GenerationType.IDENTITY)
    public Integer getIdInmueble() {
        return id_Inmueble;
    }

    public void setIdInmueble(Integer idInmueble) {
        this.id_Inmueble = idInmueble;
    }

    @Column(name="nro_Habitaciones")
    public Integer getNroHabitaciones() {
        return nroHabitaciones;
    }

    public void setNroHabitaciones(Integer nroHabitaciones) {
        this.nroHabitaciones = nroHabitaciones;
    }
    @Column(name="nro_Banos")
    public Integer getNroBanos() {
        return nroBanos;
    }

    public void setNroBanos(Integer nroBanos) {
        this.nroBanos = nroBanos;
    }

    @Column(name="wifi")
    public Integer getWifi() {
        return wifi;
    }

    public void setWifi(Integer wifi) {
        this.wifi = wifi;
    }

    @Column(name="luz")
    public Integer getLuz() {
        return luz;
    }

    public void setLuz(Integer luz) {
        this.luz = luz;
    }

    @Column(name="agua")
    public Integer getAgua() {
        return agua;
    }

    public void setAgua(Integer agua) {
        this.agua = agua;
    }

    @Column(name="gas")
    public Integer getGas() {
        return gas;
    }

    public void setGas(Integer gas) {
        this.gas = gas;
    }

    @Column(name="cocina")
    public Integer getCocina() {
        return cocina;
    }

    public void setCocina(Integer cocina) {
        this.cocina = cocina;
    }

    @Column(name="precio_Mensual")
    public Integer getPrecioMensual() {
        return precioMensual;
    }

    public void setPrecioMensual(Integer precioMensual) {
        this.precioMensual = precioMensual;
    }

    @Column(name="descripcion")
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Column(name="estacionamiento")
    public Integer getEstacionamiento() {
        return estacionamiento;
    }

    public void setEstacionamiento(Integer estacionamiento) {
        this.estacionamiento = estacionamiento;
    }

    @Column(name="disponibilidad")
    public Integer getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(Integer disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    @Column(name="direccion")
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @ManyToOne
    @JoinColumn(name="id_Propiedad")
    public Propiedad getIdPropiedad() {
        return id_Propiedad;
    }

    public void setIdPropiedad(Propiedad idPropiedad) {
        this.id_Propiedad = idPropiedad;
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
 * The persistent class for the Inmueble database table.
 * 
 */
@Entity
@NamedQuery(name="Inmueble.findAll", query="SELECT i FROM Inmueble i")
public class Inmueble implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id_Inmueble;

	private int agua;

	private int cocina;

	private String descripcion;

	private String direccion;

	private int disponibilidad;

	private int estacionamiento;

	private int estado;

	private int gas;

	private int luz;

	private int nro_Banos;

	private int nro_Habitaciones;

	private int precio_Mensual;

	private int wifi;

	//bi-directional many-to-one association to Arriendo
	@OneToMany(mappedBy="inmueble")
	private List<Arriendo> arriendos;

	//bi-directional many-to-one association to Distancia
	@OneToMany(mappedBy="inmueble")
	private List<Distancia> distancias;

	//bi-directional many-to-one association to Propiedad
	@ManyToOne
	@JoinColumn(name="id_Propiedad")
	private Propiedad propiedad;

	public Inmueble() {
	}

	public int getId_Inmueble() {
		return this.id_Inmueble;
	}

	public void setId_Inmueble(int id_Inmueble) {
		this.id_Inmueble = id_Inmueble;
	}

	public int getAgua() {
		return this.agua;
	}

	public void setAgua(int agua) {
		this.agua = agua;
	}

	public int getCocina() {
		return this.cocina;
	}

	public void setCocina(int cocina) {
		this.cocina = cocina;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getDisponibilidad() {
		return this.disponibilidad;
	}

	public void setDisponibilidad(int disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

	public int getEstacionamiento() {
		return this.estacionamiento;
	}

	public void setEstacionamiento(int estacionamiento) {
		this.estacionamiento = estacionamiento;
	}

	public int getEstado() {
		return this.estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public int getGas() {
		return this.gas;
	}

	public void setGas(int gas) {
		this.gas = gas;
	}

	public int getLuz() {
		return this.luz;
	}

	public void setLuz(int luz) {
		this.luz = luz;
	}

	public int getNro_Banos() {
		return this.nro_Banos;
	}

	public void setNro_Banos(int nro_Banos) {
		this.nro_Banos = nro_Banos;
	}

	public int getNro_Habitaciones() {
		return this.nro_Habitaciones;
	}

	public void setNro_Habitaciones(int nro_Habitaciones) {
		this.nro_Habitaciones = nro_Habitaciones;
	}

	public int getPrecio_Mensual() {
		return this.precio_Mensual;
	}

	public void setPrecio_Mensual(int precio_Mensual) {
		this.precio_Mensual = precio_Mensual;
	}

	public int getWifi() {
		return this.wifi;
	}

	public void setWifi(int wifi) {
		this.wifi = wifi;
	}

	public List<Arriendo> getArriendos() {
		return this.arriendos;
	}

	public void setArriendos(List<Arriendo> arriendos) {
		this.arriendos = arriendos;
	}

	public Arriendo addArriendo(Arriendo arriendo) {
		getArriendos().add(arriendo);
		arriendo.setInmueble(this);

		return arriendo;
	}

	public Arriendo removeArriendo(Arriendo arriendo) {
		getArriendos().remove(arriendo);
		arriendo.setInmueble(null);

		return arriendo;
	}

	public List<Distancia> getDistancias() {
		return this.distancias;
	}

	public void setDistancias(List<Distancia> distancias) {
		this.distancias = distancias;
	}

	public Distancia addDistancia(Distancia distancia) {
		getDistancias().add(distancia);
		distancia.setInmueble(this);

		return distancia;
	}

	public Distancia removeDistancia(Distancia distancia) {
		getDistancias().remove(distancia);
		distancia.setInmueble(null);

		return distancia;
	}

	public Propiedad getPropiedad() {
		return this.propiedad;
	}

	public void setPropiedad(Propiedad propiedad) {
		this.propiedad = propiedad;
	}

}
>>>>>>> 1f1063c62e8fcd0ceca738f40833a2c9f9a95b3f
