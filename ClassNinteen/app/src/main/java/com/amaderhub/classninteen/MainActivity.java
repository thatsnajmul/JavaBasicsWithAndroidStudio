package com.amaderhub.classninteen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView Tview;
    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Tview = findViewById(R.id.tview);

        for (count= 1 ; count<= 10000 ; count++) {

            Tview.append(""+count);
        }

        //End Of Loop
    }
}
