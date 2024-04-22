package com.thatsnajmul.stockimages;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.net.URL;

public class MainActivity extends AppCompatActivity {

    ImageView Image1;
    ImageView Image2;
    ImageView Image3;
    ImageView Image4;
    ImageView Image5;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       Image1 = findViewById(R.id.image1);
       Image2 = findViewById(R.id.image2);
       Image3 = findViewById(R.id.image3);
       Image4 = findViewById(R.id.image4);
       Image5 = findViewById(R.id.image5);

        Picasso.get().load("https://cdn.pixabay.com/photo/2023/01/27/04/53/muslim-7747745_960_720.png").into(Image1);
        Picasso.get().load("https://cdn.pixabay.com/photo/2023/01/18/13/09/camera-7726802_960_720.jpg").into(Image2);
        Picasso.get().load("https://cdn.pixabay.com/photo/2016/01/09/18/27/camera-1130731_960_720.jpg").into(Image3);
        Picasso.get().load("https://cdn.pixabay.com/photo/2014/07/31/22/50/photographer-407068_960_720.jpg").into(Image4);
        Picasso.get().load("https://cdn.pixabay.com/photo/2014/07/31/23/28/woman-407168_960_720.jpg").into(Image5);

        Image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //code
                WebImageView.web_image_url= "https://cdn.pixabay.com/photo/2023/01/27/04/53/muslim-7747745_960_720.png";
                Intent myIntent = new Intent(MainActivity.this, WebImageView.class);
                startActivity(myIntent);
            }
        });

        Image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //code
                WebImageView.web_image_url= "https://cdn.pixabay.com/photo/2023/01/18/13/09/camera-7726802_960_720.jpg";
                Intent myIntent = new Intent(MainActivity.this, WebImageView.class);
                startActivity(myIntent);
            }
        });

        Image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //code
                WebImageView.web_image_url= "https://cdn.pixabay.com/photo/2016/01/09/18/27/camera-1130731_960_720.jpg";
                Intent myIntent = new Intent(MainActivity.this, WebImageView.class);
                startActivity(myIntent);
            }
        });

        Image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //code
                WebImageView.web_image_url= "https://cdn.pixabay.com/photo/2014/07/31/22/50/photographer-407068_960_720.jpg";
                Intent myIntent = new Intent(MainActivity.this, WebImageView.class);
                startActivity(myIntent);
            }
        });

        Image5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //code
                WebImageView.web_image_url= "https://cdn.pixabay.com/photo/2014/07/31/23/28/woman-407168_960_720.jpg";
                Intent myIntent = new Intent(MainActivity.this, WebImageView.class);
                startActivity(myIntent);
            }
        });

    }
}