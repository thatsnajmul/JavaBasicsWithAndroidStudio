package com.amaderhub.ifelsecondition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Problem7 extends AppCompatActivity {

    EditText Edidtextp7 ;
    TextView Tvdisplayp7;
    Button Buttonp7;

    int num1p7 ;
    String Snum1p7 ;
    char ch1;
    
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem7);


        //=======================================
        Edidtextp7 = findViewById(R.id.edittextp7);
        Tvdisplayp7 = findViewById(R.id.tvdisplayp7);
        Buttonp7 = findViewById(R.id.buttonp7);
        //=======================================


        //===================================================
        Buttonp7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Snum1p7 = Edidtextp7.getText().toString();
                ch1 = Snum1p7.charAt(0);


                if((ch1 >= 'a' && ch1 <= 'z') || (ch1 >= 'A' && ch1 <= 'Z'))
                {
                    Tvdisplayp7.setText("Character is an ALPHABET.");
                }
                else
                {
                    Tvdisplayp7.setText("Character is NOT ALPHABET.");
                }


            }
        });
        //=======================================================
        
        
    }
}
