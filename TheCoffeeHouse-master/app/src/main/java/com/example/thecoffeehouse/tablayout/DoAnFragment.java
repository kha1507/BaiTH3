package com.example.thecoffeehouse.tablayout;

import android.app.Dialog;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.thecoffeehouse.R;
import com.example.thecoffeehouse.model_adapter.DoUong_318;
import com.example.thecoffeehouse.model_adapter.SanPhamAdapter_318;

public class DoAnFragment extends Fragment {

    private GridView gvmon_318;
    private SanPhamAdapter_318 spadt_318;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View r = inflater.inflate(R.layout.fragment_do_an_318, container, false);

        gvmon_318 = r.findViewById(R.id.gv_mon_318);
        spadt_318 = new SanPhamAdapter_318(DoAnFragment.this.getActivity(), R.layout.item_318);
        gvmon_318.setAdapter(spadt_318);
        registerForContextMenu(gvmon_318);
        fakeData();
        addEvents();
        return r;
    }
    private void fakeData() {
        spadt_318.add(new DoUong_318(R.drawable.maccasocola, "Socola", "45.000"));
        spadt_318.add(new DoUong_318(R.drawable.mitsay, "Mít sấy", "20.000"));
        spadt_318.add(new DoUong_318(R.drawable.bonglantrungmuoi, "Bông lan trứng muối", "29.000"));
    }
    private void addEvents() {
        gvmon_318.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {

                Dialog dialog = new Dialog(DoAnFragment.this.getActivity());
                dialog.setContentView(R.layout.dilg_dathang_318);
                dialog.show();
            }
        });
        gvmon_318.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Dialog dialog = new Dialog(DoAnFragment.this.getActivity());
                dialog.setContentView(R.layout.dhang_318);
                dialog.show();

                return true;
            }
        });
    }
}