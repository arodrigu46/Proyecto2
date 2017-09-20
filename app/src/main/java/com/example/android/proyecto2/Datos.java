package com.example.android.proyecto2;

import java.util.ArrayList;

/**
 * Created by android on 19/09/2017.
 */

public class Datos {
    private static ArrayList<Persona> personas = new ArrayList<>();
    public static void guardar(Persona p){
        personas.add(p);
    }
    public static ArrayList<Persona> obtener(){
        return personas;
    }

}
