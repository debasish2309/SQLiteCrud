package com.example.devde.sqlitecrud.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.devde.sqlitecrud.R;

public class MainActivity extends AppCompatActivity {

    Button btn_sqlite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_sqlite = findViewById(R.id.btn_sqlite);
        btn_sqlite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SqliteOperation.class);
                startActivity(intent);
            }
        });
    }
}
