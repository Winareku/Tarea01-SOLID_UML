package com.espol.modelo;

import com.espol.usuarios.Huesped;
import com.espol.usuarios.Anfitrion;

public class Resena {
    private int id;
    private String comentario;
    private int calificacion;

    private Reserva reserva;
    private Huesped autor;
    private Anfitrion receptor;

    public void registrar() {}
}
