package com.ejemploinyeccion.inyeccion.component;

import org.springframework.stereotype.Component;

@Component
public class NombreImpl implements Nombre{

    @Override
    public void mostrarNombre() {
        System.out.println("Joel Aldair");
    }
}
