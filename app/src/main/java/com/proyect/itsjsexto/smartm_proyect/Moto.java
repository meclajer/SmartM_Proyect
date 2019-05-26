package com.proyect.itsjsexto.smartm_proyect;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;
@Entity
public class Moto {
    @PrimaryKey
    @NonNull
    private String numSer;


    @NonNull
    private String marca;

    @NonNull
    private String modelo;


    @NonNull
    private String placas;

    //constructor
    public Moto(@NonNull String numSer, @NonNull String marca, @NonNull String modelo, @NonNull String placas) {
        this.numSer = numSer;
        this.marca = marca;
        this.modelo = modelo;
        this.placas = placas;
    }

    //get and set
    @NonNull
    public String getNumSer() {
        return numSer;
    }

    public void setNumSer(@NonNull String numSer) {
        this.numSer = numSer;
    }

    @NonNull
    public String getMarca() {
        return marca;
    }

    public void setMarca(@NonNull String marca) {
        this.marca = marca;
    }

    @NonNull
    public String getModelo() {
        return modelo;
    }

    public void setModelo(@NonNull String modelo) {
        this.modelo = modelo;
    }

    @NonNull
    public String getPlacas() {
        return placas;
    }

    public void setPlacas(@NonNull String placas) {
        this.placas = placas;
    }
}
