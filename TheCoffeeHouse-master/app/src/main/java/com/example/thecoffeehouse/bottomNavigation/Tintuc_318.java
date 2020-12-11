package com.example.thecoffeehouse.bottomNavigation;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.thecoffeehouse.Information_318;
import com.example.thecoffeehouse.Notify_318;
import com.example.thecoffeehouse.R;

public class Tintuc_318 extends Fragment implements View.OnClickListener {

    ImageView img1_318, img2_318;
    RelativeLayout rl1_318, rl2_318, rl3_318;

    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View root = inflater.inflate(R.layout.fragment_navigation_tintuc_318, container, false);


        img1_318 = root.findViewById(R.id.imageNotify_318);
        img1_318.setOnClickListener(this);
        img2_318 = root.findViewById(R.id.imageAdd_318);
        img2_318.setOnClickListener(this);
//        img.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                open();
//            }
//        });

        rl1_318 = root.findViewById(R.id.relativeTichdiem_318);
        rl2_318 = root.findViewById(R.id.relativeDathang_318);
        rl3_318 = root.findViewById(R.id.relativeCoupon);
        rl1_318.setOnClickListener(this);
        rl2_318.setOnClickListener(this);
        rl3_318.setOnClickListener(this);

//        rl1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                onClick(v);
//            }
//        });
//
//        rl2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//               inflater.inflate(R.layout.fragment_navigation_dathang,container,false);
//
//            }
//        });
//
//        rl3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                onClick(v);
//            }
//        });

        return root;
    }

//    public void open() {
//        Intent dsp = new Intent(Tintuc.this.getActivity(), Notify.class);
//        startActivity(dsp);
//    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.imageNotify_318) {
            Intent dsp = new Intent(Tintuc_318.this.getActivity(), Notify_318.class);
            startActivity(dsp);
        }
        if (v.getId() == R.id.imageAdd_318) {
            Intent dsp = new Intent(Tintuc_318.this.getActivity(), Information_318.class);
            startActivity(dsp);
        }
        if (v.getId() == R.id.relativeTichdiem_318) {
            Toast.makeText(this.getActivity(), "Tích điểm", Toast.LENGTH_SHORT).show();
        }
        if (v.getId() == R.id.relativeDathang_318) {
            Toast.makeText(this.getActivity(), "Đặt hàng ", Toast.LENGTH_SHORT).show();
        }
        if (v.getId() == R.id.relativeCoupon) {
            Toast.makeText(this.getActivity(), "Coupon", Toast.LENGTH_SHORT).show();
        }
    }


}