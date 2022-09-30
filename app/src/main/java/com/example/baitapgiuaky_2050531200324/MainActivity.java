package com.example.baitapgiuaky_2050531200324;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    String gioiTinh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText ten = findViewById(R.id.name_ed);
        EditText tuoi = findViewById(R.id.tuoi_ed);
        Spinner spi = findViewById(R.id.spinner);


        ListView lv = findViewById(R.id.lvSinhVien);
        Button them,sua,xoa;
        them = findViewById(R.id.them_button);
        xoa = findViewById(R.id.Xoa_button);
        sua = findViewById(R.id.sua_button);

        ArrayList<String> arr = new ArrayList<>();
        arr.add("Nam");
        arr.add("Nu");
        ArrayAdapter arrayAdapter = new ArrayAdapter(MainActivity.this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,arr);
        spi.setAdapter(arrayAdapter);

        spi.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                gioiTinh= arr.get(i);
            }
        });
    }
}