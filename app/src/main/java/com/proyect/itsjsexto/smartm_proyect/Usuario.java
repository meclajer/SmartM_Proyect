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
    private String primerAp;

    @NonNull
    private String segundoAP;

    //constructor


    public Usuario(@NonNull String correo, @NonNull String contraseña, @NonNull String nombre, @NonNull String primerAp, @NonNull String segundoAP) {
        this.correo = correo;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.primerAp = primerAp;
        this.segundoAP = segundoAP;
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
    public String getPrimerAp() {
        return primerAp;
    }

    public void setPrimerAp(@NonNull String primerAp) {
        this.primerAp = primerAp;
    }

    @NonNull
    public String getSegundoAP() {
        return segundoAP;
    }

    public void setSegundoAP(@NonNull String segundoAP) {
        this.segundoAP = segundoAP;
    }
}
