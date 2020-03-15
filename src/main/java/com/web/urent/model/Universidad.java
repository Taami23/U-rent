package com.web.urent.model;

import javax.persistence.*;

@Entity
@Table(name = "universidad")
public class Universidad {
    private int id_Universidad;
    private String nombre;
    private int estado;

    @Id
    @Column(name = "id_Universidad")
    public Integer getIdUniversidad() {
        return id_Universidad;
    }

    public void setIdUniversidad(Integer idUniversidad) {
        this.id_Universidad = idUniversidad;
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
