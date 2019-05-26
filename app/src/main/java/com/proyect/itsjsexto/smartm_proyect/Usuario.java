package com.proyect.itsjsexto.smartm_proyect;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;
@Entity
public class Usuario {
    //variables
    @PrimaryKey
    @NonNull
    private String correo;

    @NonNull
    private String contraseña;

    @NonNull
    private String nombre;

    @NonNull
    private String pAp;

    @NonNull
    private String sAP;

    //constructor
    public Usuario(@NonNull String correo, @NonNull String contraseña, @NonNull String nombre, @NonNull String pAp, @NonNull String sAP) {
        this.correo = correo;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.pAp = pAp;
        this.sAP = sAP;
    }

    //get and set
    @NonNull
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(@NonNull String correo) {
        this.correo = correo;
    }

    @NonNull
    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(@NonNull String contraseña) {
        this.contraseña = contraseña;
    }

    @NonNull
    public String getNombre() {
        return nombre;
    }

    public void setNombre(@NonNull String nombre) {
        this.nombre = nombre;
    }

    @NonNull
    public String getpAp() {
        return pAp;
    }

    public void setpAp(@NonNull String pAp) {
        this.pAp = pAp;
    }

    @NonNull
    public String getsAP() {
        return sAP;
    }

    public void setsAP(@NonNull String sAP) {
        this.sAP = sAP;
    }
}
