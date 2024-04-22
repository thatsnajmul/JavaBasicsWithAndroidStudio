package com.amaderhub.ifelsecondition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Problem21 extends AppCompatActivity {

    EditText Edidtextp21 ;
    TextView Tvdisplayp21;
    Button Buttonp21;

    int unit;
    float amt, total_amt, sur_charge;
    String Snum1p21 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem21);


        //=======================================
        Edidtextp21 = findViewById(R.id.edittextp21);
        Tvdisplayp21 = findViewById(R.id.tvdisplayp21);
        Buttonp21 = findViewById(R.id.buttonp21);
        //=======================================


        //===================================================
        Buttonp21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Snum1p21 = Edidtextp21.getText().toString();
                unit = Integer.parseInt(Snum1p21);


                if(unit <= 50)
                {
                    amt = (float) (unit * 0.50);
                }
                else if(unit <= 150)
                {
                    amt = (float) (25 + ((unit-50) * 0.75));
                }
                else if(unit <= 250)
                {
                    amt = (float) (100 + ((unit-150) * 1.20));
                }
                else
                {
                    amt = (float) (220 + ((unit-250) * 1.50));
                }

                /*
                 * Calculate total electricity bill
                 * after adding surcharge
                 */
                sur_charge = (float) (amt * 0.20);
                total_amt  = amt + sur_charge;

                Tvdisplayp21.setText("Electricity Bill = Rs. " + total_amt);

            }
        });
        //=======================================================


    }
}
