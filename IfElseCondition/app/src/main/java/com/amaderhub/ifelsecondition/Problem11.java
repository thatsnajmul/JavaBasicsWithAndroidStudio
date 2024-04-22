package com.amaderhub.ifelsecondition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Problem11 extends AppCompatActivity {


    EditText Edidtextp11 ;
    TextView Tvdisplayp11;
    Button Buttonp11;

    int num1p11 ;
    String Snum1p11 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem11);



        //=======================================
        Edidtextp11 = findViewById(R.id.edittextp11);
        Tvdisplayp11 = findViewById(R.id.tvdisplayp11);
        Buttonp11 = findViewById(R.id.buttonp11);
        //=======================================


        //===================================================
        Buttonp11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Snum1p11 = Edidtextp11.getText().toString();
                num1p11 = Integer.parseInt(Snum1p11);



                if(num1p11 == 1)
                {
                    Tvdisplayp11.setText("Monday");
                }
                else if(num1p11 == 2)
                {
                    Tvdisplayp11.setText("Tuesday");
                }
                else if(num1p11 == 3)
                {
                    Tvdisplayp11.setText("Wednesday");
                }
                else if(num1p11 == 4)
                {
                    Tvdisplayp11.setText("Thursday");
                }
                else if(num1p11 == 5)
                {
                    Tvdisplayp11.setText("Friday");
                }
                else if(num1p11 == 6)
                {
                    Tvdisplayp11.setText("Saturday");
                }
                else if(num1p11 == 7)
                {
                    Tvdisplayp11.setText("Sunday");
                }
                else
                {
                    Tvdisplayp11.setText("Invalid Input! Please enter num1p11 number between 1-7.");
                }
                



            }
        });
        //=======================================================



    }
}
