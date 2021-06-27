package com.example.file_qlgv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.example.file_qlgv.adapter.adapterGiangVien;
import com.example.file_qlgv.model.B17DCAT023_GiangVien;
import com.example.file_qlgv.storage.FileHelper;

import java.util.ArrayList;

public class ManGiangVien extends AppCompatActivity {

    ListView lvGiangVien;
    Button btnAddGiangVien;

    ArrayList<B17DCAT023_GiangVien> giangVienArrayList;

    adapterGiangVien adapterGiangVien;

    FileHelper fileHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_giang_vien);

        fileHelper = new FileHelper(ManGiangVien.this);
        giangVienArrayList = fileHelper.getData("giangvien.txt");

        lvGiangVien = findViewById(R.id.lvGiangVien);
        btnAddGiangVien = findViewById(R.id.btnAddGiangVien);

        btnAddGiangVien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ManGiangVien.this, ManAddGiangVien.class);
                startActivity(intent);
            }
        });

        Log.e("So luong: ", giangVienArrayList.size() + "");
        adapterGiangVien = new adapterGiangVien(getApplicationContext(), giangVienArrayList);
        lvGiangVien.setAdapter(adapterGiangVien);
    }
}