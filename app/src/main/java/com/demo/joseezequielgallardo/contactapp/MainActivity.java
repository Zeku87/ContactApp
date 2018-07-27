package com.demo.joseezequielgallardo.contactapp;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.demo.joseezequielgallardo.contactapp.data.ContactSQLiteHelper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Database Controller
        ContactSQLiteHelper contactDB = new ContactSQLiteHelper(MainActivity.this);

        //Write mode access
        SQLiteDatabase database = contactDB.getWritableDatabase();

        //All set
        Toast.makeText(MainActivity.this, "Database ready", Toast.LENGTH_LONG).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.contact_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){

        switch (item.getItemId()){
            case 0:
                //TODO: fragment to add contact
                break;

            default: break;
        }

        return true;
    }
}
