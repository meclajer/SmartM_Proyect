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
    private String correo;

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

}
