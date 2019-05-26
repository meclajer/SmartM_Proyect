import android.arch.persistence.room.Database;

import com.proyect.itsjsexto.smartm_proyect.DaoAcces;
import com.proyect.itsjsexto.smartm_proyect.DatosMoto;
import com.proyect.itsjsexto.smartm_proyect.Moto;
import com.proyect.itsjsexto.smartm_proyect.Usuario;

@Database(entities = {Usuario.class, Moto.class, DatosMoto.class}, version = 1, exportSchema = false)
public abstract class BaseDatos {
    public abstract DaoAcces daoAccess() ;
}
