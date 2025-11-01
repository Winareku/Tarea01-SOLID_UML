package com.espol;

import java.util.Date;

public class Pago {
    private String id;
    private double monto;
    private Date fecha;
    private String estado;
    private MetodoPago metodo;

    public boolean procesarPago() { return false; }
    public boolean reembolsar() { return false; }
}
