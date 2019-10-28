package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    TextView plus;
    Animation traverse,fadeout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        plus = findViewById(R.id.textView4);
        traverse = AnimationUtils.loadAnimation(this,R.anim.splashimganim);
        fadeout = AnimationUtils.loadAnimation(this,R.anim.fadeout);
        plus.startAnimation(traverse);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

               plus.startAnimation(fadeout);
            }
        },1600);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(SplashActivity.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        },1900);

    }




}
