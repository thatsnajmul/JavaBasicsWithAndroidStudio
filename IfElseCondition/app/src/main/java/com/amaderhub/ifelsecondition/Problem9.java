package com.amaderhub.ifelsecondition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Problem9 extends AppCompatActivity {

    EditText Edidtextp9 ;
    TextView Tvdisplayp9;
    Button Buttonp9;

    int num1p9 ;
    String Snum1p9 ;
    char ch3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem9);


        //=======================================
        Edidtextp9 = findViewById(R.id.edittextp9);
        Tvdisplayp9 = findViewById(R.id.tvdisplayp9);
        Buttonp9 = findViewById(R.id.buttonp9);
        //=======================================


        //===================================================
        Buttonp9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Snum1p9 = Edidtextp9.getText().toString();
                ch3 = Snum1p9.charAt(0);


                if((ch3 >= 'a' && ch3 <= 'z') || (ch3 >= 'A' && ch3 <= 'Z'))
                {
                    Tvdisplayp9.setText(ch3 + " is alphabet.");
                }
                else if(ch3 >= '0' && ch3 <= '9')
                {
                    Tvdisplayp9.setText(ch3 + " is digit.");
                }
                else
                {
                    Tvdisplayp9.setText(ch3 + " is special character.");
                }


               

            }
        });
        //=======================================================
        
        
    }
}
