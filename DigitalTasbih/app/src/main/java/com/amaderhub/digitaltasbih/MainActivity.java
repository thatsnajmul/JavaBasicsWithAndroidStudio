package com.amaderhub.digitaltasbih;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button goto2ndpage;
    Intent myintent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Go To 2nd Page Area Start
        goto2ndpage=findViewById(R.id.Goto2nd);

        goto2ndpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myintent=new Intent(MainActivity.this, Goto2ndPage.class);
                startActivity(myintent);
            }
        });
        //Go To 2nd Page Area End

        //Digital Tasbeeh Counting Area Start


    }
}
