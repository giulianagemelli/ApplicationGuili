package com.example.myapplicationguili;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    ImageButton infoboton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        infoboton= findViewById(R.id.INFOBOTON);
    }
    public void Inodoro (View Vista) { //si lo llamo desde un boton (vista)
        // Creo el alert dialog con los widgets para encuestador
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater Inflater = getLayoutInflater();
        View view = Inflater.inflate(R.layout.informacion, null); //nombre del alert que quiero mostrar
        builder.setView(view);
        //builder.setCancelable(false); //NO cerrar el alert haciendo click en cualquier lado de la pantalla
        final AlertDialog dialog = builder.create();
        dialog.show(); //mostrar
        final TextView inodoro = view.findViewById(R.id.INFOTEXT);
        inodoro.setText(getString(R.string.inodoro)+ "\n" + "\n"+ getString(R.string.inodoro2));
    }

    public void TipodeCasa (View Vista) { //si lo llamo desde un boton (vista)
        // Creo el alert dialog con los widgets para encuestador
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater Inflater = getLayoutInflater();
        View view = Inflater.inflate(R.layout.informacion, null); //nombre del alert que quiero mostrar
        builder.setView(view);
        //builder.setCancelable(false); //NO cerrar el alert haciendo click en cualquier lado de la pantalla
        final AlertDialog dialog = builder.create();
        dialog.show(); //mostrar
        final TextView casa = view.findViewById(R.id.INFOTEXT);
        casa.setText(getString(R.string.casilla) + "\n"+ "\n" + getString(R.string.rancho) + "\n" + "\n"+ getString(R.string.local) + "\n"+ "\n" + getString(R.string.movil));
    }
}