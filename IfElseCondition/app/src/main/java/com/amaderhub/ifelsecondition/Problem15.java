package com.amaderhub.ifelsecondition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Problem15 extends AppCompatActivity {



    EditText Edidtext1p15, Edidtext2p15, Edidtext3p15 ;
    TextView Tvdisplayp15;
    Button Buttonp15;

    int num1p15, num2p15, num3p15 ;
    String Snum1p15, Snum2p15, Snum3p15 ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem15);


        //=======================================
        Edidtext1p15 = findViewById(R.id.edittext1p15);
        Edidtext2p15 = findViewById(R.id.edittext2p15);
        Edidtext3p15 = findViewById(R.id.edittext3p15);
        Tvdisplayp15 = findViewById(R.id.tvdisplayp15);
        Buttonp15 = findViewById(R.id.buttonp15);
        //=======================================


        Buttonp15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Snum1p15 = Edidtext1p15.getText().toString();
                Snum2p15 = Edidtext2p15.getText().toString();
                Snum3p15 = Edidtext3p15.getText().toString();
                num1p15 = Integer.parseInt(Snum1p15);
                num2p15 = Integer.parseInt(Snum2p15);
                num3p15 = Integer.parseInt(Snum3p15);

                if((num1p15 + num2p15) > num3p15)
                {
                    if((num2p15 + num3p15) > num1p15)
                    {
                        if((num1p15 + num3p15) > num2p15)
                        {
                            Tvdisplayp15.setText("Triangle is valid.");
                        }
                        else
                        {
                            Tvdisplayp15.setText("Triangle is not valid.");
                        }
                    }
                    else
                    {
                        Tvdisplayp15.setText("Triangle is not valid.");
                    }
                }
                else
                {
                    Tvdisplayp15.setText("Triangle is not valid.");
                }



            }
        });
        //=======================================================


    }
}
