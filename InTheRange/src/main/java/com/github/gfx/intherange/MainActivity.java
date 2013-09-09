package com.github.gfx.intherange;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.Menu;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Fragment fragment = getFragmentManager().findFragmentById(R.id.map);
        final GoogleMap map = ((MapFragment) fragment).getMap();
        map.setMyLocationEnabled(true);

        final LatLng mtFujiCoord = new LatLng(35.3580, 138.7310);
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(mtFujiCoord, 10.0f));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
