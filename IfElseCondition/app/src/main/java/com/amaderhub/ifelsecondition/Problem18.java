package com.amaderhub.ifelsecondition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Problem18 extends AppCompatActivity {


    EditText Edidtext1p18, Edidtext2p18, Edidtext3p18 ;
    TextView Tvdisplayp18;
    Button Buttonp18;

    int cp ,sp ,amt ;
    String Snum1p18, Snum2p18, Snum3p18 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem18);

        //=======================================
        Edidtext1p18 = findViewById(R.id.edittext1p18);
        Edidtext2p18 = findViewById(R.id.edittext2p18);
        Tvdisplayp18 = findViewById(R.id.tvdisplayp18);
        Buttonp18 = findViewById(R.id.buttonp18);
        //=======================================


        Buttonp18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Snum1p18 = Edidtext1p18.getText().toString();
                Snum2p18 = Edidtext2p18.getText().toString();
                cp = Integer.parseInt(Snum1p18);
                sp = Integer.parseInt(Snum2p18);


                if(sp > cp)
                {
                    /* Calculate Profit */
                    amt = sp - cp;
                    Tvdisplayp18.setText("Profit = " + amt);
                }
                else if(cp > sp)
                {
                    /* Calculate Loss */
                    amt = cp - sp;
                    Tvdisplayp18.setText("Loss = " + amt);
                }
                else
                {
                    /* Neither profit nor loss */
                    Tvdisplayp18.setText("No Profit No Loss.");
                }


            }
        });
        //=======================================================
        
        
    }
}
