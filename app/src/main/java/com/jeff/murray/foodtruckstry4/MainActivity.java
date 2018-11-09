package com.jeff.murray.foodtruckstry4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telecom.Call;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    final Button button=(Button)findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener()
    {
        @Override
                public void onClick(View v)
        {
            Intent launchactivity = new Intent(MainActivity.this,sandwich_select.xml);
                startActivity(launchactivity);
        }
    }
}
