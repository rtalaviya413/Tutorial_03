package com.example.tutorial03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtUsername, edtPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtUsername = findViewById(R.id.edtUsername);
        edtPassword = findViewById(R.id.edtPassword);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valUsername = edtUsername.getText().toString();
                String valPassword = edtPassword.getText().toString();

                if(valUsername.equals("admin@gmail.com") && valPassword.equals("admin")) {
                    Intent intent = new Intent(MainActivity.this,Welcome.class);
                    startActivity(intent);

                    Toast.makeText(MainActivity.this, "Logged in Successfully", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "Username or Password is Invalid.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}