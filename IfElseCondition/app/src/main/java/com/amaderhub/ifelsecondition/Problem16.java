package com.amaderhub.ifelsecondition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Problem16 extends AppCompatActivity {

    EditText Edidtext1p16, Edidtext2p16, Edidtext3p16 ;
    TextView Tvdisplayp16;
    Button Buttonp16;

    int num1p16, num2p16, num3p16 ;
    String Snum1p16, Snum2p16, Snum3p16 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem16);


        //=======================================
        Edidtext1p16 = findViewById(R.id.edittext1p16);
        Edidtext2p16 = findViewById(R.id.edittext2p16);
        Edidtext3p16 = findViewById(R.id.edittext3p16);
        Tvdisplayp16 = findViewById(R.id.tvdisplayp16);
        Buttonp16 = findViewById(R.id.buttonp16);
        //=======================================


        Buttonp16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Snum1p16 = Edidtext1p16.getText().toString();
                Snum2p16 = Edidtext2p16.getText().toString();
                Snum3p16 = Edidtext3p16.getText().toString();
                num1p16 = Integer.parseInt(Snum1p16);
                num2p16 = Integer.parseInt(Snum2p16);
                num3p16 = Integer.parseInt(Snum3p16);

                if(num1p16==num2p16 && num2p16==num3p16)
                {
                    Tvdisplayp16.setText("Equilateral triangle.");
                }
                else if(num1p16==num2p16 || num1p16==num3p16 || num2p16==num3p16)
                {
                    Tvdisplayp16.setText("Isosceles triangle.");
                }
                else
                {
                    Tvdisplayp16.setText("Scalene triangle.");
                }



            }
        });
        //=======================================================
        


    }
}
