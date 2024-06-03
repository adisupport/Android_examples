package com.example.widgets;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.widgets.viewadapters.GridList;
import com.example.widgets.viewadapters.ListActivity;
import com.example.widgets.viewadapters.ListView2;
import com.example.widgets.viewadapters.RecyclerList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activitylist,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();
        Intent i = new Intent(this, MainActivity.class);
        if(itemId == R.id.progress_activity){
            i = new  Intent(this,ProgressWidget.class);
        }else if(itemId == R.id.listview_menu){
            i = new Intent(this, ListActivity.class);
        }else if(itemId == R.id.product_list){
            i = new Intent(this, GridList.class);
        }else if(itemId == R.id.listview2_menu){
            i = new Intent(this, ListView2.class);
        }
        else if(itemId == R.id.recycler_view_menu){
            i = new Intent(this, RecyclerList.class);
        }
        startActivity(i);
        return true;
    }
}