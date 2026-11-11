package com.vehiculos.vehiculo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "aviones")
public class Avion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "modelo", nullable = false, length = 100)
    private String modelo;

    @Column(name = "aerolinea", length = 100)
    private String aerolinea;

    @Column(name = "capacidad_pasajeros")
    private int capacidadPasajeros;

    @Column(name = "velocidad_maxima")
    private int velocidadMaxima;

    public Avion() {
    }

    public Avion(Long id, String modelo, String aerolinea, int capacidadPasajeros, int velocidadMaxima) {
        this.id = id;
        this.modelo = modelo;
        this.aerolinea = aerolinea;
        this.capacidadPasajeros = capacidadPasajeros;
        this.velocidadMaxima = velocidadMaxima;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public String getAerolinea() { return aerolinea; }
    public void setAerolinea(String aerolinea) { this.aerolinea = aerolinea; }
    public int getCapacidadPasajeros() { return capacidadPasajeros; }
    public void setCapacidadPasajeros(int capacidadPasajeros) { this.capacidadPasajeros = capacidadPasajeros; }
    public int getVelocidadMaxima() { return velocidadMaxima; }
    public void setVelocidadMaxima(int velocidadMaxima) { this.velocidadMaxima = velocidadMaxima; }
}
