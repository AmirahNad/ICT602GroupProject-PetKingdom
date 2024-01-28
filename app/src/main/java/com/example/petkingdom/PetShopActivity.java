package com.example.petkingdom;

import android.content.Intent;
import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.io.IOException;
import java.util.List;

public class PetShopActivity extends AppCompatActivity implements OnMapReadyCallback {

    private MapView mapView;
    private GoogleMap googleMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.petshop);

        // Initialize the map view
        mapView = findViewById(R.id.mapView);
        mapView.onCreate(savedInstanceState);
        mapView.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap map) {
        googleMap = map;

        // Example: Add a marker for a nearby shop
        LatLng shopLocation = new LatLng(37.7749, -122.4194);  // Replace with actual coordinates
        googleMap.addMarker(new MarkerOptions().position(shopLocation).title("Pet Shop"));

        // Move the camera to the shop location
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(shopLocation));
        googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(shopLocation, 15));
    }

    public void onMapSearch(View view) {
        EditText locationSearch = findViewById(R.id.editText);
        String location = locationSearch.getText().toString();
        List<Address> addressList = null;
        if (location != null && !location.equals("")) {
            Geocoder geocoder = new Geocoder(this);
            try {
                addressList = geocoder.getFromLocationName(location, 1);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (addressList != null && !addressList.isEmpty()) {
                Address address = addressList.get(0);
                LatLng latLng = new LatLng(address.getLatitude(), address.getLongitude());
                googleMap.addMarker(new MarkerOptions().position(latLng).title("Marker"));
                googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng, 18));
            }
        }
    }


    @Override
    protected void onResume() {
        super.onResume();
        mapView.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mapView.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mapView.onDestroy();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        mapView.onLowMemory();
    }

    public void openHome(View v) {
        Intent i = new Intent(this, HomeActivity.class);
        startActivity(i);
    }
    public void openFood(View v) {
        Intent i = new Intent(this, FoodActivity.class);
        startActivity(i);
    }
    public void openPetShop(View v) {
        Intent i = new Intent(this, PetShopActivity.class);
        startActivity(i);
    }
    public void openMed(View v) {
        Intent i = new Intent(this, MedActivity.class);
        startActivity(i);
    }
    public void openAcc(View v) {
        Intent i = new Intent(this, AccActivity.class);
        startActivity(i);
    }
}
