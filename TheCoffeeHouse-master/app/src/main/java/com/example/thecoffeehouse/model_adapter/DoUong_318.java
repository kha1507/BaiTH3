package com.example.thecoffeehouse.model_adapter;

import android.widget.ImageView;

import java.io.Serializable;

public class DoUong_318 implements Serializable {
    private int hinh_318;
    private String ten_318;
    private String gia_318;

    public int getHinh() {
        return hinh_318;
    }

    public ImageView setHinh(int hinh_318) {
        this.hinh_318 = hinh_318;
        return null;
    }

    public String getTen() {
        return ten_318;
    }

    public void setTen(String ten) {
        this.ten_318 = ten_318;
    }

    public String getGia() {
        return gia_318;
    }

    public void setGia(String gia) {
        this.gia_318 = gia_318;
    }

    public DoUong_318(int hinh_318, String ten_318, String gia_318) {
        this.hinh_318 = hinh_318;
        this.ten_318 = ten_318;
        this.gia_318= gia_318;
    }

    public DoUong_318() {
    }
}
