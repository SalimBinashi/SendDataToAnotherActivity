package com.example.senddatatoanotheractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        String email = intent.getStringExtra("email");
        String password = intent.getStringExtra("password");

        Toast.makeText(this, "Email: "+email +"Password:" +password, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View view) {

    }
}