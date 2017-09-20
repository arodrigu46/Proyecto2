package com.example.android.proyecto2;

import android.widget.Toast;

/**
 * Created by android on 19/09/2017.
 */

public class Persona {
    private String cedula;
    private String nombre;
    private String Apellido;

    public Persona(String cedula, String nombre, String apellido) {
        this.cedula = cedula;
        this.nombre = nombre;
        Apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public void guardar(){
        Datos.guardar(this);
    }
}
