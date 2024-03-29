package com.example.petkingdom;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AccAdapter extends BaseAdapter {

    private List<Product> mProductList;
    private LayoutInflater mInflater;
    private boolean mShowQuantity;

    public AccAdapter(List<Product> list, LayoutInflater inflater, boolean showQuantity) {
        mProductList = list;
        mInflater = inflater;
        mShowQuantity = showQuantity;
    }

    @Override
    public int getCount() {
        return mProductList.size();
    }

    @Override
    public Object getItem(int position) {
        return mProductList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final AccAdapter.ViewItem item;

        if (convertView == null) {
            // Determine which layout to inflate based on mShowQuantity flag
            int layoutId = mShowQuantity ? R.layout.item : R.layout.grid_item;
            convertView = mInflater.inflate(layoutId, null);

            item = new AccAdapter.ViewItem();
            item.productImageView = convertView.findViewById(R.id.ImageViewItem);
            item.productTitle = convertView.findViewById(R.id.TextViewItem);

            if (mShowQuantity) {
                item.productQuantity = convertView.findViewById(R.id.textViewQuantity);
            }

            convertView.setTag(item);
        } else {
            item = (AccAdapter.ViewItem) convertView.getTag();
        }

        Product curProduct = mProductList.get(position);

        item.productImageView.setImageDrawable(curProduct.productImage);
        item.productTitle.setText(curProduct.title);

        // Show the quantity in the cart or not
        if (mShowQuantity) {
            item.productQuantity.setText("Quantity: " + ShoppingCartHelper.getProductQuantity(curProduct));
        }

        return convertView;
    }

    private class ViewItem {
        ImageView productImageView;
        TextView productTitle;
        TextView productQuantity;  // This TextView is present only in item.xml
    }
}
