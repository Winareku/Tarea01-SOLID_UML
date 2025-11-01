package com.espol.modelo;

import java.util.ArrayList;
import java.util.List;

public class Propiedad {
    private int id;
    private String direccion;
    private String reglas;

    private List<Unidad> unidades = new ArrayList<>();

    public void agregarUnidad(Unidad unidad) {}
    public void actualizarReglas(String nuevasReglas) {}
}
