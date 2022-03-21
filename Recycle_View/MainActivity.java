package com.example.recycle_view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.io.Serializable;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements OnClickListener{

    RecyclerView rcProductList;
//    ProductAdapter productAdapter;
    ArrayList<Product> productList;
    ProductAdapterNew productAdapterNew;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcProductList = (RecyclerView) findViewById(R.id.rcProductList);
        productList = new ArrayList<>();

        productList.add(new Product(R.drawable.donut_red_1,"Donut Red", 20000 ));
        productList.add(new Product(R.drawable.pink_donut_1,"Donut Pink", 25000 ));
        productList.add(new Product(R.drawable.donut_yellow_1,"Donut Yellow", 25000 ));
        productList.add(new Product(R.drawable.green_donut_1,"Donut Green", 25000 ));
        productList.add(new Product(R.drawable.tasty_donut_1,"Donut Tasty", 25000 ));

//        productAdapter = new ProductAdapter(this, R.layout.product_list_item, productList);
//        rcProductList.setAdapter(productAdapter);

        productAdapterNew = new ProductAdapterNew(productList, this);
        rcProductList.setHasFixedSize(true);
        rcProductList.setAdapter(productAdapterNew);
        rcProductList.setLayoutManager(new GridLayoutManager(this, 2));
    }

    @Override
    public void itemClick(Product product) {
        Intent intent= new Intent(MainActivity.this, ProductDetailActivity.class);
        intent.putExtra("keyProduct", product);
//        intent.putExtra("img", product.getImgProduct());
//        intent.putExtra("name", product.getName());
//        intent.putExtra("price", product.getPrice());
        startActivity(intent);
    }
}