package com.amaderhub.classforteen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Variable Declare
    ImageView clicktoshow, clicktogone;
    LinearLayout Mymenu, Open_animation;
    TextView Total_cases, Total_deaths, New_cases, Total_cases_number, Total_deaths_number, New_cases_number;
    Animation Zoom_in, Zoom_out;
    Button animation_show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Id Declare
        clicktoshow= findViewById(R.id.click_to_show);
        clicktogone= findViewById(R.id.click_to_gone);
        Mymenu= findViewById(R.id.show_menu);
        Total_cases= findViewById(R.id.total_cases);
        Total_deaths= findViewById(R.id.total_deaths);
        New_cases= findViewById(R.id.new_cases);
        Total_cases_number= findViewById(R.id.total_cases_number);
        Total_deaths_number= findViewById(R.id.total_death_number);
        New_cases_number= findViewById(R.id.new_cases_number);

        //Here Is Animation Identity
        Zoom_in= AnimationUtils.loadAnimation(MainActivity.this, R.anim.zoom_in);
        Zoom_out= AnimationUtils.loadAnimation(MainActivity.this, R.anim.zoom_out);
        //-----------
        Open_animation= findViewById(R.id.open_Animation);
        animation_show= findViewById(R.id.animation_show);

        //Show Our Menu
        clicktoshow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mymenu.setVisibility(View.VISIBLE);

                //Animation
            }
        });

        //Gone Our Menu
        clicktogone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mymenu.setVisibility(View.GONE);

            }
        });

        //Show Total Cases Number
        Total_cases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Total_cases_number.setVisibility(View.VISIBLE);
                New_cases_number.setVisibility(View.GONE);
                Total_deaths_number.setVisibility(View.GONE);

                //Animation


            }
        });

        //Show Total Deaths Number
        Total_deaths.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Total_deaths_number.setVisibility(View.VISIBLE);
                Total_cases_number.setVisibility(View.GONE);
                New_cases_number.setVisibility(View.GONE);

                //Animation
            }
        });

        //Show New Cases Number
        New_cases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                New_cases_number.setVisibility(View.VISIBLE);
                Total_deaths_number.setVisibility(View.GONE);
                Total_cases_number.setVisibility(View.GONE);

                //Animation
            }
        });

        //Show And Animation By Cases Country
        animation_show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Open_animation.setVisibility(View.VISIBLE);
                Open_animation.setAnimation(Zoom_out);
            }
        });

    }
}
