package com.amaderhub.ifelsecondition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Problem5 extends AppCompatActivity {

    EditText Edidtextp5 ;
    TextView Tvdisplayp5;
    Button Buttonp5;

    int num1p5 ;
    String Snum1p5 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem5);


        //=======================================
        Edidtextp5 = findViewById(R.id.edittextp5);
        Tvdisplayp5 = findViewById(R.id.tvdisplayp5);
        Buttonp5 = findViewById(R.id.buttonp5);
        //=======================================


        //===================================================
        Buttonp5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Snum1p5 = Edidtextp5.getText().toString();
                num1p5 = Integer.parseInt(Snum1p5);

                if(num1p5 % 2 == 0)
                {
                    Tvdisplayp5.setText("Number is Even.");
                }
                else
                {
                    Tvdisplayp5.setText("Number is Odd.");
                }



            }
        });
        //=======================================================



    }
}
