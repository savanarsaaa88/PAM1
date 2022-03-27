package com.example.exepam1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Home extends AppCompatActivity {
    FloatingActionButton fab;
    EditText edmt, edjt, edtt;
    String tugas, jenis, waktu;
    TextView textnama;

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.mnsubmit) {

            tugas = edmt.getText().toString();
            jenis = edjt.getText().toString();
            waktu = edtt.getText().toString();

            if (tugas.isEmpty() ||waktu.isEmpty()|| jenis.isEmpty())
            {
                Toast.makeText(getApplicationContext(), "Masukkan Semua Data",
                        Toast.LENGTH_SHORT).show();
            }
            if (edmt.getText().toString().length() == 0) {
                edmt.setError("Masukkan Task");
            }
            if (edjt.getText().toString().length() == 0) {
                edjt.setError("Masukkan Jenis Task");
            }
            if (edtt.getText().toString().length() == 0) {
                edtt.setError("Masukkan Lama Task");
            } else {
                Toast t = Toast.makeText(getApplicationContext(),
                        "Berhasil", Toast.LENGTH_LONG);
                t.show();

                Bundle b = new Bundle();
                b.putString("a", tugas.trim());
                b.putString("b", jenis.trim());
                b.putString("c", waktu.trim());

                Intent i = new Intent(getApplicationContext(), hasil.class);
                i.putExtras(b);
                startActivity(i);
            }
        }
        if (item.getItemId() == R.id.mnlogout) {
            Intent j = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(j);
        }
        return super.onOptionsItemSelected(item);
    }}