package com.web.urent.model;

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
