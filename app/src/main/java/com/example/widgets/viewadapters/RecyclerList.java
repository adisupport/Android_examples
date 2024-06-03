package com.example.widgets.viewadapters;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.widgets.R;
import com.example.widgets.adapters.RecycleAdapter;
import com.example.widgets.models.Item;

import java.util.ArrayList;
import java.util.List;

public class RecyclerList extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_recycler_view);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView = findViewById(R.id.recycle_view);

        List<Item> items = new ArrayList<>();
        items.add(new Item("Title","Description",R.drawable.ic_launcher_foreground));
        items.add(new Item("Title",getString(R.string.sample1),R.drawable.ic_launcher_foreground));
        items.add(new Item("Title",getString(R.string.sample1),R.drawable.ic_launcher_foreground));
        items.add(new Item("Title",getString(R.string.sample1),R.drawable.ic_launcher_foreground));
        items.add(new Item("Title",getString(R.string.sample1),R.drawable.ic_launcher_foreground));
        items.add(new Item("Title",getString(R.string.sample1),R.drawable.ic_launcher_foreground));
        items.add(new Item("Title",getString(R.string.sample1),R.drawable.ic_launcher_foreground));
        items.add(new Item("Title",getString(R.string.sample1),R.drawable.ic_launcher_foreground));
        items.add(new Item("Title","Description",R.drawable.ic_launcher_foreground));

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        RecycleAdapter adapter = new RecycleAdapter(items);
        recyclerView.setAdapter(adapter);
    }
}