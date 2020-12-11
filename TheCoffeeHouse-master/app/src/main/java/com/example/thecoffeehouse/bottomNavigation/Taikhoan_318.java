package com.example.thecoffeehouse.bottomNavigation;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.example.thecoffeehouse.Information_318;
import com.example.thecoffeehouse.Login.SignIn_Activity_318;
import com.example.thecoffeehouse.R;


public class Taikhoan_318 extends Fragment implements View.OnClickListener {

    ImageView img_318;
    Button bt1_318, bt2_318;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View r = inflater.inflate(R.layout.fragment_navigation_taikhoan_318, container, false);

        img_318 = r.findViewById(R.id.imageView_318);
        img_318.setOnClickListener(this);

        bt1_318 = r.findViewById(R.id.button2_318);
        bt1_318.setOnClickListener(this);

        bt2_318 = r.findViewById(R.id.button_DangXuat_318);
        bt2_318.setOnClickListener(this);
        return r;
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.imageView_318) {
            Intent dsp = new Intent(Taikhoan_318.this.getActivity(), Information_318.class);
            startActivity(dsp);
        }
        if (v.getId() == R.id.button2_318) {
            Intent dsp = new Intent(Taikhoan_318.this.getActivity(), Information_318.class);
            startActivity(dsp);
        }
        if (v.getId() == R.id.button_DangXuat_318) {
            Intent dsp = new Intent(Taikhoan_318.this.getActivity(), SignIn_Activity_318.class);
            startActivity(dsp);
        }
    }
}