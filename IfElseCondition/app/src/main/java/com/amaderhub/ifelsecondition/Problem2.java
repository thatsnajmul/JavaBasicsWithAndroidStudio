package com.amaderhub.ifelsecondition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Problem2 extends AppCompatActivity {

    EditText Edidtext3, Edidtext4, Edidtext5;
    TextView Tvdisplay2;
    Button Button2;

    int num3, num4, num5;
    String Snum3, Snum4, Snum5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem2);


        //=======================================
        Edidtext3 = findViewById(R.id.edittext3);
        Edidtext4 = findViewById(R.id.edittext4);
        Edidtext5 = findViewById(R.id.edittext5);
        Tvdisplay2 = findViewById(R.id.tvdisplay2);
        Button2 = findViewById(R.id.button2);
        //=======================================


        //===================================================
        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Snum3 = Edidtext3.getText().toString();
                Snum4 = Edidtext4.getText().toString();
                Snum5 = Edidtext5.getText().toString();
                num3 = Integer.parseInt(Snum3);
                num4 = Integer.parseInt(Snum4);
                num5 = Integer.parseInt(Snum5);


                if(num3 > num4)
                {
                    if(num3 > num5)
                    {
                        Tvdisplay2.setText(num3 + " Is Max number ");
                    }
                    else
                    {
                        Tvdisplay2.setText(num5 + " Is Max number ");
                    }
                }
                else
                {
                    if(num4 > num5)
                    {
                        Tvdisplay2.setText(num4 + " Is Max number ");
                    }
                    else
                    {
                        Tvdisplay2.setText(num5 + " Is Max number ");
                    }
                }


            }
        });
        //=======================================================


    }
}
