package com.amaderhub.ifelsecondition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Problem19 extends AppCompatActivity {

    EditText Edidtext1p19, Edidtext2p19, Edidtext3p19, Edidtext4p19, Edidtext5p19 ;
    TextView Tvdisplayp19;
    Button Buttonp19;

    int phy, chem, bio, math, comp;
    float per;
    String Snum1p19, Snum2p19, Snum3p19, Snum4p19, Snum5p19 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem19);


        //=======================================
        Edidtext1p19 = findViewById(R.id.edittext1p19);
        Edidtext2p19 = findViewById(R.id.edittext2p19);
        Edidtext3p19 = findViewById(R.id.edittext3p19);
        Edidtext4p19 = findViewById(R.id.edittext4p19);
        Edidtext5p19 = findViewById(R.id.edittext5p19);
        Tvdisplayp19 = findViewById(R.id.tvdisplayp19);
        Buttonp19 = findViewById(R.id.buttonp19);
        //=======================================


        Buttonp19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Snum1p19 = Edidtext1p19.getText().toString();
                Snum2p19 = Edidtext2p19.getText().toString();
                Snum3p19 = Edidtext3p19.getText().toString();
                Snum4p19 = Edidtext4p19.getText().toString();
                Snum5p19 = Edidtext5p19.getText().toString();

                phy = Integer.parseInt(Snum1p19);
                chem = Integer.parseInt(Snum2p19);
                bio = Integer.parseInt(Snum3p19);
                math = Integer.parseInt(Snum4p19);
                comp = Integer.parseInt(Snum5p19);


                per = (float) ((phy + chem + bio + math + comp) / 5.0);
                Tvdisplayp19.setText("Percentage = " + per);

                if(per >= 90 && per <=100)
                {
                    Tvdisplayp19.setText("Grade A");
                }
                else if(per >= 80)
                {
                    Tvdisplayp19.setText("Grade B");
                }
                else if(per >= 70)
                {
                    Tvdisplayp19.setText("Grade C");
                }
                else if(per >= 60)
                {
                    Tvdisplayp19.setText("Grade D");
                }
                else if(per >= 40)
                {
                    Tvdisplayp19.setText("Grade E");
                }
                else
                {
                    Tvdisplayp19.setText("Grade F");
                }




            }
        });
        //=======================================================
        
        
        
    }
}
