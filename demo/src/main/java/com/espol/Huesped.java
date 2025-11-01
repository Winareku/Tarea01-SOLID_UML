package com.espol;

import java.util.List;

public class Huesped extends Usuario {
    private MetodoPago metodoPago;

    public List<Propiedad> buscarPropiedades() { return null; }
    public boolean reservarUnidad() { return false; }
    public boolean calificarExperiencia() { return false; }
    public boolean reportarIncidente() { return false; }
}
