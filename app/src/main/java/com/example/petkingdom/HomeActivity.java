package com.example.petkingdom;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
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

    public void openAboutUs(View v) {
        Intent i = new Intent(this, AboutUsActivity.class);
        startActivity(i);
    }
}
