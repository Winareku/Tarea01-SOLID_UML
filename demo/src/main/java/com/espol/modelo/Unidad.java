package com.espol.modelo;

import java.util.ArrayList;
import java.util.List;

public class Unidad {
    private int id;
    private TipoUnidad tipo;
    private EstadoUnidad estado;
    private double precio;
    private int capacidad;

    private List<Reserva> reservas = new ArrayList<>();

    public void cambiarEstado(EstadoUnidad nuevoEstado) {}
    public boolean obtenerDisponibilidad() { return estado == EstadoUnidad.DISPONIBLE; }

    public void actualizarEstado() {}
    public void verificarDisponibilidad() {}
}
