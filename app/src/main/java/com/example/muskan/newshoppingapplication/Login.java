package com.example.muskan.newshoppingapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText email_add = (EditText)findViewById(R.id.email);
    EditText pass = (EditText)findViewById(R.id.password);
    Button btn_login = (Button)findViewById(R.id.login);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
       final String em = email_add.getText().toString();

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!emailPattern.matches(em))
                {
                    Toast.makeText(getApplicationContext(),"Invalid email address",Toast.LENGTH_SHORT);
                }
                else if(!(pass.getText().toString().matches("1234")))
                {
                    Toast.makeText(getApplicationContext(),"Invalid password", Toast.LENGTH_SHORT);
                }
                else
                {
                    Intent intent = new Intent(Login.this, Listitems.class);
                    startActivity(intent);
                }
            }
        });
    }
}
