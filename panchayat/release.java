package com.example.panchayat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class release extends AppCompatActivity {
    private final int GALLARY_REQ_CODE=1000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_release);


       /* ActivityCompat.requestPermissions(this,
                new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE,
                        Manifest.permission.READ_EXTERNAL_STORAGE},
                PackageManager.PERMISSION_GRANTED);
    }
*/

   /* public void buttoncreate(View view){
        Intent intent=new Intent(Intent.ACTION_CREATE_DOCUMENT, MediaStore.Downloads.EXTERNAL_CONTENT_URI);
       // intent.setType("application.pdf");
        Intent.setType("*");
        this.startActivity(intent);
    }

    public void buttonview(View view){
        Intent intent=new Intent(Intent.ACTION_CREATE_DOCUMENT, MediaStore.Downloads.EXTERNAL_CONTENT_URI);
        // intent.setType("application.pdf");
        Intent.setType("*");
        this.startActivity(intent);
    }
    */

     /*   ImageView imGallary = findViewById(R.id.imggal);
        Button btngal = findViewById(R.id.btnGallary);

        btngal.setOnClickListener(new View.OnClickListener() {

            public void onclick(View v) {
                Intent iGallary = new Intent(Intent.ACTION_PICK);
                iGallary.setData(MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(iGallary, GALLARY_REQ_CODE);
            }
        });

      */
    }
}