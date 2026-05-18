package com.example.myapplicationone.app_comidas;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.ImageView;

public class DetalleActivity extends AppCompatActivity {

    TextView txtNombrePlatillo, txtDescripcionPlatillo;
    ImageView imgPlatillo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        txtNombrePlatillo = findViewById(R.id.txtNombrePlatillo);
        txtDescripcionPlatillo = findViewById(R.id.txtDescripcionPlatillo);
        imgPlatillo = findViewById(R.id.imgPlatillo);
        Bundle extras = getIntent().getExtras();

        if (extras != null) {
            String nombre = extras.getString("nombre");
            String descripcion = extras.getString("descripcion");

            int imagenId = extras.getInt("imagen_id", 0);

            txtNombrePlatillo.setText(nombre);
            txtDescripcionPlatillo.setText(descripcion);

            if (imagenId != 0) {
                imgPlatillo.setImageResource(imagenId);
            }
        }
    }
}