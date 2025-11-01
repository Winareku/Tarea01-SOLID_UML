package com.espol;

import java.util.List;

public class Propiedad {
    private String id;
    private String ubicacion;
    private List<String> servicios;
    private double precioBase;

    public boolean agregarUnidad() { return false; }
    public List<Unidad> obtenerUnidadesDisponibles() { return null; }
}
