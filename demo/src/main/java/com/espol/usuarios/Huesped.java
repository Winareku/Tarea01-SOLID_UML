package com.espol.usuarios;

import java.util.ArrayList;
import java.util.List;
import com.espol.modelo.Reserva;
import com.espol.modelo.Resena;
import com.espol.modelo.Unidad;

public class Huesped extends Usuario {
    private List<Reserva> reservas = new ArrayList<>();
    private List<Resena> resenas = new ArrayList<>();

    public void buscarAlojamiento() {}
    public Reserva reservarUnidad(Unidad unidad) { return null; }
    public void calificarExperiencia(Reserva reserva) {}
}
