package com.proyect.itsjsexto.smartm_proyect;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = {Usuario.class, Moto.class, DatosMoto.class}, version = 1, exportSchema = false)
public abstract class BaseDatos extends RoomDatabase {
    public abstract DaoAcces daoAccess() ;
}
