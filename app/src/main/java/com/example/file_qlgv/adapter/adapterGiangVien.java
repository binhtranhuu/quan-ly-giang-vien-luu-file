package com.example.file_qlgv.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.file_qlgv.R;
import com.example.file_qlgv.model.B17DCAT023_GiangVien;

import java.util.ArrayList;

public class adapterGiangVien extends BaseAdapter {

    private Context context;
    private ArrayList<B17DCAT023_GiangVien> giangVienArrayList;

    public adapterGiangVien(Context context, ArrayList<B17DCAT023_GiangVien> giangVienArrayList) {
        this.context = context;
        this.giangVienArrayList = giangVienArrayList;
    }

    @Override
    public int getCount() {
        return giangVienArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return giangVienArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.giangvien, null);

        TextView tenSinhVien = (TextView) convertView.findViewById(R.id.tenGiangVien);
        TextView namHocSV = (TextView) convertView.findViewById(R.id.trinhDoGiangVien);

        B17DCAT023_GiangVien giangVien = giangVienArrayList.get(position);

        tenSinhVien.setText(giangVien.getName());
        namHocSV.setText(giangVien.getTrinhdo());

        return convertView;
    }
}
