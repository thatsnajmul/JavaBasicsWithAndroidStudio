package com.example.thumbdownloader;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.media.Image;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText edYouTubeLink;
    Button bLoad, buttonSave;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edYouTubeLink= findViewById(R.id.edYouTubeLink);
        bLoad = findViewById(R.id.bLoad);
        imageView = findViewById(R.id.imageView);
        buttonSave = findViewById(R.id.buttonSave);

        bLoad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String originalLink = edYouTubeLink.getText().toString();
                //https://www.youtube.com/watch?v=rrj9yiHrKc4
                //https://youtu.be/rrj9yiHrKc4

                String video_id = "";

                if (originalLink.contains("v=")){
                    video_id = originalLink.split("v=") [1];
                }
                else if (originalLink.contains("youtu.be/")){
                    video_id = originalLink.split("youtu.be/") [1];
                }else{
                    video_id = originalLink;
                }

                String thLink = "https://img.youtube.com/vi/" +video_id+"/0.jpg";

                Picasso.get().load(thLink).into(imageView);



            }
        });


        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if ( isStoragePermissionGranted() ){
                    Bitmap bitmap = ((BitmapDrawable)imageView.getDrawable()).getBitmap();
                    saveImage(bitmap);
                }

            }
        });





    }


    //==============================================================




    //===================================================================
    //===================================================================
    public  boolean isStoragePermissionGranted() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (checkSelfPermission(android.Manifest.permission.WRITE_EXTERNAL_STORAGE)
                    == PackageManager.PERMISSION_GRANTED) {
                Log.v("permissionIssue","Permission is granted");
                return true;
            } else {

                Log.v("permissionIssue","Permission is revoked");
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1);
                return false;
            }
        }
        else { //permission is automatically granted on sdk<23 upon installation
            Log.v("permissionIssue","Permission is granted");
            return true;
        }
    }





    //===================================================================
    //===================================================================
    private void saveImage(Bitmap finalBitmap) {
        String folderName = "YT Thumbnail";
        String root = Environment.getExternalStoragePublicDirectory(
                Environment.DIRECTORY_PICTURES).toString();

        File myDir = new File(root + "/"+folderName);
        myDir.mkdirs();

        Random generator = new Random();

        int n = 10000;
        n = generator.nextInt(n);
        String fname = "Image-"+ n +".jpg";
        File file = new File (myDir, fname);
        if (file.exists ()) file.delete ();
        try {
            FileOutputStream out = new FileOutputStream(file);
            finalBitmap.compress(Bitmap.CompressFormat.JPEG, 90, out);
            out.flush();
            out.close();
            Toast.makeText(getApplicationContext(), "Download Done!", Toast.LENGTH_SHORT).show();

        } catch (Exception e) {
            Log.d("storageException", e.toString());
            e.printStackTrace();
        }
        // Tell the media scanner about the new file so that it is
        // immediately available to the user.
        MediaScannerConnection.scanFile(this, new String[]{file.toString()}, null,
                new MediaScannerConnection.OnScanCompletedListener() {
                    public void onScanCompleted(String path, Uri uri) {
                        Log.i("ExternalStorage", "Scanned " + path + ":");
                        Log.i("ExternalStorage", "-> uri=" + uri);
                    } });
    }

    //================>>>>>>> End of saveImage method
    //================>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>






}