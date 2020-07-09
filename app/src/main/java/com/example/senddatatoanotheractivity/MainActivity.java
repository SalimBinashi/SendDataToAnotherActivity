package com.example.senddatatoanotheractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText editTemail, editTPassword;
    Button btnLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTemail = findViewById(R.id.editTEmail);
        editTPassword = findViewById(R.id.editTPassword);
        btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        if (view.equals(btnLogin)){
            String email = editTemail.getText().toString().trim();
            String password = editTPassword.getText().toString().trim();

            Intent intent = new Intent(MainActivity.this, HomeActivity.class);
            intent.putExtra("email", email);
            intent.putExtra("password", password);
            startActivity(intent);
        }
    }
}