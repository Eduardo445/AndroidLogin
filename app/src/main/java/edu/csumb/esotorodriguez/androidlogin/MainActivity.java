package edu.csumb.esotorodriguez.androidlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.*;

public class MainActivity extends AppCompatActivity {

    public static HashMap<String, String> people = new HashMap<>();
    public static String name;
    public String secret;

    public MainActivity() {
        people.put("SamusAran", "SuperMetroid");
        people.put("Sonic06", "Tragedy=(");
        people.put("RockMan", "MMX");
        people.put("SMW1990", "GoodGame");
        people.put("AdvanceWars", "12+Years");
    }

    EditText user;
    EditText pass;
    Button log;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = findViewById(R.id.username);
        pass = findViewById(R.id.password);
        log = findViewById(R.id.btnLog);

        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name = user.getText().toString();
                secret = pass.getText().toString();
                Boolean userPassed = checkUsername(name);
                Boolean passPassed = false;


                if (!userPassed) {
                    Toast.makeText(MainActivity.this, "Username is Incorrect", Toast.LENGTH_LONG).show();
                    user.setError("Username");
                } else {
                    passPassed = checkPassword(secret);
                    if (!passPassed) {
                        pass.setError("Password");
                        Toast.makeText(MainActivity.this, "Password is Incorrect", Toast.LENGTH_LONG).show();
                    }
                }

                if (userPassed && passPassed) {
                    Intent intent = Welcome.getIntent(getApplicationContext(), 42);
                    startActivity(intent);
                }
            }
        });
    }

    public static boolean checkUsername(String userValue) {
        if (people.containsKey(userValue)) {
            return true;
        }
        return false;
    }

    public static boolean checkPassword(String passValue) {
        if (people.get(name).equals(passValue)) {
            return true;
        }
        return false;
    }
}