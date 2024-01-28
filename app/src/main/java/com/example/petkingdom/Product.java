package com.example.petkingdom;

import android.graphics.drawable.Drawable;

public class Product {

    public String title;
    public Drawable productImage;
    public String description;
    public double price;
    public boolean selected;

    public Product(String title, Drawable productImage, String description, double price) {
        this.title = title;
        this.productImage = productImage;
        this.description = description;
        this.price = price;
    }

    // Add this method to get the image resource ID
    public int getImageResourceId() {
        if (productImage != null && productImage instanceof android.graphics.drawable.BitmapDrawable) {
            return ((android.graphics.drawable.BitmapDrawable) productImage).getBitmap().getGenerationId();
        }
        return 0; // Return a default value or handle the case when no image is set
    }

}