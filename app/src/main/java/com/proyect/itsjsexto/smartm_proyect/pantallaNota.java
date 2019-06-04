package com.proyect.itsjsexto.smartm_proyect;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class pantallaNota extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nota);
    }

    //Onclic para abrir activity
    public void abrirActiviti(View view) {

        Intent i;

        switch (view.getId()) {
            case R.id.email_sign_in_button:
                i = new Intent(this, pantallaConMenu.class);
                startActivity(i);
                break;
            case R.id.create_boton:
                i = new Intent(this, pantallaRegistroUsuario.class);
                startActivity(i);
                break;
        }

    }

}
