package com.amaderhub.ifelsecondition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Problem13 extends AppCompatActivity {

    EditText Edidtextp13 ;
    TextView Tvdisplayp13;
    Button Buttonp13;

    int num1p13 ;
    int note500 = 0, note100 = 0, note50 = 0, note20 = 0, note10 = 0, note5 = 0, note2 = 0, note1 = 0;
    String Snum1p13 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem13);



        //=======================================
        Edidtextp13 = findViewById(R.id.edittextp13);
        Tvdisplayp13 = findViewById(R.id.tvdisplayp13);
        Buttonp13 = findViewById(R.id.buttonp13);
        //=======================================


        Buttonp13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Snum1p13 = Edidtextp13.getText().toString();
                num1p13 = Integer.parseInt(Snum1p13);



                if(num1p13 >= 500)
                {
                    note500 = num1p13/500;
                    num1p13 -= note500 * 500;
                }
                if(num1p13 >= 100)
                {
                    note100 = num1p13/100;
                    num1p13 -= note100 * 100;
                }
                if(num1p13 >= 50)
                {
                    note50 = num1p13/50;
                    num1p13 -= note50 * 50;
                }
                if(num1p13 >= 20)
                {
                    note20 = num1p13/20;
                    num1p13 -= note20 * 20;
                }
                if(num1p13 >= 10)
                {
                    note10 = num1p13/10;
                    num1p13 -= note10 * 10;
                }
                if(num1p13 >= 5)
                {
                    note5 = num1p13/5;
                    num1p13 -= note5 * 5;
                }
                if(num1p13 >= 2)
                {
                    note2 = num1p13 /2;
                    num1p13 -= note2 * 2;
                }
                if(num1p13 >= 1)
                {
                    note1 = num1p13;
                }

                Tvdisplayp13.setText("You have: \n " + note500 + " is 500 taka note \n "
                        + note100 + " is 100 taka note \n "
                        + note50 + " is 50 taka note \n "
                        + note20 + " is 20 taka note \n "
                        + note10 + " is 10 taka note \n "
                        + note5 + " is 5 taka note \n "
                        + note2 + " is 2 taka note \n "
                        + note1 + " is 1 taka note \n ");



            }
        });
        //=======================================================
        
        
        
        
    }
}
