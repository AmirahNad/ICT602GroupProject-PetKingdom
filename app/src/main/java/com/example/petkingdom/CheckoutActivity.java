package com.example.petkingdom;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class CheckoutActivity extends AppCompatActivity {

    private EditText editTextName;
    private EditText editTextPrice;
    private Button buttonAdd;

    List<Order> orderList;
    ListView listViewOrder;
    private DatabaseReference databaseOrder;

    private static final String ORDER_PATH = "orders";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.checkout);

        databaseOrder = FirebaseDatabase.getInstance().getReference(ORDER_PATH);

        editTextName = findViewById(R.id.editTextName);
        editTextPrice = findViewById(R.id.editTextPrice);

        buttonAdd = findViewById(R.id.buttonOrder);

        listViewOrder = (ListView) findViewById(R.id.ListViewOrder);
        orderList = new ArrayList<>();

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addOrder();
            }
        });
    }

    private void addOrder() {
        String name = editTextName.getText().toString().trim();
        String price = editTextPrice.getText().toString().trim();

        if (!TextUtils.isEmpty(name)) {
            if (isValidPrice(price)) {
                String id = databaseOrder.push().getKey();
                Order order = new Order(id, name, price);
                databaseOrder.child(id).setValue(order);
                Toast.makeText(this, "Order added", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(this, "Please enter a valid price", Toast.LENGTH_LONG).show();
            }
        } else {
            Toast.makeText(this, "Please enter a name", Toast.LENGTH_LONG).show();
        }
    }


    private boolean isValidPrice(String price) {
        // Implement your validation logic for the price here.
        // For example, check if it's a valid numeric value.
        // You might want to use regular expressions or other checks.
        // Return true if the price is valid, false otherwise.
        return true;
    }

    protected void onStart() {
        super.onStart();
//attaching value event listener
        databaseOrder.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
//clearing the previous artist list
                orderList.clear();
//iterating through all the nodes
                for (DataSnapshot postSnapshot : dataSnapshot.getChildren()) {
//getting artist
                    Order order = postSnapshot.getValue(Order.class);
//adding artist to the list
                    orderList.add(order);
                }
//creating adapter
                OrderList artistAdapter = new OrderList(CheckoutActivity.this, orderList);
//attaching adapter to the listview
                listViewOrder.setAdapter(artistAdapter);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
            }
        });
    }
}
