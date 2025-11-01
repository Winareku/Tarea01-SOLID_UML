package com.espol.usuarios;

import java.util.ArrayList;
import java.util.List;
import com.espol.modelo.Propiedad;
import com.espol.modelo.Resena;

public class Anfitrion extends Usuario {
    private List<Propiedad> propiedades = new ArrayList<>();
    private List<Resena> resenasRecibidas = new ArrayList<>();

    public void gestionarReglas(Propiedad propiedad) {}
    public void responderIncidente() {}
}
