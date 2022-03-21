package com.example.project_custom_listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
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
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout,null);

        TextView txtName = (TextView) view.findViewById(R.id.txtProductName);
        TextView txtDescription = (TextView) view.findViewById(R.id.txtDescription);
        Button btnChat = (Button) view.findViewById(R.id.btnAdd);
        ImageView imgPicture = (ImageView) view.findViewById(R.id.imgPicture);

        Product product = productList.get(i);
        txtName.setText(product.getName());
        txtDescription.setText(product.getDescription());
        imgPicture.setImageResource(product.getPicture());

        return view;
    }
}
