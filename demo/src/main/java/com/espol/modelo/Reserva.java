package com.espol.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.espol.interfaces.IPago;
import com.espol.interfaces.INotificacion;
import com.espol.usuarios.Huesped;
import com.espol.usuarios.Anfitrion;
import com.espol.modelo.EstadoReserva;

public class Reserva {
    private String id;
    private Date fechaInicio;
    private Date fechaFin;
    private String estado;
    private double total;

    private Unidad unidad;
    private Huesped huesped;
    private Anfitrion anfitrion;

    // Historial de pagos asociados a la reserva
    private List<Pago> pagos = new ArrayList<>();

    // Estrategia de pago (abstracción)
    private IPago metodoPago;

    // Canal de notificación (abstracción)
    private INotificacion canalNotificacion;

    private List<Resena> resenas = new ArrayList<>();

    public void confirmar() {}
    public void cancelar() {}

    public void crearReserva() {}
    public void cancelarReserva() {}
    public double calcularTotal() { return 0.0; }
}
