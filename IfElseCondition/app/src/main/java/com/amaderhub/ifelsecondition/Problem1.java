package com.amaderhub.ifelsecondition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Problem1 extends AppCompatActivity {

    EditText Edidtext1, Edidtext2;
    TextView Tvdisplay1;
    Button Button1;

    int num1, num2;
    String Snum1, Snum2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem1);


        //=======================================
        Edidtext1 = findViewById(R.id.edittex1);
        Edidtext2 = findViewById(R.id.edittext2);
        Tvdisplay1 = findViewById(R.id.tvdisplay1);
        Button1 = findViewById(R.id.button1);
        //=======================================


        //===================================================
        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Snum1 = Edidtext1.getText().toString();
                Snum2 = Edidtext2.getText().toString();
                num1 = Integer.parseInt(Snum1);
                num2 = Integer.parseInt(Snum2);


                if (num1 > num2) {
                    Tvdisplay1.setText( num1 + " is Maximum between " + num1 + " and " + num2);
                } else {
                    Tvdisplay1.setText( num2 + " is Maximum between " + num1 + " and " + num2);
                }


            }
        });
        //=======================================================





    }
}
