package com.example.devde.sqlitecrud.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.devde.sqlitecrud.Database.DatabaseManagement;
import com.example.devde.sqlitecrud.R;

public class SqliteOperation extends AppCompatActivity {

    EditText branch,teacher,subject,semester,block,teacherno,studentno,time;
    Button insert,show,update,delete;
    DatabaseManagement database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sqlite_operation);

        database = DatabaseManagement.getInstance(this);
        database.Open();

        branch = findViewById(R.id.et_branch);
        teacher = findViewById(R.id.et_teacher);
        subject = findViewById(R.id.et_subject);
        semester = findViewById(R.id.et_semester);
        block = findViewById(R.id.et_block);
        teacherno = findViewById(R.id.et_teacher_no);
        studentno = findViewById(R.id.et_student_no);
        time = findViewById(R.id.et_time);

        insert = findViewById(R.id.btn_insert);
        show = findViewById(R.id.btn_show);
        update = findViewById(R.id.btn_update);
        delete = findViewById(R.id.btn_delete);
        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InsertData();
            }
        });
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SqliteOperation.this,SqliteView.class);
                startActivity(intent);
            }
        });
    }

    public void InsertData(){
        String Branch = branch.getText().toString();
        String Teacher = teacher.getText().toString();
        String Subject = subject.getText().toString();
        String Semester = semester.getText().toString();
        String Block = block.getText().toString();
        String TeacherNo = teacherno.getText().toString();
        String StudentNo = studentno.getText().toString();
        String Time = time.getText().toString();
        database.addCollege(Branch,Teacher,Subject,Semester,Block,TeacherNo,StudentNo,Time);
        branch.getText().clear();
        teacher.getText().clear();
        subject.getText().clear();
        semester.getText().clear();
        block.getText().clear();
        teacherno.getText().clear();
        studentno.getText().clear();
        time.getText().clear();
    }
}
