package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button one,two,three,four,five,six,seven,eight,nine,zero,dot,clear,percent,div,minus,plus,equal,mul,leftp,rightp;
    TextView primary,secondary;
    String main = "";
    Vibrator vibe;
    int paranthesisCheck = 0;
    ArrayList<String> equation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three =findViewById(R.id.three);
        four = findViewById(R.id.four);
        five =findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven =findViewById(R.id.seven);
        eight =findViewById(R.id.eight);
        nine =findViewById(R.id.nine);
        zero=findViewById(R.id.zero);
        dot = findViewById(R.id.dot);
        clear = findViewById(R.id.clear);
        percent = findViewById(R.id.percentage);
        div = findViewById(R.id.divide);
        minus = findViewById(R.id.minus);
        plus = findViewById(R.id.plus);
        equal = findViewById(R.id.equal);
        mul = findViewById(R.id.multiply);
        leftp = findViewById(R.id.leftp);
        rightp = findViewById(R.id.rightp);

        primary = findViewById(R.id.primary);
        secondary = findViewById(R.id.secondary);

        vibe = (Vibrator) getSystemService(VIBRATOR_SERVICE);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibe.vibrate(90);
                main = main + "1";
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibe.vibrate(90);
                main = main + "2";
                primary.setText(main);

            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibe.vibrate(90);
                main = main + "3";
                primary.setText(main);

            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibe.vibrate(90);
                main = main + "4";
                primary.setText(main);

            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibe.vibrate(90);
                main = main + "5";
                primary.setText(main);

            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibe.vibrate(90);
                main = main + "6";
                primary.setText(main);

            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibe.vibrate(90);
                main = main + "7";
                primary.setText(main);

            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibe.vibrate(90);
                main = main + "8";
                primary.setText(main);

            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibe.vibrate(90);
                main = main + "9";
                primary.setText(main);

            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibe.vibrate(90);
                main = main + "0";
                primary.setText(main);

            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibe.vibrate(90);
                main = main + ".";
                primary.setText(main);

            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibe.vibrate(90);
                main = "";
                primary.setText(main);

            }
        });

        percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibe.vibrate(90);
                main = main + "%";
                primary.setText(main);

            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibe.vibrate(90);
                main = main + "/";
                primary.setText(main);

            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibe.vibrate(90);
                main = main + "x";
                primary.setText(main);

            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibe.vibrate(90);
                main = main + "-";
                primary.setText(main);

            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibe.vibrate(90);
                main = main + "+";
                primary.setText(main);

            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibe.vibrate(90);
                if(equatable(main)){
                    int a;
                }

            }
        });

        leftp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibe.vibrate(90);
                main = main + "(";
                primary.setText(main);
                paranthesisCheck++;

            }
        });

        rightp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibe.vibrate(90);
                main = main + ")";
                primary.setText(main);
                paranthesisCheck--;

            }
        });


    }

    public boolean equatable(String main){
        return true;
    }

}

