package com.example.dd.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    //Create 2 parameters
    Context context;
    List<Product> productList;

    //Create constructor
    public MyAdapter(Context context, List<Product> productList) {
        this.context = context;
        this.productList = productList;
    }

    //Create LayoutInflater and return it as a parameter to ViewHolder
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        return new ViewHolder(layoutInflater, parent);
    }

    //bind Object
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Product product = productList.get(position);
        holder.bind(product);
    }

    //return size of list
    @Override
    public int getItemCount() {
        return productList.size();
    }

    ///////////////////////////////////////////////////////////////////////////
    // ViewHolder
    ///////////////////////////////////////////////////////////////////////////

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private ImageView mImageView;
        private TextView mTextView;
        private TextView mTextView2;
        private Product product;

        //Create Constructor wit hthe following parameters
        public ViewHolder(LayoutInflater inflater, ViewGroup parent) {
            super(inflater.inflate(R.layout.items, parent, false));
            this.mImageView = itemView.findViewById(R.id.imageView);
            this.mTextView = itemView.findViewById(R.id.textView);
            this.mTextView2 = itemView.findViewById(R.id.textView2);

            itemView.setOnClickListener(this);
        }

        //this method will bind views
        public void bind(Product product) {
            this.product = product;

            mTextView.setText(product.getText1());
            mTextView2.setText(product.getText2());
            mImageView.setImageResource(product.getImage());
        }

        //Toast will appear on item click
        @Override
        public void onClick(View view) {
            Toast.makeText(context, product.getText1() + " clicked!", Toast.LENGTH_SHORT).show();
        }
    }
}
