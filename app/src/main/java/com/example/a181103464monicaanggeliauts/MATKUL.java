package com.example.a181103464monicaanggeliauts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MATKUL extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matkul);
    }

    public void Keluar(View view) {
        Intent intent = new Intent(MATKUL.this, MainActivity.class);
        startActivity(intent);
    }
}