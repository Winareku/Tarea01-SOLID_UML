package com.espol.modelo;

import java.util.ArrayList;
import java.util.List;

public class Propiedad {
    private int id;
    private String direccion;
    private String reglas;
    private String ubicacion;
    private List<String> servicios;
    private double precioBase;

    private List<Unidad> unidades = new ArrayList<>();

    public void agregarUnidad(Unidad unidad) {}
    public void actualizarReglas(String nuevasReglas) {}

    public void agregarUnidad() {}
    public List<Unidad> obtenerUnidadesDisponibles() { return null; }
}
