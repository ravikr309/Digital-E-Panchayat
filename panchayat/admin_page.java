package com.example.panchayat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class admin_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_page);
        Button btn4 = findViewById(R.id.get_ISSUES);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myInt = new Intent(admin_page.this, submittion.class);

                admin_page.this.startActivity(myInt);
            }
        });
        Button btn5 = findViewById(R.id.clickhere);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myInt = new Intent(admin_page.this, release.class);

                admin_page.this.startActivity(myInt);
            }
        });
    }
}