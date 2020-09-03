package com.example.latpindah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class KeduaActivity extends AppCompatActivity {
TextView txtKoper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);
        txtKoper=(TextView)findViewById(R.id.txt_koper);
        Intent datanya=getIntent();
        String tulisannya=datanya.getStringExtra("data1");
        txtKoper.setText(tulisannya);
    }
}
