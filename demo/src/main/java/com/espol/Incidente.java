package com.espol;

import java.util.Date;

public class Incidente {
    private String id;
    private String descripcion;
    private EstadoIncidente estado;
    private String prioridad;
    private Date fechaReporte;

    public boolean reportarIncidente() { return false; }
    public boolean escalarIncidente() { return false; }
}
