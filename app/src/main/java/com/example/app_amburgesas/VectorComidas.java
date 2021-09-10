package com.example.app_amburgesas;

import android.view.View;

import java.util.List;

public class VectorComidas {

    String nombre;
    int cantidad;
    double costo;

    VectorComidas(String nombree, int cantidadd, double costos ){
        this.nombre=nombree;
        this.cantidad= cantidadd;
        this.costo=costos;
    }

    public String getNombre() {
        return nombre;
    }
    public int getCantidad() {
        return cantidad;
    }
    public double getCosto(){
        return costo;
    }

}
