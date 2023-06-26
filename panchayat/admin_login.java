package com.example.panchayat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class admin_login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);


        Button btn1 = findViewById(R.id.lgn_btn);
       btn1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               String userName = "admin";
               String password = "admin123";

               String enteredUserName = ((EditText) findViewById(R.id.email_text)).getText().toString();
               String enteredPassword = ((EditText) findViewById(R.id.pass_text)).getText().toString();


               if (userName.matches(enteredUserName) && password.matches(enteredPassword)) {

                   Intent myInt = new Intent(admin_login.this, admin_page.class);
                   startActivity(myInt);
               }
           }
       });
       }

}