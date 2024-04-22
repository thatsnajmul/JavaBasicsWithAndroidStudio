package com.amaderhub.ifelsecondition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Problem6 extends AppCompatActivity {

    EditText Edidtextp6 ;
    TextView Tvdisplayp6;
    Button Buttonp6;

    int num1p6 ;
    String Snum1p6 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem6);


        //=======================================
        Edidtextp6 = findViewById(R.id.edittextp6);
        Tvdisplayp6 = findViewById(R.id.tvdisplayp6);
        Buttonp6 = findViewById(R.id.buttonp6);
        //=======================================


        //===================================================
        Buttonp6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Snum1p6 = Edidtextp6.getText().toString();
                num1p6 = Integer.parseInt(Snum1p6);


                if(((num1p6 % 4 == 0) && (num1p6 % 100 !=0)) || (num1p6 % 400==0))
                {
                    Tvdisplayp6.setText("LEAP YEAR");
                }
                else
                {
                    Tvdisplayp6.setText("COMMON YEAR");
                }


            }
        });
        //=======================================================


    }
}
