package com.web.urent.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the Arrendador database table.
 * 
 */
@Entity
@NamedQuery(name="Arrendador.findAll", query="SELECT a FROM Arrendador a")
public class Arrendador implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id_Arrendador;

	private double calificacion;

	private String clave;

	private String correo;

	private String descripcion;

	private int estado;

	private String nombre;

	private String rut_Arrendador;

	private String telefono;

	//bi-directional many-to-one association to Arriendo
	@OneToMany(mappedBy="arrendador")
	private List<Arriendo> arriendos;

	//bi-directional many-to-one association to Propiedad
	@OneToMany(mappedBy="arrendador")
	private List<Propiedad> propiedads;

	public Arrendador() {
	}

	public int getId_Arrendador() {
		return this.id_Arrendador;
	}

	public void setId_Arrendador(int id_Arrendador) {
		this.id_Arrendador = id_Arrendador;
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

	public String getRut_Arrendador() {
		return this.rut_Arrendador;
	}

	public void setRut_Arrendador(String rut_Arrendador) {
		this.rut_Arrendador = rut_Arrendador;
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
		arriendo.setArrendador(this);

		return arriendo;
	}

	public Arriendo removeArriendo(Arriendo arriendo) {
		getArriendos().remove(arriendo);
		arriendo.setArrendador(null);

		return arriendo;
	}

	public List<Propiedad> getPropiedads() {
		return this.propiedads;
	}

	public void setPropiedads(List<Propiedad> propiedads) {
		this.propiedads = propiedads;
	}

	public Propiedad addPropiedad(Propiedad propiedad) {
		getPropiedads().add(propiedad);
		propiedad.setArrendador(this);

		return propiedad;
	}

	public Propiedad removePropiedad(Propiedad propiedad) {
		getPropiedads().remove(propiedad);
		propiedad.setArrendador(null);

		return propiedad;
	}

}
