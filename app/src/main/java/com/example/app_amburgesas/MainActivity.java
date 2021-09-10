package com.example.app_amburgesas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    int ur[]= {R.drawable.hconfideitos, R.drawable.hconhuevo, R.drawable.hdoble, R.drawable.hgemelas, R.drawable.hmariajuana, R.drawable.hmediokilo, R.drawable.hnormal, R.drawable.hpollo, R.drawable.hvegetal};
    String th[]={"comida 1","comida 2","comida 3","comida 4","comida 5","comida 6","comida 7","comida 8","comida 9"};
    double ph[]={12,18,13.5,15,18, 21, 25, 15, 12};
    int cat[]={0,0,0,0,0,0,0,0,0};
    int contador=0;
    int cantidad=1;
    double costo=1;
    ArrayList<VectorComidas> listaComidas = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imgAmburgesa   =   (ImageView) findViewById(R.id.imagenAmburgesa);
        imgAmburgesa.setImageResource(ur[contador]);
        TextView textAmburgesa= findViewById(R.id.nombreAmburgesa);
        textAmburgesa.setText(th[contador] +" Precio: "+ ph[contador]);
    }


    public void Comprar(View view){
        TextView nroAmburgesa= findViewById(R.id.nroCantidad);
        TextView preAmburgesa= findViewById(R.id.numPrecio);
        cat[contador]++;
        nroAmburgesa.setText(cat[contador]+"");
        preAmburgesa.setText((cat[contador]*ph[contador])+"");
        cantidad=cat[contador];
        costo=cat[contador]*ph[contador];

        VectorComidas vectorComidas= new VectorComidas(th[contador], cantidad, costo);
        listaComidas.add(vectorComidas);
    }

    public void Devolver(View view) {
        TextView nroAmburgesa= findViewById(R.id.nroCantidad);
        TextView preAmburgesa= findViewById(R.id.numPrecio);
        cat[contador]--;
        if (cat[contador]<0){ cat[contador]=0;}
        nroAmburgesa.setText(cat[contador]+"");
        preAmburgesa.setText((cat[contador]*ph[contador])+"");
        cantidad=cat[contador];
        costo=cat[contador]*ph[contador];

        VectorComidas vectorComidas= new VectorComidas(th[contador], cantidad, costo);
        listaComidas.remove(vectorComidas);
    }

    public void Isquierda(View view) {
        ImageView imgAmburgesa   =   (ImageView) findViewById(R.id.imagenAmburgesa);
        TextView textAmburgesa= findViewById(R.id.nombreAmburgesa);
        TextView nroAmburgesa= findViewById(R.id.nroCantidad);
        TextView preAmburgesa= findViewById(R.id.numPrecio);
        contador--;
        if (contador<0){
            contador=ur.length-1;
        }
        imgAmburgesa.setImageResource(ur[contador]);
        textAmburgesa.setText(th[contador] +" Precio: "+ ph[contador]);
        nroAmburgesa.setText(cat[contador]+"");
        preAmburgesa.setText((cat[contador]*ph[contador])+"");
    }

    public void Derecha(View view) {
        ImageView imgAmburgesa   =   (ImageView) findViewById(R.id.imagenAmburgesa);
        TextView textAmburgesa= findViewById(R.id.nombreAmburgesa);
        TextView nroAmburgesa= findViewById(R.id.nroCantidad);
        TextView preAmburgesa= findViewById(R.id.numPrecio);
        contador++;
        if (contador==(ur.length)){
            contador=0;
        }
        imgAmburgesa.setImageResource(ur[contador]);
        textAmburgesa.setText(th[contador] +" Precio: "+ ph[contador]);
        nroAmburgesa.setText(cat[contador]+"");
        preAmburgesa.setText((cat[contador]*ph[contador])+"");

    }

    public void finalizarCompra(View view) {
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        intent.putExtra("listaComidas", listaComidas);
        startActivity(intent);
    }
}
