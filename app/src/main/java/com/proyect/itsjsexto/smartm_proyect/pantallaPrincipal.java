package com.proyect.itsjsexto.smartm_proyect;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class pantallaPrincipal extends AppCompatActivity
        implements OnMapReadyCallback {

    GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.app_bar_pantalla_con_menu);

        MapFragment mapFragment = (MapFragment) getFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        map.setMapType(GoogleMap.MAP_TYPE_HYBRID);

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map.addMarker(new MarkerOptions()
                .position(new LatLng(22.656689, -103.017238))
                .title("Marker"));

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        map.getMaxZoomLevel();
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

    }
}
