package com.amaderhub.ifelsecondition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Problem14 extends AppCompatActivity {


    EditText Edidtext1p14, Edidtext2p14, Edidtext3p14 ;
    TextView Tvdisplayp14;
    Button Buttonp14;

    int num1p14, num2p14, num3p14, sum14 ;
    String Snum1p14, Snum2p14, Snum3p14 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem14);



        //=======================================
        Edidtext1p14 = findViewById(R.id.edittext1p14);
        Edidtext2p14 = findViewById(R.id.edittext2p14);
        Edidtext3p14 = findViewById(R.id.edittext3p14);
        Tvdisplayp14 = findViewById(R.id.tvdisplayp14);
        Buttonp14 = findViewById(R.id.buttonp14);
        //=======================================


        Buttonp14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Snum1p14 = Edidtext1p14.getText().toString();
                Snum2p14 = Edidtext2p14.getText().toString();
                Snum3p14 = Edidtext3p14.getText().toString();
                num1p14 = Integer.parseInt(Snum1p14);
                num2p14 = Integer.parseInt(Snum2p14);
                num3p14 = Integer.parseInt(Snum3p14);

                sum14 = num1p14 + num2p14 + num3p14;





                if(sum14 == 180 && num1p14 > 0 && num2p14 > 0 && num3p14 > 0)
                {
                    Tvdisplayp14.setText("Triangle is valid.");
                }
                else
                {
                    Tvdisplayp14.setText("Triangle is not valid.");
                }




            }
        });
        //=======================================================



    }
}
