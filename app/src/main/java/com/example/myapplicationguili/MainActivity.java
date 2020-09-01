package com.example.myapplicationguili;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText edit;
Button boton;
Button boton2;
TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton= findViewById(R.id.BOTON);
        texto=findViewById(R.id.TEXTO);
        edit= findViewById(R.id.EDIT);

    }
    public void Funcion (View Vista){
        /*String variable= edit.getText().toString();
        texto.setText(variable);*/
        Intent actividad2 =new Intent(this,MainActivity2.class);
        startActivityForResult(actividad2, 1);

    }
    /*public void Alerta (View Vista){ //si lo llamo desde un boton (vista)
        // Creo el alert dialog con los widgets para encuestador
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater Inflater = getLayoutInflater();
        View view = Inflater.inflate(R.layout.informacion, null);
        builder.setView(view);
        builder.setCancelable(false); //NO cerrar el alert haciendo click en cualquier lado de la pantalla
        final AlertDialog dialog = builder.create();
        dialog.show();
        final Button cancelar = view.findViewById(R.id.CANCELAR);
        cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });


    }*/
}