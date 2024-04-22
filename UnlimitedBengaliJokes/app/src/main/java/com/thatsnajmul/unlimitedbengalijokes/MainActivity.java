package com.thatsnajmul.unlimitedbengalijokes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    //Here is data type & Variable Diclare
    Button gopalvar, student_teacher, doctor_patient, love_lover, Boltu, husband_wife, nasiruddin_hoja, mod_matal, button1, button2, button3, button4, button5, button6, button7, button8,
            button9, button10, button11, button12, button13, button14, button15,
            button16, button17, button18, button19, button20;

    Intent myintent = new Intent(MainActivity.this, com.thatsnajmul.unlimitedbengalijokes.StudentTeacherStory.class);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Here is Button Id Meetup Area Start
        gopalvar=findViewById(R.id.gopalvar);
        student_teacher=findViewById(R.id.student_teacher);
        doctor_patient=findViewById(R.id.doctor_patiant);
        love_lover=findViewById(R.id.love_lover);
        Boltu=findViewById(R.id.boltu);
        husband_wife=findViewById(R.id.husband_wife);
        nasiruddin_hoja=findViewById(R.id.nasiruddin_hoja);
        mod_matal=findViewById(R.id.mod_matal);
        button1=findViewById(R.id.button_1);
        button2=findViewById(R.id.button_2);
        button3=findViewById(R.id.button_3);
        button4=findViewById(R.id.button_4);
        button5=findViewById(R.id.button_5);
        button6=findViewById(R.id.button_6);
        button7=findViewById(R.id.button_7);
        button8=findViewById(R.id.button_8);
        button9=findViewById(R.id.button_9);
        button10=findViewById(R.id.button_10);
        button11=findViewById(R.id.button_11);
        button12=findViewById(R.id.button_12);
        button13=findViewById(R.id.button_13);
        button14=findViewById(R.id.button_14);
        button15=findViewById(R.id.button_15);
        button16=findViewById(R.id.button_16);
        button17=findViewById(R.id.button_17);
        button18=findViewById(R.id.button_18);
        button19=findViewById(R.id.button_19);
        button20=findViewById(R.id.button_20);
        //Here is Button Id Meetup Area End

        //Gopalvar Go To GopalvarStory Start
        gopalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myintent=new Intent(MainActivity.this, com.thatsnajmul.unlimitedbengalijokes.GopalvarStory.class);
                startActivity(myintent);
            }
        });
        //Gopalvar Go To GopalvarStory End

        //Student Teacher Go To StudentTeacherStory Start
        student_teacher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myintent=new Intent(MainActivity.this,
                        com.thatsnajmul.unlimitedbengalijokes.StudentTeacherStory.class);
                startActivity(myintent);
            }
        });
        //Student Teacher Go To StudentTeacherStory End


        //doctor_patient Go To DoctorPatientStory Start
        doctor_patient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myintent=new Intent(MainActivity.this, com.thatsnajmul.unlimitedbengalijokes.DoctorPatientStory.class);
                startActivity(myintent);
            }
        });
        //doctor_patient Go To DoctorPatientStory End

        //love_lover Go To Love_Lover_Story Start
        love_lover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myintent=new Intent(MainActivity.this, com.thatsnajmul.unlimitedbengalijokes.Love_Lover_Story.class);
                startActivity(myintent);
            }
        });
        //love_lover Go To Love_Lover_Story End

        //Boltu Go To Boltu_Story Start
        Boltu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myintent=new Intent(MainActivity.this, com.thatsnajmul.unlimitedbengalijokes.Boltu_Story.class);
                startActivity(myintent);
            }
        });
        //Boltu Go To Boltu_Story End

        //husband_wife Go To HusbandWifeStory Start
        husband_wife.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myintent=new Intent(MainActivity.this, com.thatsnajmul.unlimitedbengalijokes.HusbandWifeStory.class);
                startActivity(myintent);
            }
        });
        //husband_wife Go To HusbandWifeStory End

        //nasiruddin_hoja Go To NasiruddinHojaStory Start
        nasiruddin_hoja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myintent=new Intent(MainActivity.this, com.thatsnajmul.unlimitedbengalijokes.NasiruddinHojaStory.class);
                startActivity(myintent);
            }
        });
        //nasiruddin_hoja Go To NasiruddinHojaStory End

        //mod_matal Go To Boltu_Story Start
        mod_matal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myintent=new Intent(MainActivity.this, com.thatsnajmul.unlimitedbengalijokes.ModMatalStory.class);
                startActivity(myintent);
            }
        });
        //mod_matal Go To ModMatalStory End


                //Divided Section


        //Button1 Go To UnlimitedStoryPage1 Start
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myintent=new Intent(MainActivity.this, com.thatsnajmul.unlimitedbengalijokes.UnlimitedStoryPage1.class);
                startActivity(myintent);
            }
        });
        //Button1 Go To UnlimitedStoryPage1 End

        //Button2 Go To UnlimitedStoryPage2 Start
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myintent=new Intent(MainActivity.this, com.thatsnajmul.unlimitedbengalijokes.UnlimitedStoryPage2.class);
                startActivity(myintent);
            }
        });
        //Button2 Go To UnlimitedStoryPage2 End

        //Button3 Go To UnlimitedStoryPage3 Start
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myintent=new Intent(MainActivity.this,UnlimitedStoryPage3.class);
                startActivity(myintent);
            }
        });
        //Button3 Go To UnlimitedStoryPage3 End

        //Button4 Go To UnlimitedStoryPage4 Start
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myintent=new Intent(MainActivity.this, com.thatsnajmul.unlimitedbengalijokes.UnlimitedStoryPage4.class);
                startActivity(myintent);
            }
        });
        //Button4 Go To UnlimitedStoryPage4 End

        //Button5 Go To UnlimitedStoryPage5 Start
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myintent=new Intent(MainActivity.this, com.thatsnajmul.unlimitedbengalijokes.UnlimitedStoryPage5.class);
                startActivity(myintent);
            }
        });
        //Button5 Go To UnlimitedStoryPage5 End

        //Button6 Go To UnlimitedStoryPage6 Start
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myintent=new Intent(MainActivity.this,UnlimitedStoryPage6.class);
                startActivity(myintent);
            }
        });
        //Button6 Go To UnlimitedStoryPage6 End

        //Button7 Go To UnlimitedStoryPage7 Start
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myintent=new Intent(MainActivity.this, com.thatsnajmul.unlimitedbengalijokes.UnlimitedStoryPage7.class);
                startActivity(myintent);
            }
        });
        //Button7 Go To UnlimitedStoryPage7 End

        //Button8 Go To UnlimitedStoryPage8 Start
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myintent=new Intent(MainActivity.this, com.thatsnajmul.unlimitedbengalijokes.UnlimitedStoryPage8.class);
                startActivity(myintent);
            }
        });
        //Button8 Go To UnlimitedStoryPage8 End

        //Button9 Go To UnlimitedStoryPage9 Start
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myintent=new Intent(MainActivity.this,UnlimitedStoryPage9.class);
                startActivity(myintent);
            }
        });
        //Button9 Go To UnlimitedStoryPage9 End

        //Button10 Go To UnlimitedStoryPage10 Start
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myintent=new Intent(MainActivity.this, com.thatsnajmul.unlimitedbengalijokes.UnlimitedStoryPage10.class);
                startActivity(myintent);
            }
        });
        //Button10 Go To UnlimitedStoryPage10 End

        //Button11 To UnlimitedStoryPage11 Start
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myintent=new Intent(MainActivity.this,UnlimitedStoryPage11.class);
                startActivity(myintent);
            }
        });
        //Button11 Go To UnlimitedStoryPage11 End

        //Button12 Go To UnlimitedStoryPage12 Start
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myintent=new Intent(MainActivity.this,UnlimitedStoryPage12.class);
                startActivity(myintent);
            }
        });
        //Button12 Go To UnlimitedStoryPage12 End

        //Button13 Go To UnlimitedStoryPage13 Start
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myintent=new Intent(MainActivity.this, com.thatsnajmul.unlimitedbengalijokes.UnlimitedStoryPage13.class);
                startActivity(myintent);
            }
        });
        //Button13 Go To UnlimitedStoryPage13 End

        //Button14 Go To UnlimitedStoryPage14 Start
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myintent=new Intent(MainActivity.this,UnlimitedStoryPage14.class);
                startActivity(myintent);
            }
        });
        //Button14 Go To UnlimitedStoryPage14 End

        //Button15 Go To UnlimitedStoryPage15 Start
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myintent=new Intent(MainActivity.this, com.thatsnajmul.unlimitedbengalijokes.UnlimitedStoryPage15.class);
                startActivity(myintent);
            }
        });
        //Button15 Go To UnlimitedStoryPage15 End

        //Button16 Go To UnlimitedStoryPage16 Start
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myintent=new Intent(MainActivity.this, com.thatsnajmul.unlimitedbengalijokes.UnlimitedStoryPage16.class);
                startActivity(myintent);
            }
        });
        //Button16 Go To UnlimitedStoryPage16 End

        //Button17 Go To UnlimitedStoryPage17 Start
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myintent=new Intent(MainActivity.this, com.thatsnajmul.unlimitedbengalijokes.UnlimitedStoryPage17.class);
                startActivity(myintent);
            }
        });
        //Button17 Go To UnlimitedStoryPage17 End

        //Button18 Go To UnlimitedStoryPage18 Start
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myintent=new Intent(MainActivity.this,UnlimitedStoryPage18.class);
                startActivity(myintent);
            }
        });
        //Button18 Go To UnlimitedStoryPage18 End

        //Button19 Go To UnlimitedStoryPage19 Start
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myintent=new Intent(MainActivity.this, com.thatsnajmul.unlimitedbengalijokes.UnlimitedStoryPage19.class);
                startActivity(myintent);
            }
        });
        //Button19 Go To UnlimitedStoryPage19 End

        //Button20 Go To UnlimitedStoryPage20Start
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myintent=new Intent(MainActivity.this,UnlimitedStoryPage20.class);
                startActivity(myintent);
            }
        });
        //Button20 Go To UnlimitedStoryPage20 End

        //Google Ads Start

        //Google Ads End

        //Here Is Java Code Ending Area
    }
}
