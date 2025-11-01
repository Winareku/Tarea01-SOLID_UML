package com.espol.modelo;

import java.util.ArrayList;
import java.util.List;
import com.espol.interfaces.IPago;
import com.espol.interfaces.INotificacion;
import com.espol.usuarios.Huesped;
import com.espol.usuarios.Anfitrion;

public class Reserva {
    private int id;
    private String fechaInicio;
    private String fechaFin;
    private String estado;

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
}
