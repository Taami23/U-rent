package com.web.urent.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "propiedad")
public class Propiedad {

    private int id_Propiedad;
    private String fecha_Inicio;
    private String fecha_Termino;
    private Arrendador id_Arrendador;
    private int estado;
    private Inmueble id_Inmueble;

    @Id
    public int getId_Propiedad() {
        return id_Propiedad;
    }

    public void setId_Propiedad(int id_Propiedad) {
        this.id_Propiedad = id_Propiedad;
    }

    @Column(name = "fecha_Inicio")
    public String getFecha_Inicio() {
        return fecha_Inicio;
    }

    public void setFecha_Inicio(String fecha_Inicio) {
        this.fecha_Inicio = fecha_Inicio;
    }

    @Column(name = "fecha_Termino")
    public String getFecha_Termino() {
        return fecha_Termino;
    }

    public void setFecha_Termino(String fecha_Termino) {
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
    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @ManyToOne
    @JoinColumn(name="id_Inmueble")
    public Inmueble getId_Inmueble() {
        return id_Inmueble;
    }

    public void setId_Inmueble(Inmueble id_Inmueble) {
        this.id_Inmueble = id_Inmueble;
    }
}
