package com.espol.usuarios;

public abstract class Usuario {
    protected int id;
    protected String nombre;
    protected String email;
    protected String metodoContacto;

    public void iniciarSesion() {}
    public void cerrarSesion() {}
    public void autenticar() {}
    public void calificarExperiencia() {}
}
