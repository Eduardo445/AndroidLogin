package edu.csumb.esotorodriguez.androidlogin;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Welcome extends AppCompatActivity {

    TextView userClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_page);

        userClear = findViewById(R.id.tvUser);
        userClear.setText(MainActivity.name);
    }

    public static Intent getIntent(Context context, int value) {
        Intent intent = new Intent(context, MainActivity.class);
        intent.putExtra("INTENT_EXTRA_VALUE", value);
        return intent;
    }
}
