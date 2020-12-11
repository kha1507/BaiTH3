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

public class ThucUongFragment_318 extends Fragment {

    private GridView gvmon_318;
    private SanPhamAdapter_318 spadt_318;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View r = inflater.inflate(R.layout.fragment_pho_bien, container, false);
        gvmon_318 = r.findViewById(R.id.gv_mon_318);
        spadt_318 = new SanPhamAdapter_318(ThucUongFragment_318.this.getActivity(), R.layout.item_318);
        gvmon_318.setAdapter(spadt_318);
        registerForContextMenu(gvmon_318);
        fakeData();
        addEvents();
        return r;
    }
    private void fakeData() {
        spadt_318.add(new DoUong_318(R.drawable.kemdau, "Kem dâu tươi", "15.000"));
        spadt_318.add(new DoUong_318(R.drawable.trasuaday, "Trà sữa dâu tây", "17.000"));
        spadt_318.add(new DoUong_318(R.drawable.tradao , "Trà đào", "20.000"));
        spadt_318.add(new DoUong_318(R.drawable.chanhday, "Nước ép chanh dây", "17.000"));
        spadt_318.add(new DoUong_318(R.drawable.bacxiu1, "Bạc xỉu", "15.000"));
        spadt_318.add(new DoUong_318(R.drawable.caphesua, "Cà phê sữa đá", "17.000"));
        spadt_318.add(new DoUong_318(R.drawable.nuocepcam, "Nước ép cam", "20.000"));
        spadt_318.add(new DoUong_318(R.drawable.cafedenda, "Cà phê đen đá", "15.000"));

    }

    private void addEvents() {
        gvmon_318.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {

                Dialog dialog = new Dialog(ThucUongFragment_318.this.getActivity());
                dialog.setContentView(R.layout.dilg_dathang_318);
                dialog.show();
            }
        });
        gvmon_318.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Dialog dialog = new Dialog(ThucUongFragment_318.this.getActivity());
                dialog.setContentView(R.layout.dhang_318);
                dialog.show();

                return true;
            }
        });
    }
}