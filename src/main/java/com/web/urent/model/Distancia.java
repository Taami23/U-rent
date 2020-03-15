package com.web.urent.model;

import javax.persistence.*;

@Entity
@Table(name = "distancias")
public class Distancia {
    private int idDistancia;
    private Inmueble idInmueble;
    private Sede idSede;
    private int kilometros;
    private int estado;

    @Id
    public int getIdDistancia() {
        return idDistancia;
    }

    public void setIdDistancia(int idDistancia) {
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
    public int getKilometros() {
        return kilometros;
    }

    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }

    @Column(name = "estado")
    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
