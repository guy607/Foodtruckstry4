package com.jeff.murray.foodtruckstry4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telecom.Call;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);
        Button button9 = findViewById(R.id.button9);
        Button button10 = findViewById(R.id.button10);
        Button button11 = findViewById(R.id.button11);
        Button button12 = findViewById(R.id.button12);

        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button10.setOnClickListener(this);
        button11.setOnClickListener(this);
        button12.setOnClickListener(this);
    }

    final Button button=(Button)findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener())
    {
        @Override
                public void onClick(View v)
        {
            Intent launchactivity = new Intent(MainActivity.this,sandwich_select.xml);
                startActivity(launchactivity);
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button5:
                Toast.makeText(this, "Button 5 clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button6:
                Toast.makeText(this, "Button 6 clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button7:
                Toast.makeText(this, "Button 7 clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button8:
                Toast.makeText(this, "Button 8 clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button9:
                Toast.makeText(this, "Button 9 clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button10:
                Toast.makeText(this, "Button 10 clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button11:
                Toast.makeText(this, "Button 11 clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button12:
                Toast.makeText(this, "Button 12 clicked", Toast.LENGTH_SHORT).show();
                break;
        }

    }
}
