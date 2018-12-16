package com.example.devde.sqlitecrud.activity;

import android.content.Context;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.devde.sqlitecrud.Database.DatabaseManagement;
import com.example.devde.sqlitecrud.Model.Management;
import com.example.devde.sqlitecrud.R;
import com.example.devde.sqlitecrud.adapter.ManagementAdapter;

import java.util.ArrayList;

public class SqliteView extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<Management> arrayList = new ArrayList<>();
    ManagementAdapter adapter;
    DatabaseManagement database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sqlite_view);

        database = DatabaseManagement.getInstance(this);
        database.Open();

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        showData();
    }

    public void showData(){
         Cursor cursor;
         cursor = database.selectCollege();
         if(cursor.getCount() != 0){
             cursor.moveToFirst();
             do{
                 String branch = cursor.getString(0);
                 String teacher = cursor.getString(1);
                 String subject = cursor.getString(2);
                 String semester = cursor.getString(3);
                 String block = cursor.getString(4);
                 String teacherno = cursor.getString(5);
                 String studentno = cursor.getString(6);
                 String time = cursor.getString(7);
                 arrayList.add(new Management(branch,teacher,subject,semester,block,teacherno,studentno,time));
             }while (cursor.moveToNext());
         }
         adapter = new ManagementAdapter(arrayList,SqliteView.this);
         recyclerView.setAdapter(adapter);
    }
}
