package com.jeff.murray.foodtruckstry4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telecom.Call;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    item order = new item[];
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button sides = findViewById(R.id.button);
        Button drinks = findViewById(R.id.button2);
        Button sandwich = findViewById(R.id.button3);

        sandwich.setOnClickListener(this);
        sides.setOnClickListener(this);
        drinks.setOnClickListener(this);
    }

    public void openSandwich_select() {
        Intent intent = new Intent( this, TestActivity1.class);
        startActivity(intent);
    }

    public void openSide_select() {
        Intent intent = new Intent( this, TestActivity2.class);
        startActivity(intent);
    }

    public void openDrink_select() {
        Intent intent = new Intent( this, drink_activity.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.button3:
                openSandwich_select();
                break;
            case R.id.button:
                openSide_select();
                break;
            case R.id.button2:
                openDrink_select();
                break;
        }
    }
}
