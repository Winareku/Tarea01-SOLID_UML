package com.espol;

public class Anfitrion extends Usuario {
    private String politicasCancelacion;

    public boolean establecerReglas() { return false; }
    public boolean calificarExperiencia() { return false; }
    public boolean atenderIncidente() { return false; }
}
