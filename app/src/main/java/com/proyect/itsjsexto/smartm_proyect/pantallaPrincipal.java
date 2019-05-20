package com.proyect.itsjsexto.smartm_proyect;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class pantallaPrincipal extends AppCompatActivity
        implements OnMapReadyCallback {

    //Mapa
    GoogleMap map;

    //
    ListView lista;
    String[] valLista = new String[] {"Checar llantas","Alineacion","Amortiguadores"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.app_bar_pantalla_con_menu);

        //Mapa
        MapFragment mapFragment = (MapFragment) getFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        map.setMapType(GoogleMap.MAP_TYPE_HYBRID);

        //Lista
        lista = (ListView) findViewById(R.id.listviweChequeo);
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,valLista);

        lista.setAdapter(adaptador);

    }

    //Mapa
    @Override
    public void onMapReady(GoogleMap googleMap) {
        map.addMarker(new MarkerOptions()
                .position(new LatLng(22.656689, -103.017238))
                .title("Marker"));

    }

    //Mapa
    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        map.getMaxZoomLevel();
    }

    //Mapa
    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

    }
}
