package com.espol.usuarios;

import java.util.ArrayList;
import java.util.List;
import com.espol.modelo.Reserva;
import com.espol.modelo.Resena;
import com.espol.modelo.Unidad;
import com.espol.modelo.Propiedad;
import com.espol.pagos.MetodoPago;

public class Huesped extends Usuario {
    private List<Reserva> reservas = new ArrayList<>();
    private List<Resena> resenas = new ArrayList<>();
    private MetodoPago metodoPago;

    public void buscarAlojamiento() {}
    public Reserva reservarUnidad(Unidad unidad) { return null; }

    public List<Propiedad> buscarPropiedades() { return null; }
    public void reportarIncidente() {}
}
