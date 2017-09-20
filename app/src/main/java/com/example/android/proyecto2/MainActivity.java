package com.example.android.proyecto2;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.security.Principal;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView lv;
    private Resources resources;
    private String opc[];
    private Intent in;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        setContentView(R.layout.activity_main);
        super.onCreate(savedInstanceState);
        lv = (ListView) findViewById(R.id.Opciones);
        resources=this.getResources();
        opc = resources.getStringArray(R.array.Opciones);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,opc);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                switch (i){
                    case 0:
                        in = new Intent(MainActivity.this,CrearPersonas.class);
                        startActivity(in);
                        break;
                    case 1:
                         in = new Intent(MainActivity.this,ListarPersonas.class);
                         startActivity(in);
                        break;
                }
            }
        });
    }
}
