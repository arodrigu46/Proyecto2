package com.example.android.proyecto2;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CrearPersonas extends AppCompatActivity {
    private EditText cedula, nombre, apellido;
    private Resources resources;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_personas);
        cedula = (EditText) findViewById(R.id.txtCedula);
        nombre = (EditText) findViewById(R.id.txtNombre);
        apellido = (EditText) findViewById(R.id.txtApellido);
        resources=this.getResources();
    }
    public void guardar(View view){
        String ced,nomb, apell;
        ced = cedula.getText().toString();
        nomb = nombre.getText().toString();
        apell = apellido.getText().toString();
        Persona p = new Persona(ced,nomb,apell);
        p.guardar();
        Toast.makeText(this,resources.getString(R.string.exito1),Toast.LENGTH_SHORT).show();

    }
}
