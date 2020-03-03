package com.web.urent.model;

import javax.persistence.*;

@Entity
@Table(name = "arrendador")
public class Arrendador {

    private int id_Arrendador;
    private double calificacion;
    private String clave;
    private String correo;
    private String descripcion;
    private int estado;
    private String nombre;
    private String rut_Arrendador;
    private String telefono;

    @Id
    public int getId_Arrendador() {
        return id_Arrendador;
    }

    public void setId_Arrendador(int id_Arrendador) {
        this.id_Arrendador = id_Arrendador;
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

    @Column(name = "rut_Arrendador")
    public String getRut_Arrendador() {
        return rut_Arrendador;
    }

    public void setRut_Arrendador(String rut_Arrendador) {
        this.rut_Arrendador = rut_Arrendador;
    }

    @Column(name = "telefono")
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
