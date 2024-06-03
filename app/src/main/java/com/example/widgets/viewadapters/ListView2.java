package com.example.widgets.viewadapters;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.widgets.R;
import com.example.widgets.adapters.ListView2Adapter;
import com.example.widgets.models.ItemModels2;

import java.util.ArrayList;
import java.util.List;

public class ListView2 extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_list_view2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        listView = findViewById(R.id.listView2);
        List<ItemModels2> items = new ArrayList<>();
        items.add(new ItemModels2("Title1",getString(R.string.sample1),R.drawable.ic_launcher_foreground));
        items.add(new ItemModels2("Title2",getString(R.string.sample1),R.drawable.circular_shape));
        items.add(new ItemModels2("Title3",getString(R.string.sample1),R.drawable.circular_shape));
        items.add(new ItemModels2("Title4",getString(R.string.sample1),R.drawable.circular_shape));
        items.add(new ItemModels2("Title5",getString(R.string.sample1),R.drawable.circular_shape));
        items.add(new ItemModels2("Title6",getString(R.string.sample1),R.drawable.circular_shape));
        items.add(new ItemModels2("Title6",getString(R.string.sample1),R.drawable.circular_shape));
        items.add(new ItemModels2("Title6",getString(R.string.sample1),R.drawable.circular_shape));
        items.add(new ItemModels2("Title6",getString(R.string.sample1),R.drawable.circular_shape));
        items.add(new ItemModels2("Title6",getString(R.string.sample1),R.drawable.circular_shape));
        items.add(new ItemModels2("Title6",getString(R.string.sample1),R.drawable.circular_shape));
        items.add(new ItemModels2("Title6",getString(R.string.sample1),R.drawable.circular_shape));
        items.add(new ItemModels2("Title6",getString(R.string.sample1),R.drawable.circular_shape));
        items.add(new ItemModels2("Title6",getString(R.string.sample1),R.drawable.circular_shape));
        items.add(new ItemModels2("Title6",getString(R.string.sample1),R.drawable.circular_shape));
        items.add(new ItemModels2("Title6",getString(R.string.sample1),R.drawable.circular_shape));
        items.add(new ItemModels2("Title6",getString(R.string.sample1),R.drawable.ic_launcher_foreground));

        //Adapter
        ListView2Adapter adapter = new ListView2Adapter(getApplicationContext(),items);
        listView.setAdapter(adapter);
    }
}