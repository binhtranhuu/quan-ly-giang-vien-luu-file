package com.example.file_qlgv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnGiangVien, btnChuyenMon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGiangVien = findViewById(R.id.btnGiangVien);
        btnChuyenMon = findViewById(R.id.btnChuyenMon);

        btnGiangVien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ManGiangVien.class);
                startActivity(intent);
            }
        });

        btnChuyenMon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ManChuyenMon.class);
                startActivity(intent);
            }
        });
    }
}