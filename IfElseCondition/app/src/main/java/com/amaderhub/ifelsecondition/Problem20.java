package com.amaderhub.ifelsecondition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Problem20 extends AppCompatActivity {

    EditText Edidtextp20 ;
    TextView Tvdisplayp20;
    Button Buttonp20;

    float basic, gross, da, hra;
    String Snum1p20 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem20);


        //=======================================
        Edidtextp20 = findViewById(R.id.edittextp20);
        Tvdisplayp20 = findViewById(R.id.tvdisplayp20);
        Buttonp20 = findViewById(R.id.buttonp20);
        //=======================================


        //===================================================
        Buttonp20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Snum1p20 = Edidtextp20.getText().toString();
                basic = Float.parseFloat(Snum1p20);

                if(basic <= 10000)
                {
                    da  = (float) (basic * 0.8);
                    hra = (float) (basic * 0.2);
                }
                else if(basic <= 20000)
                {
                    da  = (float) (basic * 0.9);
                    hra = (float) (basic * 0.25);
                }
                else
                {
                    da  = (float) (basic * 0.95);
                    hra = (float) (basic * 0.3);
                }

                /* Calculate gross salary */
                gross = basic + hra + da;

                Tvdisplayp20.setText("GROSS SALARY OF EMPLOYEE = " + gross);


                



            }
        });
        //=======================================================
        
        
    }
}
