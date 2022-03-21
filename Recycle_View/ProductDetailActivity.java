package com.example.recycle_view;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ProductDetailActivity extends AppCompatActivity {

    ImageView imgPrice2;
    TextView txtName2;
    TextView txtPrice2;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.product_detail);

        imgPrice2 =findViewById(R.id.imgProduct2);
        txtName2 = findViewById(R.id.txtName2);
        txtPrice2 = findViewById(R.id.txtPrice2);

        Product product = (Product)getIntent().getSerializableExtra("keyProduct");
//        String name = getIntent().getStringExtra("name");
//        Double price = (Double) getIntent().getDoubleExtra("price", 0);
//        int image = getIntent().getIntExtra("img", 0);

        imgPrice2.setImageResource(product.getImgProduct());
        txtName2.setText(product.getName());
        txtPrice2.setText(String.valueOf(product.getPrice()));

    }
}
