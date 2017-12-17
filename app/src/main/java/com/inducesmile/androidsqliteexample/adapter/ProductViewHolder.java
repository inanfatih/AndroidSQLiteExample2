package com.inducesmile.androidsqliteexample.adapter;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.inducesmile.androidsqliteexample.R;

public class ProductViewHolder extends RecyclerView.ViewHolder {

    public TextView name;
    public  ImageView editProduct;

    public ProductViewHolder(View itemView) {
        super(itemView);
        name = (TextView)itemView.findViewById(R.id.product_name);
        editProduct = (ImageView)itemView.findViewById(R.id.edit_product);
    }
}
