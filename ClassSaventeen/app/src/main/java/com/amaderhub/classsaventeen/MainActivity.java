package com.amaderhub.classsaventeen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {


    LinearLayout Layplashgo, Linearmain ;
    Animation fade_in, fade_out;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


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
        }, 5100);


        //========================================================



    }
}
