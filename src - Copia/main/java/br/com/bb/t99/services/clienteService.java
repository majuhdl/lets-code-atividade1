package br.com.bb.t99.services;

import java.time.LocalTime;

public class clienteService {

    public static LocalTime horario() {
        LocalTime hora= LocalTime.now();
        return hora;
    }
    
}
