package com.amaderhub.classsixteen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Problem One VAriable Declare
        EditText Problem01Input, Problem02Input;
        TextView Tvdisplay;
        Button Problem01btn;
        int num1, num2;
        String sNum1, sNum2;

    //Problem Two VAriable Declare
        EditText Problem03Input ;
        TextView Tvdisplay1;
        Button Problem02btn;
        int num3 ;
        String sNum3 ;

    //Problem Three VAriable Declare
        EditText Problem04Input ;
        TextView Tvdisplay2;
        Button Problem03btn;
        int num4 ;
        String sNum4 ;
    //Problem Four VAriable Declare
        EditText Problem05Input ;
        TextView Tvdisplay3;
        Button Problem04btn;
        String sNum5 ;
        char ch;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //For Problem One Identity.......
        Problem01Input = findViewById(R.id.prb01input);
        Problem02Input = findViewById(R.id.prb02input);
        Problem01btn = findViewById(R.id.problem01btn);
        Tvdisplay = findViewById(R.id.tvdisplay);

        //For Problem Two Identity.......
        Problem03Input = findViewById(R.id.prb03input);
        Problem02btn = findViewById(R.id.problem02btn);
        Tvdisplay1 = findViewById(R.id.tvdisplay1);

        //For Problem Three Identity.......
        Problem04Input = findViewById(R.id.prb04input);
        Problem03btn = findViewById(R.id.problem03btn);
        Tvdisplay2 = findViewById(R.id.tvdisplay2);

        //For Problem Four Identity.......
        Problem05Input = findViewById(R.id.prb05input);
        Problem04btn = findViewById(R.id.problem04btn);
        Tvdisplay3 = findViewById(R.id.tvdisplay3);


        //For Problem One
        Problem01btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sNum1 = Problem01Input.getText().toString();
                sNum2 = Problem02Input.getText().toString();
                num1 = Integer.parseInt(sNum1);
                num2 = Integer.parseInt(sNum2);

                if (num1 > num2) {
                    Tvdisplay.setText( num1 + " is Maximum between " + num1 + " and " + num2);
                } else {
                    Tvdisplay.setText( num2 + " is Maximum between " + num1 + " and " + num2);
                }
                }
        });

        //For Problem Two
        Problem02btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sNum3 = Problem03Input.getText().toString();
                num3 = Integer.parseInt(sNum3);

                if (num3 % 2 != 0) {
                    Tvdisplay1.setText( num3 + " This is Odd Number" );
                } else {
                    Tvdisplay1.setText( num3 + " This is Even Number");
                }
            }
        });


        //For Problem Three
        Problem03btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sNum4 = Problem04Input.getText().toString();
                num4 = Integer.parseInt(sNum4);

                if ((num4 % 4 == 0) && (num4 % 100 !=0) || (num4 % 400==0)) {
                    Tvdisplay2.setText( "Hello... This Is a Leap Year" );
                } else {
                    Tvdisplay2.setText( "Opps..! This Is Not Leap Year" );
                }
            }
        });


        //For Problem Four
        Problem04btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sNum5 = Problem05Input.getText().toString();
                ch = sNum5.charAt(0);

                if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
                    Tvdisplay3.setText("Yes..! Character is an ALPHABET");
                else {
                    Tvdisplay3.setText( "No..! Character isn't ALPHABET" );
                }
            }
        });



    }
}
