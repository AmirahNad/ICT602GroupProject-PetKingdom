package com.example.petkingdom;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class ShoppingCartActivity extends Activity {

    private List<Product> mCartList;
    private ProductAdapter mProductAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shoppingcart);


        mCartList = ShoppingCartHelper.getCartList();

        // Make sure to clear the selections
        for(int i=0; i<mCartList.size(); i++) {
            mCartList.get(i).selected = false;
        }


        // Create the list
        final ListView listViewCatalog = (ListView) findViewById(R.id.ListViewCatalog);
        mProductAdapter = new ProductAdapter(mCartList, getLayoutInflater(), true);
        listViewCatalog.setAdapter(mProductAdapter);

        listViewCatalog.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {
                Intent productDetailsIntent = new Intent(getBaseContext(),ProductDetailsActivity.class);
                productDetailsIntent.putExtra(ShoppingCartHelper.PRODUCT_INDEX, position);
                startActivity(productDetailsIntent);
            }
        });

        Button removeFromCartButton = findViewById(R.id.ButtonRemoveFromCart);
        removeFromCartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                removeSelectedProducts();
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();

        // Refresh the data
        if(mProductAdapter != null) {
            mProductAdapter.notifyDataSetChanged();
        }

        double subTotal = 0;
        for(Product p : mCartList) {
            int quantity = ShoppingCartHelper.getProductQuantity(p);
            subTotal += p.price * quantity;
        }

        TextView productPriceTextView = (TextView) findViewById(R.id.TextViewSubtotal);
        productPriceTextView.setText("Subtotal: RM" + subTotal);
    }

    private void removeSelectedProducts() {
        for (Product product : mCartList) {
            if (product.selected) {
                ShoppingCartHelper.removeProduct(product);
            }
        }

        // Refresh the data and update the UI
        if (mProductAdapter != null) {
            mProductAdapter.notifyDataSetChanged();
        }

        // Recalculate the subtotal after removal
        double subTotal = calculateSubTotal();
        TextView productPriceTextView = findViewById(R.id.TextViewSubtotal);
        productPriceTextView.setText("Subtotal: RM" + subTotal);
    }

    private double calculateSubTotal() {
        double subTotal = 0;
        for (Product p : mCartList) {
            int quantity = ShoppingCartHelper.getProductQuantity(p);
            subTotal += p.price * quantity;
        }
        return subTotal;
    }

    public void openCheckout(View v) {
        Intent i = new Intent(this, CheckoutActivity.class);
        startActivity(i);
    }

}
