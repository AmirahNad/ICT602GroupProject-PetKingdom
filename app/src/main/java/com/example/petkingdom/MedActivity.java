package com.example.petkingdom;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class MedActivity extends AppCompatActivity {

    private List<Product> mProductList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.med);

        // Obtain a reference to the product catalog
        mProductList = ShoppingCartHelperM.getCatalog(getResources());

        GridView gridView = findViewById(R.id.gridView);
        gridView.setAdapter(new ImageAdapter(mProductList, getLayoutInflater(), false));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Pass the clicked position to ProductDetailsActivity
                Intent intent = new Intent(getApplicationContext(), ProductDetailsActivity.class);
                if (mProductList instanceof ShoppingCartHelperM) {
                    intent.putExtra(ShoppingCartHelperM.PRODUCT_INDEX, position);
                } else if (mProductList instanceof ShoppingCartHelperA) {
                    intent.putExtra(ShoppingCartHelperA.PRODUCT_INDEX, position);
                } else {
                    intent.putExtra(ShoppingCartHelper.PRODUCT_INDEX, position);
                }
                startActivity(intent);
            }
        });


        Button viewShoppingCart = findViewById(R.id.ButtonViewCart);
        viewShoppingCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewShoppingCartIntent = new Intent(getBaseContext(), ShoppingCartActivity.class);
                startActivity(viewShoppingCartIntent);
            }
        });
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