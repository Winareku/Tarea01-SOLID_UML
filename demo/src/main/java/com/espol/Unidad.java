package com.espol;

public class Unidad {
    private String id;
    private TipoUnidad tipo;
    private EstadoUnidad estado;
    private double precio;
    private int capacidad;

    public boolean actualizarEstado() { return false; }
    public boolean verificarDisponibilidad() { return false; }
}
