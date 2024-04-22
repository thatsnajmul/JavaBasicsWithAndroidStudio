package com.amaderhub.ifelsecondition;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout Layplashgo, Linearmain ;
    Animation fade_in, fade_out;

    Button Button1, Button2, Button3, Button4, Button5, Button6, Button7, Button8, Button9, Button10,
            Button11, Button12, Button13, Button14, Button15, Button16, Button17, Button18, Button19,
            Button20, Button21;

    Intent myintent;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button1 = findViewById(R.id.button1);
        Button2 = findViewById(R.id.button2);
        Button3 = findViewById(R.id.button3);
        Button4 = findViewById(R.id.button4);
        Button5 = findViewById(R.id.button5);
        Button6 = findViewById(R.id.button6);
        Button7 = findViewById(R.id.button7);
        Button8 = findViewById(R.id.button8);
        Button9 = findViewById(R.id.button9);
        Button10 = findViewById(R.id.button10);
        Button11 = findViewById(R.id.button11);
        Button12 = findViewById(R.id.button12);
        Button13 = findViewById(R.id.button13);
        Button14 = findViewById(R.id.button14);
        Button15 = findViewById(R.id.button15);
        Button16 = findViewById(R.id.button16);
        Button17 = findViewById(R.id.button17);
        Button18 = findViewById(R.id.button18);
        Button19 = findViewById(R.id.button19);
        Button20 = findViewById(R.id.button20);
        Button21 = findViewById(R.id.button21);

        //========================================================

        //=========================================
        Layplashgo = findViewById(R.id.laysplashgo);
        Linearmain = findViewById(R.id.linearmain);
        fade_out = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade_out);
        fade_in = AnimationUtils.loadAnimation(MainActivity.this,R.anim.fade_in);
        Linearmain.setVisibility(View.GONE);

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }


        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                Layplashgo.startAnimation(fade_out);

                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Layplashgo.setVisibility(View.GONE);
                        Layplashgo.setAnimation(fade_in);
                        Linearmain.setVisibility(View.VISIBLE);


                        if (getSupportActionBar() != null) {
                            getSupportActionBar().show();
                        }

                    }
                }, 1000);

            }
        }, 2000);


        //========================================================



        //Button One To Go Problem 1
        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myintent = new Intent(MainActivity.this,Problem1.class);
                startActivity(myintent);
            }
        });


        //Button One To Go Problem 2
        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myintent = new Intent(MainActivity.this,Problem2.class);
                startActivity(myintent);
            }
        });


        //Button One To Go Problem 3
        Button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myintent = new Intent(MainActivity.this,Problem3.class);
                startActivity(myintent);
            }
        });


        //Button One To Go Problem 4
        Button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myintent = new Intent(MainActivity.this,Problem4.class);
                startActivity(myintent);
            }
        });

        //Button One To Go Problem 5
        Button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myintent = new Intent(MainActivity.this,Problem5.class);
                startActivity(myintent);
            }
        });

        //Button One To Go Problem 6
        Button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myintent = new Intent(MainActivity.this,Problem6.class);
                startActivity(myintent);
            }
        });

        //Button One To Go Problem 7
        Button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myintent = new Intent(MainActivity.this,Problem7.class);
                startActivity(myintent);
            }
        });

        //Button One To Go Problem 8
        Button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myintent = new Intent(MainActivity.this,Problem8.class);
                startActivity(myintent);
            }
        });

        //Button One To Go Problem 9
        Button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myintent = new Intent(MainActivity.this,Problem9.class);
                startActivity(myintent);
            }
        });

        //Button One To Go Problem 10
        Button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myintent = new Intent(MainActivity.this,Problem10.class);
                startActivity(myintent);
            }
        });

        //Button One To Go Problem 11
        Button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myintent = new Intent(MainActivity.this,Problem11.class);
                startActivity(myintent);
            }
        });

        //Button One To Go Problem 12
        Button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myintent = new Intent(MainActivity.this,Problem12.class);
                startActivity(myintent);
            }
        });

        //Button One To Go Problem 13
        Button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myintent = new Intent(MainActivity.this,Problem13.class);
                startActivity(myintent);
            }
        });

        //Button One To Go Problem 14
        Button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myintent = new Intent(MainActivity.this,Problem14.class);
                startActivity(myintent);
            }
        });

        //Button One To Go Problem 15
        Button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myintent = new Intent(MainActivity.this,Problem15.class);
                startActivity(myintent);
            }
        });

        //Button One To Go Problem 16
        Button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myintent = new Intent(MainActivity.this,Problem16.class);
                startActivity(myintent);
            }
        });

        //Button One To Go Problem 17
        Button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myintent = new Intent(MainActivity.this,Problem17.class);
                startActivity(myintent);
            }
        });

        //Button One To Go Problem 18
        Button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myintent = new Intent(MainActivity.this,Problem18.class);
                startActivity(myintent);
            }
        });

        //Button One To Go Problem 19
        Button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myintent = new Intent(MainActivity.this,Problem19.class);
                startActivity(myintent);
            }
        });

        //Button One To Go Problem 20
        Button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myintent = new Intent(MainActivity.this,Problem20.class);
                startActivity(myintent);
            }
        });

        //Button One To Go Problem 21
        Button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myintent = new Intent(MainActivity.this,Problem21.class);
                startActivity(myintent);
            }
        });











        //Page End Area
    }
}
