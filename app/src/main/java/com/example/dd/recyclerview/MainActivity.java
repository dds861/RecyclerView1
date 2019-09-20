package com.example.dd.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    //Create parameter
    List<Product> productList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initialize parameter "productList"
        setInitialData();

        //Find RecyclerView from activity_main.xml
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.list);

        // Create LinearLayoutManager and set it to RecyclerView
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        //Create MyAdapter object with the parameters and set to RecyclerView
        MyAdapter myAdapter = new MyAdapter(this, productList);
        recyclerView.setAdapter(myAdapter);
    }

    private void setInitialData() {
        productList.add(new Product("text1", "text1", R.mipmap.ic_launcher));
        productList.add(new Product("text2", "text2", R.mipmap.ic_launcher));
        productList.add(new Product("text3", "text3", R.mipmap.ic_launcher));
        productList.add(new Product("text4", "text4", R.mipmap.ic_launcher));
        productList.add(new Product("text5", "text5", R.mipmap.ic_launcher));
        productList.add(new Product("text6", "text6", R.mipmap.ic_launcher));
        productList.add(new Product("text7", "text7", R.mipmap.ic_launcher));
        productList.add(new Product("text8", "text8", R.mipmap.ic_launcher));
        productList.add(new Product("text9", "text9", R.mipmap.ic_launcher));
        productList.add(new Product("text10", "text10", R.mipmap.ic_launcher));
    }
}
