package com.demo.joseezequielgallardo.contactapp.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class ContactSQLiteHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "CONTACT_APP";
    private static SQLiteDatabase.CursorFactory cursorFactory = null;
    private static final int VERSION = 0;

    /**** Contact Table ****/
    private static final String CONTACT_TABLE = "CONTACT";
    private static final String CONTACT_ID = "_id";
    private static final String CONTACT_NAME = "name";
    private static final String CONTACT_PHONE = "phone";
    private static final String CONTACT_PICTURE = "picture";
    private static final String CREATE_CONTACT_TABLE = "create table " + CONTACT_TABLE + "("
            + CONTACT_ID + " integer primary key autoincrement,"
            + CONTACT_NAME + " text not null,"
            + CONTACT_PICTURE + " text not null,"
            + CONTACT_PHONE + "int not null unique)";

    public ContactSQLiteHelper(Context context){
        super(context, DATABASE_NAME, cursorFactory, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_CONTACT_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
