package com.espol.notificaciones;

import java.util.Date;
import com.espol.modelo.TipoNotificacion;

public class Notificacion {
    private String id;
    private String mensaje;
    private TipoNotificacion tipo;
    private String destinatario;
    private Date fechaEnvio;

    public void enviar() {}
}
