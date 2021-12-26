package com.example.locationtrack1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements LocationListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onLocationChanged(@NonNull Location location) {

    }
    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {

    }

}