package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText uname=findViewById(R.id.username);
        EditText pwd=findViewById(R.id.password);
        Button lbtn=(Button) findViewById(R.id.login);
        lbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(uname.getText().toString().equals("sriya") && pwd.getText().toString().equals("sriya")){
                    Toast.makeText(MainActivity.this,"LOGIN SUCCESSFULL",Toast.LENGTH_SHORT).show();


                }
                else{
                    Toast.makeText(MainActivity.this,"LOGIN FAILED",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}