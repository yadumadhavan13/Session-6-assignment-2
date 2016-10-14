package com.example.y.menuapp;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.about: {
                Toast.makeText(MainActivity.this, "About icon is selected", Toast.LENGTH_SHORT).show();
                Log.e("MainActivity","About icon is selected");
                return true;
            }
            case R.id.help: {
                Toast.makeText(MainActivity.this, "Help icon is selected", Toast.LENGTH_SHORT).show();
                Log.e("MainActivity","Help icon is selected");
                return true;
            }
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
