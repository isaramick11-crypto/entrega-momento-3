package com.vehiculos.vehiculo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "motos")
public class Moto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "marca", nullable = false, length = 50)
    private String marca;

    @Column(name = "modelo", length = 50)
    private String modelo;

    @Column(name = "cilindraje")
    private int cilindraje;

    @Column(name = "color", length = 30)
    private String color;

    @Column(name = "placa", nullable = false, unique = true, length = 10)
    private String placa;

    public Moto() {
    }

    public Moto(Long id, String marca, String modelo, int cilindraje, String color, String placa) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.cilindraje = cilindraje;
        this.color = color;
        this.placa = placa;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public int getCilindraje() { return cilindraje; }
    public void setCilindraje(int cilindraje) { this.cilindraje = cilindraje; }
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    public String getPlaca() { return placa; }
    public void setPlaca(String placa) { this.placa = placa; }
}