package com.example.formularioregistro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //
    EditText etNombre, etClave, etCorreo, etPhone;
    Button btnGrabar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //crear las referencias
        etNombre = findViewById(R.id.etNombre);
        etClave = findViewById(R.id.etClave);
        etCorreo = findViewById(R.id.etCorreo);
        etPhone = findViewById(R.id.etTelefono);

        //crear referencias al boton
        btnGrabar = findViewById(R.id.btnGrabar);

        btnGrabar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //metodo click del boton
                String Cadena = "";
                //Almaceno en cadena el contenido etNombre
                Cadena = etNombre.getText().toString() + "+ Telefono:" + etPhone.getText().toString();
                //mensaje en pantalla
                Toast.makeText(MainActivity.this,
                        Cadena,
                        Toast.LENGTH_LONG).show();
            }
        });
    }


}