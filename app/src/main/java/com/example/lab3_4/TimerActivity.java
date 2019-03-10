package com.example.lab3_4;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import java.text.BreakIterator;

public class TimerActivity extends AppCompatActivity {
    private TextView countdownText;
    private long millisUntilFinished;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.timer_view);

        Intent intent = getIntent();
        String aika = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        long millisUntilFinished = Long.parseLong(aika);



        new CountDownTimer(30000, 1000) {

            public void onTick(long millisUntilFinished) {
                countdownText.setText();
            }

            public void onFinish() {
                MediaPlayer mediaPlayer = MediaPlayer.create(TimerActivity.this, R.raw.wolf);
                Intent intent = new Intent(TimerActivity.this, MainActivity.class);
            }
        }.start();

    }
}