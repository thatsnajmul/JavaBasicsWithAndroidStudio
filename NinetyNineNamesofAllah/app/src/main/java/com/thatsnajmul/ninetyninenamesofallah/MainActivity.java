package com.thatsnajmul.ninetyninenamesofallah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //Here is data type & Variable Diclare
  Button Introduction, one, two, three, four, five, six, saven, eight, nine, ten,
          eleven, twelve, thirteen, fuorteen, fifteen, sixteen, saventeen, eighteen,
          nineteen, tweenty, tweentyone, tweentytwo, tweentythree, tweentyfour,
          tweentyfive, tweentysix, tweentysaven, tweentyeight, tweentynine, thirty,
          thirtyone, thirtytwo, thirtythree, thirtyfour, thirtyfive, thirtysix,
          thirtysaven, thirtyeight, thirtynine, forty;

  Intent myintent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}