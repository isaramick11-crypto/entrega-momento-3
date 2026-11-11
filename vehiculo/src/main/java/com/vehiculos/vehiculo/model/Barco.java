package com.vehiculos.vehiculo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "barcos")
public class Barco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "tipo", length = 50)
    private String tipo;

    @Column(name = "capacidad_personas")
    private int capacidadPersonas;

    @Column(name = "eslora")
    private double eslora;

    public Barco() {
    }

    public Barco(Long id, String nombre, String tipo, int capacidadPersonas, double eslora) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.capacidadPersonas = capacidadPersonas;
        this.eslora = eslora;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public int getCapacidadPersonas() { return capacidadPersonas; }
    public void setCapacidadPersonas(int capacidadPersonas) { this.capacidadPersonas = capacidadPersonas; }
    public double getEslora() { return eslora; }
    public void setEslora(double eslora) { this.eslora = eslora; }
}