package com.example.myapplicationone.app_comidas;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetalleActivity extends AppCompatActivity {

    TextView txtNombrePlatillo, txtDescripcionPlatillo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        txtNombrePlatillo = findViewById(R.id.txtNombrePlatillo);
        txtDescripcionPlatillo = findViewById(R.id.txtDescripcionPlatillo);

        Bundle extras = getIntent().getExtras();

        if (extras != null) {
            String nombre = extras.getString("nombre");
            String descripcion = extras.getString("descripcion");
            txtNombrePlatillo.setText(nombre);
            txtDescripcionPlatillo.setText(descripcion);
        }
    }
}