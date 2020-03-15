package com.web.urent.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "arriendo")
public class Arriendo {

    private int idArriendo;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date fechaInicio;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date fechaTermino;
    private Arrendador id_Arrendador;
    private Arrendatario id_Arrendatario;
    private Inmueble id_Inmueble;
    private int estado;

    @Id
    public int getIdArriendo() {
        return idArriendo;
    }

    public void setIdArriendo(int idArriendo) {
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
    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
