package com.espol;

import java.util.Date;

public class Reserva {
    private String id;
    private Date fechaInicio;
    private Date fechaFin;
    private EstadoReserva estado;
    private double total;

    public boolean crearReserva() { return false; }
    public boolean cancelarReserva() { return false; }
    public double calcularTotal() { return 0.0; }
}
