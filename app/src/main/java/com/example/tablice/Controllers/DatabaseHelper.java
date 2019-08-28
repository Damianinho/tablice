package com.example.ddami.zaklad.Controllers;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.ddami.zaklad.Models.Coupons;
import com.example.ddami.zaklad.Models.Matches;
import com.example.ddami.zaklad.Models.Revenues;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * Created by ddami on 26.11.2017.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    //database-connection controller

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "bookmaker.db";

    private static final String TABLE_NAME = "tablice";
    private static final String COLUMN_ID = "id";
    private static final String COLUMN_Index = "indeksy";
    private static final String COLUMN_Usluga = "nazwa_uslugi";
    private static final String COLUMN_Rodzaj = "rodzaj_uslugi";
    private static final String COLUMN_Identyfikator = "indetyfikator";






    SQLiteDatabase db;

    private static final String TABLE_CREATE = "CREATE TABLE IF NOT EXISTS "
        + TABLE_NAME + "(" + COLUMN_ID + " INTEGER PRIMARY KEY NOT NULL," + COLUMN_Index
        + " TEXT NOT NULL," + COLUMN_Usluga + " TEXT NOT NULL," + COLUMN_Rodzaj + " REAL NOT NULL," +COLUMN_Identyfikator + " REAL NOT NULL," +")";



    public DatabaseHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(TABLE_CREATE);

        this.db = db;
    }

    public void insertTablice(Tablice tablice){
        db = this.getWritableDatabase();
        ContentValues values3 = new ContentValues();

        String query3 = "select * from tablice";
        Cursor cursor3 = db.rawQuery(query3, null);
        int count3 = cursor3.getCount();

        values3.put(COLUMN_ID, count3);
        values3.put(COLUMN_Index, tablice.getIndeks());
        values3.put(COLUMN_Usluga, tablice.getNazwa_uslugi());
        values3.put(COLUMN_Rodzaj, tablice.getRodzaj_uslugi());
        values3.put(COLUMN_Identygikator, tablice.getIdentyfikator());
            db.insert(TABLE_NAME, null, values3);
            db.close();
        }



   // public ArrayList<Matches> getAllMatches() {
      //  SQLiteDatabase db = this.getReadableDatabase();
       // ArrayList<Tablice> TabliceArrayList= new ArrayList<Tablice>();
        //Cursor result = db.rawQuery("select * from "+TABLE_NAME , null);
        //while(result.moveToNext()){
          //  matchesArrayList.add( new Matches(result.getInt(result.getColumnIndex(COLUMN_ID)), result.getString(result.getColumnIndex(COLUMN_HOME)), result.getString(result.getColumnIndex(COLUMN_AWAY)),result.getFloat(result.getColumnIndex(COLUMN_HOMECOURSE)),result.getFloat(result.getColumnIndex(COLUMN_AWAYCOURSE)),result.getFloat(result.getColumnIndex(COLUMN_DRAWCOURSE))));

//        }
  //      return matchesArrayList;
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        if(newVersion>oldVersion){
            String query = "DROP TABLE IF EXISTS" + TABLE_NAME;

            db.execSQL(query);
            this.onCreate(db);
        }
    }



}
