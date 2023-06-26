package com.example.panchayat;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;


public class DBHelper extends SQLiteOpenHelper {

    public DBHelper(Context context){
    super(context, "userdata.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase DB) {
        DB.execSQL("create Table Userproblem(pname TEXT ,problem_in TEXT ,Ptext TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase DB, int i, int i1) {
        DB.execSQL("drop Table if exists Userproblem");

    }
    public Boolean insertuserdata(String pname,String problem,String ptext)
    {
        SQLiteDatabase DB=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("pname" ,pname);
        contentValues.put("problem" ,problem);
        contentValues.put("ptext" ,ptext);
    long result=DB.insert("userproblem",null,contentValues);
    if (result==-1){
        return false;

    }
    else{
        return true;

    }
    }
    /*
    public Boolean updateuserdata(String pname,String problem,String ptext)
    {
        SQLiteDatabase DB=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("pname" ,pname);
        contentValues.put("problem" ,problem);
        contentValues.put("ptext" ,ptext);
        long result=DB.update("userproblem",contentValues);
        if (result==-1){
            return false;

        }
        else{
            return true;

        }
    }

     */


}
