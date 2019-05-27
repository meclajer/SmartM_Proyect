package com.proyect.itsjsexto.smartm_proyect;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;
@Entity
public class DatosMoto {

    @PrimaryKey
    @NonNull
    //Debe ser foranea no se como
    private String numSer;

    @NonNull
    private String latitud;

    @NonNull
    private String longitud;

    @NonNull
    private String presion;

    @NonNull
    private String temperatura;

    public DatosMoto( @NonNull String numSer, @NonNull String latitud, @NonNull String longitud, @NonNull String presion, @NonNull String temperatura) {

        this.numSer = numSer;
        this.latitud = latitud;
        this.longitud = longitud;
        this.presion = presion;
        this.temperatura = temperatura;
    }


    @NonNull
    public String getNumSer() {
        return numSer;
    }

    public void setNumSer(@NonNull String numSer) {
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
    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(@NonNull String temperatura) {
        this.temperatura = temperatura;
    }
}
