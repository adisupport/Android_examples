package com.example.widgets.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.widgets.R;
import com.example.widgets.models.ItemModels2;

import org.w3c.dom.Text;

import java.util.List;

public class ListView2Adapter extends ArrayAdapter<ItemModels2> {
    Context context;
    public ListView2Adapter(@NonNull Context context, List<ItemModels2> items) {
        super(context, R.layout.list_item_layout2,items);
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder viewHolder;
        if(convertView == null){
            viewHolder = new ViewHolder();
            convertView = LayoutInflater.from(context).inflate(R.layout.list_item_layout2,parent,false);
            viewHolder.imageView = convertView.findViewById(R.id.list_item_2_image);
            viewHolder.description = convertView.findViewById(R.id.list_item_2_description);
            viewHolder.title =  convertView.findViewById(R.id.list_item_2_title);

            convertView.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.setAll(getItem(position));
        return convertView;
    }
    public static class ViewHolder{
        TextView title;
        TextView description;

        ImageView imageView;
        public void setAll(ItemModels2 item){
            if(item == null){
                return;

            }
            if(item.getTitle()!= null){
                this.title.setText(item.getTitle());
            }
            if(item.getDescription()!= null){
                this.description.setText(item.getDescription());
            }
            this.imageView.setImageResource(item.getImageId());
        }
    }
}
