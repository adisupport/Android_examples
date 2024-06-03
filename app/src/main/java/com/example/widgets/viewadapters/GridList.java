package com.example.widgets.viewadapters;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.widgets.adapters.ProductAdapter;
import com.example.widgets.models.ProductModel;
import com.example.widgets.R;

import java.util.ArrayList;

public class GridList extends AppCompatActivity {
    GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_product_list);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        gridView = findViewById(R.id.productlistview);

        ArrayList<ProductModel> productModels = new ArrayList<>();
        productModels.add(new ProductModel("Sntra","Orange"));
        productModels.add(new ProductModel("Naspati","Yellow"));
        productModels.add(new ProductModel("Anar","Red"));
        productModels.add(new ProductModel("Aamrood","Green"));
        productModels.add(new ProductModel("Leechi","Pink"));
        productModels.add(new ProductModel("Mango","Yellow"));

        ProductAdapter productAdapter = new ProductAdapter(getApplicationContext(),productModels);

        gridView.setAdapter(productAdapter);
        gridView.setOnItemClickListener((parent, view, position, id) -> {
            Toast.makeText(getApplicationContext(),productAdapter.getItem(position).getName(),Toast.LENGTH_SHORT).show();
        });


    }
}
