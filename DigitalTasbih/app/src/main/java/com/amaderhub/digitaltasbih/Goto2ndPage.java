package com.amaderhub.digitaltasbih;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Goto2ndPage extends AppCompatActivity {

    Button Minusbar,Plusbar,Resetbar;
    TextView Countdisplay;
    int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goto2nd_page);

        Minusbar=findViewById(R.id.minusbar);
        Plusbar=findViewById(R.id.plusbar);
        Resetbar=findViewById(R.id.resetbar);
        Countdisplay=findViewById(R.id.countdisplay);

        //Count_Area plus bar
        Plusbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                Countdisplay.setText(""+count);
            }
        });

        //Count_Area Minus bar
        Minusbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count--;
                Countdisplay.setText(""+count);
            }
        });

        //Count_Area Reset bar
        Resetbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count= 0;
                Countdisplay.setText(""+count);
            }
        });


    }
}
