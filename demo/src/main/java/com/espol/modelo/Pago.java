package com.espol.modelo;

import java.util.Date;
import com.espol.pagos.MetodoPago;

public class Pago {
    private String id;
    private double monto;
    private Date fecha;
    private String estado;
    private MetodoPago metodo;

    public void procesar() {}
    public void reembolsar() {}
    public void procesarPago() {}
}
