package com.example.phandinhnhat_lab5;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.Serializable;
import java.util.List;

public class FoodAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Food> foodList;

    public FoodAdapter(Context context, int layout, List<Food> foodList) {
        this.context = context;
        this.layout = layout;
        this.foodList = foodList;
    }


    @Override
    public int getCount() {
        return foodList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(layout, null);
        TextView txtName = (TextView) convertView.findViewById(R.id.txtName2);
        TextView txtPrice = (TextView) convertView.findViewById(R.id.txtPrice2);
        ImageButton btnBuy =   (ImageButton) convertView.findViewById(R.id.btnBuy);
        ImageView imgFood = (ImageView) convertView.findViewById(R.id.imgPicture2);

        Food food = foodList.get(i);
        txtName.setText(food.getName());
        txtPrice.setText("$" + String.valueOf(food.getPrice()));
        imgFood.setImageResource(food.getImg());


        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, FoodDetailActivity.class);
//                intent.putExtra("foodKey", (Serializable) food);
                intent.putExtra("img", food.getImg());
                intent.putExtra("name", food.getName());
                intent.putExtra("price", food.getPrice());

                context.startActivity(intent);

            }
        });

        return convertView;

    }


}
