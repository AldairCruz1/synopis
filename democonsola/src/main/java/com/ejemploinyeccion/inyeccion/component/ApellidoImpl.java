package com.ejemploinyeccion.inyeccion.component;

import org.springframework.stereotype.Component;

@Component
public class ApellidoImpl implements Nombre{


    @Override
    public void mostrarNombre() {
        System.out.println("Cruz Quiñones");
    }
}
