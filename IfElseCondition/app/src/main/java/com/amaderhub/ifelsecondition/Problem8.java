package com.amaderhub.ifelsecondition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Problem8 extends AppCompatActivity {


    EditText Edidtextp8 ;
    TextView Tvdisplayp8;
    Button Buttonp8;

    int num1p8 ;
    String Snum1p8 ;
    char ch2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem8);



        //=======================================
        Edidtextp8 = findViewById(R.id.edittextp8);
        Tvdisplayp8 = findViewById(R.id.tvdisplayp8);
        Buttonp8 = findViewById(R.id.buttonp8);
        //=======================================


        //===================================================
        Buttonp8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Snum1p8 = Edidtextp8.getText().toString();
                ch2 = Snum1p8.charAt(0);

                if(ch2=='a' || ch2=='e' || ch2=='i' || ch2=='o' || ch2=='u' ||
                        ch2=='A' || ch2=='E' || ch2=='I' || ch2=='O' || ch2=='U')
                {
                    Tvdisplayp8.setText(ch2 + " is Vowel.");
                }
                else if((ch2 >= 'a' && ch2 <= 'z') || (ch2 >= 'A' && ch2 <= 'Z'))
                {
                    Tvdisplayp8.setText(ch2 + " is Consonant.");
                }
                else
                {
                    Tvdisplayp8.setText(ch2 + " is not an alphabet.");
                }



            }
        });
        //=======================================================

        
        
    }
}
