package com.example.android.radencynthya_1202152326_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class DineIn extends AppCompatActivity implements 
    AdapterView.OnItemSelectedListener{
        
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in);
        // Membuat sebuah spinner
        Spinner spinner = (Spinner) findViewById(R.id.spinner_table);

        // Buat ArrayAdapter menggunakan array string dan layout spinner default.
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.tables_array, android.R.layout.simple_spinner_item);
        // Tentukan tata letak yang akan digunakan saat daftar pilihan muncul
        adapter.setDropDownViewResource
                (android.R.layout.simple_spinner_dropdown_item);
        // Terapkan adaptor ke spinner
        if (spinner != null) {
            spinner.setAdapter(adapter);
        }
    }
    // Membuat sebuah spinner
    Spinner spinner = (Spinner) findViewById(R.id.spinner_table);

    // Buat ArrayAdapter menggunakan array string dan layout spinner default.
    ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
            R.array.tables_array, android.R.layout.simple_spinner_item);
    // Tentukan tata letak yang akan digunakan saat daftar pilihan muncul
        adapter.setDropDownViewResource
                (android.R.layout.simple_spinner_dropdown_item);
    // Terapkan adaptor ke spinner
        if (spinner != null) {
        spinner.setAdapter(adapter);
    }
}
    