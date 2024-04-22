package com.amaderhub.ifelsecondition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Problem3 extends AppCompatActivity {

    EditText Edidtextp3 ;
    TextView Tvdisplayp3;
    Button Buttonp3;

    int num1p3 ;
    String Snum1p3 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem3);

        //=======================================
        Edidtextp3 = findViewById(R.id.edittextp3);
        Tvdisplayp3 = findViewById(R.id.tvdisplayp3);
        Buttonp3 = findViewById(R.id.buttonp3);
        //=======================================


        //===================================================
        Buttonp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Snum1p3 = Edidtextp3.getText().toString();
                num1p3 = Integer.parseInt(Snum1p3);


                if(num1p3 > 0)
                {
                    Tvdisplayp3.setText("Number is POSITIVE");
                }
                if(num1p3 < 0)
                {
                    Tvdisplayp3.setText("Number is NEGATIVE");
                }
                if(num1p3 == 0)
                {
                    Tvdisplayp3.setText("Number is ZERO");
                }


            }
        });
        //=======================================================

    }
}
