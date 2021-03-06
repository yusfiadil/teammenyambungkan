package com.futsal2.futsal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText etUsername = (EditText) findViewById(R.id.etUsername);
        final EditText etPassword = (EditText) findViewById(R.id.etPassword);
        final Button bSignIn = (Button) findViewById(R.id.bSignIn);
        final TextView RegisterLink = (TextView) findViewById(R.id.tvRegisterLink);

        RegisterLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent RegisterIntent = new Intent(LoginActivity.this, RegisterActivity.class);
                LoginActivity.this.startActivity(RegisterIntent);
            }
        });

    }
}
