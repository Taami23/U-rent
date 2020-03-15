package com.web.urent.model;

import javax.persistence.*;

@Entity
@Table(name = "inmueble")
public class Inmueble {

    private int id_Inmueble;
    private int nroHabitaciones;
    private int nroBanos;
    private int wifi;
    private int luz;
    private int agua;
    private int gas;
    private int cocina;
    private int precioMensual;
    private String descripcion;
    private int estacionamiento;
    private int disponibilidad;
    private String direccion;
    private int estado;


    @Id
    // @GeneratedValue(strategy= GenerationType.IDENTITY)
    public int getIdInmueble() {
        return id_Inmueble;
    }

    public void setIdInmueble(int idInmueble) {
        this.id_Inmueble = idInmueble;
    }

    @Column(name="nro_Habitaciones")
    public int getNroHabitaciones() {
        return nroHabitaciones;
    }

    public void setNroHabitaciones(int nroHabitaciones) {
        this.nroHabitaciones = nroHabitaciones;
    }
    @Column(name="nro_Banos")
    public int getNroBanos() {
        return nroBanos;
    }

    public void setNroBanos(int nroBanos) {
        this.nroBanos = nroBanos;
    }

    @Column(name="wifi")
    public int getWifi() {
        return wifi;
    }

    public void setWifi(int wifi) {
        this.wifi = wifi;
    }

    @Column(name="luz")
    public int getLuz() {
        return luz;
    }

    public void setLuz(int luz) {
        this.luz = luz;
    }

    @Column(name="agua")
    public int getAgua() {
        return agua;
    }

    public void setAgua(int agua) {
        this.agua = agua;
    }

    @Column(name="gas")
    public int getGas() {
        return gas;
    }

    public void setGas(int gas) {
        this.gas = gas;
    }

    @Column(name="cocina")
    public int getCocina() {
        return cocina;
    }

    public void setCocina(int cocina) {
        this.cocina = cocina;
    }

    @Column(name="precio_Mensual")
    public int getPrecioMensual() {
        return precioMensual;
    }

    public void setPrecioMensual(int precioMensual) {
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
    public int getEstacionamiento() {
        return estacionamiento;
    }

    public void setEstacionamiento(int estacionamiento) {
        this.estacionamiento = estacionamiento;
    }

    @Column(name="disponibilidad")
    public int getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(int disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    @Column(name="direccion")
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Column(name="estado")
    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

}
