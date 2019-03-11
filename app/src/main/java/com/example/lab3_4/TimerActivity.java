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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.timer_view);

        Intent intent = getIntent();
        String aika = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        int aikaJaljella = Integer.parseInt(aika) * 1000;






        new CountDownTimer(aikaJaljella, 1000) {

            public void onTick(long millisUntilFinished) {
                TextView countdownText = findViewById(R.id.countdownText);

                countdownText.setText(millisUntilFinished / 1000+"");
            }

            public void onFinish() {
                MediaPlayer mediaPlayer = MediaPlayer.create(TimerActivity.this, R.raw.wolf);
                mediaPlayer.start();
                Intent intentHaly = new Intent(TimerActivity.this, MainActivity.class);
                startActivity(intentHaly);
            }
        }.start();

    }
}