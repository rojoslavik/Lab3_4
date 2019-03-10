package com.example.lab3_4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.lab3_4.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
            public void sendMessage(View v ) {
                Intent intent = new Intent(MainActivity.this, TimerActivity.class);
                EditText editText = findViewById(R.id.aikaValinta);
                Editable aika = editText.getText();
                intent.putExtra(EXTRA_MESSAGE, aika);
                startActivity(intent);


            }

        }




