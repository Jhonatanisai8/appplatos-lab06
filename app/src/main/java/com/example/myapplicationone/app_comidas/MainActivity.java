
package com.example.myapplicationone.app_comidas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Spinner spinnerDesayunos;

    String[] platillos = {"Selecciona una opción...", "Pan con Chicharrón", "Lomo al Jugo", "Avena con Manzana"};
    String[] descripciones = {
            "",
            "Pan crujiente con trozos de cerdo frito, camote y sarsa criolla.",
            "Saltado de carne jugoso acompañado de pan francés calientito.",
            "Desayuno clásico, ligero y muy nutritivo."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinnerDesayunos = findViewById(R.id.spinnerDesayunos);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, platillos);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerDesayunos.setAdapter(adapter);

        spinnerDesayunos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position > 0) {
                    Intent intent = new Intent(MainActivity.this, DetalleActivity.class);

                    intent.putExtra("nombre", platillos[position]);
                    intent.putExtra("descripcion", descripciones[position]);

                    startActivity(intent);

                    parent.setSelection(0);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }
}