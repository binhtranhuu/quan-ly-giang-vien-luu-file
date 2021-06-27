package com.example.file_qlgv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class ManGiangVien extends AppCompatActivity {

    ListView lvGiangVien;
    Button btnAddGiangVien;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_giang_vien);

        lvGiangVien = findViewById(R.id.lvGiangVien);
        btnAddGiangVien = findViewById(R.id.btnAddGiangVien);

        btnAddGiangVien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ManGiangVien.this, ManAddGiangVien.class);
                startActivity(intent);
            }
        });
    }
}