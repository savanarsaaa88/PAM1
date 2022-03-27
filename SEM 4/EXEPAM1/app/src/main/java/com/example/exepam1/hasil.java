package com.example.exepam1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class hasil extends AppCompatActivity {

    TextView txMT, txJT, txTT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hasil);
        txMT = findViewById(R.id.edHt);
        txJT = findViewById(R.id.edHjt);
        txTT = findViewById(R.id.edHtt);

        Bundle bundle = getIntent().getExtras();
        String tugas = bundle.getString("a");
        String jenis = bundle.getString("b");
        String lama = bundle.getString("c");

        txMT.setText(tugas);
        txJT.setText(jenis);
        txTT.setText(lama);
    }}