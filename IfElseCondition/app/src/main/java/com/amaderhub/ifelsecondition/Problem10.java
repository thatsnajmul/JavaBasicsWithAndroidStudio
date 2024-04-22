package com.amaderhub.ifelsecondition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Problem10 extends AppCompatActivity {


    EditText Edidtextp10 ;
    TextView Tvdisplayp10;
    Button Buttonp10;

    int num1p10 ;
    String Snum1p10 ;
    char ch4;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem10);


        //=======================================
        Edidtextp10 = findViewById(R.id.edittextp10);
        Tvdisplayp10 = findViewById(R.id.tvdisplayp10);
        Buttonp10 = findViewById(R.id.buttonp10);
        //=======================================


        //===================================================
        Buttonp10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Snum1p10 = Edidtextp10.getText().toString();
                ch4 = Snum1p10.charAt(0);



                if(ch4 >= 'A' && ch4 <= 'Z')
                {
                    Tvdisplayp10.setText(ch4 + " is uppercase alphabet.");
                }
                else if(ch4 >= 'a' && ch4 <= 'z')
                {
                    Tvdisplayp10.setText(ch4 + " is lowercase alphabet.");
                }
                else
                {
                    Tvdisplayp10.setText(ch4 + " is not an alphabet.");
                }



            }
        });
        //=======================================================
        
        
    }
}
