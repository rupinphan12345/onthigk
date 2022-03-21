package com.example.custom_gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gvProductList;
    ProductAdapter productAdapter;
    ArrayList<Product> productList;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gvProductList = (GridView) findViewById(R.id.gvProductList);
        productList = new ArrayList<>();

        productList.add(new Product(R.drawable.donut_red_1,"Donut Red", 20000));
        productList.add(new Product(R.drawable.pink_donut_1,"Donut Pink", 25000));
        productList.add(new Product(R.drawable.donut_yellow_1,"Donut Yellow", 25000 ));
        productList.add(new Product(R.drawable.green_donut_1,"Donut Green", 25000 ));
        productList.add(new Product(R.drawable.tasty_donut_1, "Donut Tasty", 25000));

        productAdapter = new ProductAdapter(this, R.layout.product_list_item, productList);
        gvProductList.setAdapter(productAdapter);


    }
}