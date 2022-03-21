package com.example.custom_gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ProductAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<Product> productList;

    public ProductAdapter(Context context, int layout, List<Product> productList) {
        this.context = context;
        this.layout = layout;
        this.productList = productList;
    }

    @Override
    public int getCount() {
        return productList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = layoutInflater.inflate(layout, null);

        ImageView imgProduct = (ImageView) view.findViewById(R.id.imgProduct);
        TextView txtProductName = (TextView) view.findViewById(R.id.txtProductName);
        TextView txtPrice = (TextView) view.findViewById(R.id.txtPrice);

        Product product = productList.get(i);

        imgProduct.setImageResource(product.getImg());
        txtProductName.setText(product.getName());
        txtPrice.setText(product.getPrice() + "$");

        return view;
    }
}
