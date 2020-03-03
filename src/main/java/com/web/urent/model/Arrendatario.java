package com.web.urent.model;

import javax.persistence.*;

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
