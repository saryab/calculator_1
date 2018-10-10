package com.example.system.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        try
        {
            TextView answer;
            answer = findViewById(R.id.ans);
            answer.setText(Objects.requireNonNull(getIntent().getExtras()).getString("key"));
        }
        catch(Exception e)
        {
            Toast.makeText(this,"Exception Raised", Toast.LENGTH_SHORT).show();
        }
    }
}
