package com.example.devde.sqlitecrud.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

public class DatabaseManagement {

    private SQLiteOpenHelper helper;
    private SQLiteDatabase sqLiteDatabase;
    private static DatabaseManagement instance;

    private DatabaseManagement(Context context){
        this.helper = new MyDatabase(context);
    }

    public static DatabaseManagement getInstance(Context context){
        if(instance == null){
            instance = new DatabaseManagement(context);
        }
        return instance;
    }

    public void Open(){
        this.sqLiteDatabase = helper.getWritableDatabase();
    }

    public void Close(){
        if(sqLiteDatabase != null){
            this.sqLiteDatabase.close();
        }
    }

    public static final String Tbl_Management = "CollegeManagement";

    public boolean addCollege(String branch,String teacher,String subject,String semester,String block,String teacher_no,String student_no,String time){
        ContentValues values = new ContentValues();
        values.put("BRANCH",branch);
        values.put("TEACHER",teacher);
        values.put("SUBJECT",subject);
        values.put("SEMESTER",semester);
        values.put("BLOCK",block);
        values.put("TEACHER_NO",teacher_no);
        values.put("STUDENT_NO",student_no);
        values.put("TIME",time);
        Long checkers = sqLiteDatabase.insert(Tbl_Management,null,values);
        if(checkers == -1){
            return false;
        }
        return true;
    }
    public Cursor selectCollege(){
        Cursor res = sqLiteDatabase.rawQuery(" SELECT * FROM " + Tbl_Management,null);
        return res;
    }
}
