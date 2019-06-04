package com.proyect.itsjsexto.smartm_proyect;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;
@Entity
public class DatosMoto {

    @PrimaryKey
    @NonNull
    private int id;

    private String numSer;

    @NonNull
    private String latitud;

    @NonNull
    private String longitud;

    @NonNull
    private String presion;

    @NonNull
    private String presion2;

    @NonNull
    private String temperatura;

    private String nota;

    public DatosMoto(int id, String numSer, @NonNull String latitud, @NonNull String longitud, @NonNull String presion, @NonNull String presion2, @NonNull String temperatura, String nota) {
        this.id = id;
        this.numSer = numSer;
        this.latitud = latitud;
        this.longitud = longitud;
        this.presion = presion;
        this.presion2 = presion2;
        this.temperatura = temperatura;
        this.nota = nota;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumSer() {
        return numSer;
    }

    public void setNumSer(String numSer) {
        this.numSer = numSer;
    }

    @NonNull
    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(@NonNull String latitud) {
        this.latitud = latitud;
    }

    @NonNull
    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(@NonNull String longitud) {
        this.longitud = longitud;
    }

    @NonNull
    public String getPresion() {
        return presion;
    }

    public void setPresion(@NonNull String presion) {
        this.presion = presion;
    }

    @NonNull
    public String getPresion2() {
        return presion2;
    }

    public void setPresion2(@NonNull String presion2) {
        this.presion2 = presion2;
    }

    @NonNull
    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(@NonNull String temperatura) {
        this.temperatura = temperatura;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }
}
