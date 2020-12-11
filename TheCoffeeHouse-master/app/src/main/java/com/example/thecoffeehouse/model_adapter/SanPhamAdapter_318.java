package com.example.thecoffeehouse.model_adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.thecoffeehouse.R;

public class SanPhamAdapter_318 extends ArrayAdapter<DoUong_318> {
    Activity context_318;
    int resource_318;

    public SanPhamAdapter_318(@NonNull Activity context_318, int resource_318) {
        super(context_318, resource_318);
        this.context_318 = context_318;
        this.resource_318 = resource_318;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = this.context_318.getLayoutInflater();
        View customView = inflater.inflate(this.resource_318, null);
        ImageView imghinh = customView.findViewById(R.id.imghinh_318);
        TextView txtten = customView.findViewById(R.id.txtten_318);
        TextView txtgia = customView.findViewById(R.id.txtgia_318);

        DoUong_318 sp = getItem(position);
        imghinh.setImageResource(sp.getHinh());
        txtten.setText(sp.getTen());
        txtgia.setText(sp.getGia() + "đ");

        return customView;


    }
}