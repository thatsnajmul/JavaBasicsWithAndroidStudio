package com.amaderhub.ifelsecondition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Problem12 extends AppCompatActivity {

    EditText Edidtextp12 ;
    TextView Tvdisplayp12;
    Button Buttonp12;

    int num1p12 ;
    String Snum1p12 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem12);


        //=======================================
        Edidtextp12 = findViewById(R.id.edittextp12);
        Tvdisplayp12 = findViewById(R.id.tvdisplayp12);
        Buttonp12 = findViewById(R.id.buttonp12);
        //=======================================

        
        Buttonp12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Snum1p12 = Edidtextp12.getText().toString();
                num1p12 = Integer.parseInt(Snum1p12);



                if(num1p12 == 1)
                {
                    Tvdisplayp12.setText("31 days");
                }
                else if(num1p12 == 2)
                {
                    Tvdisplayp12.setText("28 or 29 days");
                }
                else if(num1p12 == 3)
                {
                    Tvdisplayp12.setText("31 days");
                }
                else if(num1p12 == 4)
                {
                    Tvdisplayp12.setText("30 days");
                }
                else if(num1p12 == 5)
                {
                    Tvdisplayp12.setText("31 days");
                }
                else if(num1p12 == 6)
                {
                    Tvdisplayp12.setText("30 days");
                }
                else if(num1p12 == 7)
                {
                    Tvdisplayp12.setText("31 days");
                }
                else if(num1p12 == 8)
                {
                    Tvdisplayp12.setText("31 days");
                }
                else if(num1p12 == 9)
                {
                    Tvdisplayp12.setText("30 days");
                }
                else if(num1p12 == 10)
                {
                    Tvdisplayp12.setText("31 days");
                }
                else if(num1p12 == 11)
                {
                    Tvdisplayp12.setText("30 days");
                }
                else if(num1p12 == 12)
                {
                    Tvdisplayp12.setText("31 days");
                }
                else
                {
                    Tvdisplayp12.setText("Invalid input! Please enter num1p12 number between (1-12).");
                }




            }
        });
        //=======================================================



    }
}
