package com.espol.usuarios;

public abstract class Usuario {
    protected int id;
    protected String nombre;
    protected String email;

    public void iniciarSesion() {}
    public void cerrarSesion() {}
}
