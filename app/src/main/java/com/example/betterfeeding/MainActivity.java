package com.example.betterfeeding;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //kanoel daphine
    //2017/bit/152
    //COURSE:BIT
    public EditText use;
    public EditText passme;
    private Button Logme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        use = (EditText) findViewById(R.id.name);
        passme = (EditText) findViewById(R.id.take);
        Logme = findViewById(R.id.logv);

        Logme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ORDERS.class);
                startActivity(intent);
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.item, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int x = item.getItemId();
        switch (x) {
            case R.id.menu:
                Intent m = new Intent(getApplicationContext(), com.example.betterfeeding.Menu.class);
                startActivity(m);
                return true;
            case R.id.help:
                setFragment(new help());
                break;


        }
        return super.onOptionsItemSelected(item);
    }
    void setFragment(Fragment fragment){

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,fragment).commit();
    }

}
