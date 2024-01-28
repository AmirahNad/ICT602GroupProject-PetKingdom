package com.example.petkingdom;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class OrderList extends ArrayAdapter<Order> {
    private Activity context;
    List<Order> orders;
    //Create constructor
    public OrderList(Activity context, List<Order> artists) {
        super(context, R.layout.list_layout, artists);
        this.context = context;
        this.orders = artists;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.list_layout, null, true);
        TextView textViewName = (TextView) listViewItem.findViewById(R.id.textViewName);
        TextView textViewPrice = (TextView) listViewItem.findViewById(R.id.textViewPrice);
        Order order = orders.get(position);
        textViewName.setText(order.getOrderName());
        textViewName.setText(order.getOrderPrice());
        return listViewItem;
    }
}
