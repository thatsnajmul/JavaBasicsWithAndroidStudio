package com.amaderhub.ifelsecondition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Problem4 extends AppCompatActivity {

    EditText Edidtextp4 ;
    TextView Tvdisplayp4;
    Button Buttonp4;

    int num1p4 ;
    String Snum1p4 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem4);


        //=======================================
        Edidtextp4 = findViewById(R.id.edittextp4);
        Tvdisplayp4 = findViewById(R.id.tvdisplayp4);
        Buttonp4 = findViewById(R.id.buttonp4);
        //=======================================


        //===================================================
        Buttonp4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Snum1p4 = Edidtextp4.getText().toString();
                num1p4 = Integer.parseInt(Snum1p4);

                if((num1p4 % 5 == 0) && (num1p4 % 11 == 0))
                {
                    Tvdisplayp4.setText("Number is divisible by 5 and 11");
                }
                else
                {
                    Tvdisplayp4.setText("Number is not divisible by 5 and 11");
                }



            }
        });
        //=======================================================

    }
}
