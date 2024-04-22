package com.najmul.learnandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button daynone;
    Button daytwo;
    Button daythree;
    Button dayfour;
    Button dayfive;
    Button daysix;
    Button daysaven;
    Button dayeight;
    TextView dayonetext;
    TextView daytwotext;
    TextView daythreetext;
    TextView dayfourtext;
    TextView dayfivetext;
    TextView daysixtext;
    TextView daysaventext;
    TextView dayeighttext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //This Is Button One Area
        daynone=findViewById(R.id.dayone);
        dayonetext=findViewById(R.id.dayonetext);

        daynone.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View v) {
                dayonetext.setText("কেমন আছেন সবাই? আমরা বর্তমানে সবাই করোনা পরিস্থিতির মধ্যে গৃহবন্দী সময় কাটাচ্ছি। তাই আমি আপনাদের কথা চিন্তা করে ফ্রিতে অ্যান্ড্রয়েড অ্যাপ ডেভলপমেন্ট শেখানোর চিন্তা করেছি...এই সেক্টরটি অনেক সম্ভাবনাময় একটি সেক্টর। আপনাদের যদি মাইন্ডসেট ঠিক রাখতে পারেন তাহলে আপনারা এই সেক্টরে ভালো করতে পারবেন। ");
            }
        });

        dayonetext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                daynone.setText("Day One Complete");
            }
        });
        //This Is Button Two Area
        daytwo=findViewById(R.id.daytwo);
        daytwotext=findViewById(R.id.daytwotext);

        daytwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                daytwotext.setText("Content Is Comming Son... Thank You!");
            }
        });

        daytwotext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                daytwo.setText("Day Two Complete");
            }
        });
        //This Is Button Three Area
        daythree=findViewById(R.id.daythree);
        daythreetext=findViewById(R.id.daythreetext);

        daythree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                daythreetext.setText("Content Is Comming Son... Thank You!");
            }
        });

        daythreetext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                daythree.setText("Day Three Complete");
            }
        });
        //This Is Button Four Area
        dayfour=findViewById(R.id.dayfour);
        dayfourtext=findViewById(R.id.dayfourtext);

        dayfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dayfourtext.setText("Content Is Comming Son... Thank You!");
            }
        });

        dayfourtext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dayfour.setText("Day Four Complete");
            }
        });
        //This Is Button Five Area
        dayfive=findViewById(R.id.dayfive);
        dayfivetext=findViewById(R.id.dayfivetext);

        dayfive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dayfivetext.setText("Content Is Comming Son... Thank You!");
            }
        });

        dayfivetext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dayfive.setText("Day Five Complete");
            }
        });
        //This Is Button Six Area
        daysix=findViewById(R.id.daysix);
        daysixtext=findViewById(R.id.daysixtext);

        daysix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                daysixtext.setText("Content Is Comming Son... Thank You!");
            }
        });

        daysixtext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                daysix.setText("Day Six Complete");
            }
        });
        //This Is Button Saven Area
        daysaven=findViewById(R.id.daysaven);
        daysaventext=findViewById(R.id.daysaventext);

        daysaven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                daysaventext.setText("Content Is Comming Son... Thank You!");
            }
        });

        daysaventext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                daysaven.setText("Day Saven Complete");
            }
        });
        //This Is Button Eight Area
        dayeight=findViewById(R.id.dayeight);
        dayeighttext=findViewById(R.id.dayeighttext);

        dayeight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dayeighttext.setText("Content Is Comming Son... Thank You!");
            }
        });

        dayeighttext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dayeight.setText("Day Eight Complete");
            }
        });

        //This is end area
    }
}
