package com.example.widgets.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.widgets.R;
import com.example.widgets.models.ProductModel;

import java.util.ArrayList;

public class ProductAdapter extends ArrayAdapter<ProductModel> {
    Context context;
    public ProductAdapter(Context context,ArrayList<ProductModel> productModelArrayList){
        super(context, R.layout.list_item_layout,productModelArrayList);
        this.context = context;
    }
    private static class ViewHolder{
        TextView productName;
        TextView productDescription;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ProductModel productModel = getItem(position);

        ViewHolder viewHolder;
        final View result;

        if(convertView == null){
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.list_item_layout,parent,false);

            //Finding View
            viewHolder.productName = (TextView) convertView.findViewById(R.id.product_name);
            viewHolder.productDescription = (TextView)convertView.findViewById(R.id.product_description);

            result  = convertView;
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
            result = convertView;
        }
        if(productModel == null){
            return result;
        }
        viewHolder.productName.setText(productModel.getName());
        viewHolder.productDescription.setText(productModel.getDescription());
        return result;
    }
}
