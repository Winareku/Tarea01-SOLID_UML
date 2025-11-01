package com.espol;

import java.util.Date;

public class Notificacion {
    private String id;
    private String mensaje;
    private TipoNotificacion tipo;
    private String destinatario;
    private Date fechaEnvio;

    public boolean enviar() { return false; }
}
